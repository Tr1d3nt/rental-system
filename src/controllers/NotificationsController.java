package controllers;

import tasks.*;
import java.sql.*;
import java.util.*;

import interfaces.ObserverNotification;
import interfaces.SubjectNotification;

public class NotificationsController extends DBController implements SubjectNotification {

    private ArrayList<Notifications> notifications = new ArrayList<Notifications>();
    private ArrayList<ObserverNotification> observers = new ArrayList<ObserverNotification>();

    public NotificationsController() {
        initializeConnection();
    }

    public void addNotification(Notifications notification) {

        try {

            String query = "INSERT INTO notifications (renterID, type, bedrooms, bathrooms, furnished, quadrant)"
                    + " VALUES (?, ?, ?, ?, ?, ?)";

            PreparedStatement stmt = dbConnect.prepareStatement(query);

            stmt.setInt(0, notification.getID());
            stmt.setString(1, notification.getType());
            stmt.setInt(2, notification.getBedroom());
            stmt.setInt(3, notification.getBathroom());
            stmt.setString(4, notification.getFurnished());
            stmt.setString(5, notification.getQuadrant());

            notifications.add(notification);
            notifyObservers();

            stmt.execute();
            stmt.close();


            props.add(property);
            notifyObservers();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void getAllNotifications() {

        try {

            Statement stmt;
            ResultSet set;
            String query = "SELECT * FROM notifications";
            stmt = dbConnect.createStatement();
            set = stmt.executeQuery(query);
            while (set.next()) {

                Notifications notif = new Notifications(Integer.toString(set.getInt("bedrooms")),
                        Integer.toString(set.getInt("bathrooms")),
                        set.getString("type"), set.getString("furnished"), set.getString("quadrant"),
                        Integer.toString(set.getInt("renterID")));

                notifications.add(notif);

            }
            notifyObservers();

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    @Override
    public void notifyObservers() {

        for (int i = 0; i < observers.size(); i++) {
            ObserverNotification temp = observers.get(i);
            temp.updateNotifs(notifications);
        }

    }

    @Override
    public void attach(ObserverNotification o) {

        this.observers.add(o);
        o.updateNotifs(notifications);

    }

    @Override
    public void remove(ObserverNotification o) {

        this.observers.remove(o);

    }

    public void initializeConnection() {

        try {

            this.dbConnect = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
            System.out.println("Connection established!\n");
        } catch (SQLException e) {

            e.printStackTrace();

        }
    }

    public void close() {

        try {

            dbConnect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
