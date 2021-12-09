package controllers;

import tasks.*;
import java.sql.*;
import java.util.*;

import interfaces.ObserverNotification;
import interfaces.SubjectNotification;

public class NotificationsController extends DBController implements SubjectNotification {

    private ArrayList<Notifications> notifications = new ArrayList<Notifications>();
    private ArrayList<ObserverNotification> observers = new ArrayList<ObserverNotification>();
    private static int id = 0;

    public NotificationsController() {
        initializeConnection();
        getAllNotifications();
        setID();
    }

    public void addNotification(Notifications notification) {

        try {

            String query = "INSERT INTO notifications (renterID, renterUserName, type, bedrooms, bathrooms, furnished, quadrant, status)"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement stmt = dbConnect.prepareStatement(query);

            stmt.setInt(1, id);
            stmt.setString(2, notification.getRenterUserName());
            stmt.setString(3, notification.getType());
            stmt.setInt(4, notification.getBedroom());
            stmt.setInt(5, notification.getBathroom());
            stmt.setString(6, notification.getFurnished());
            stmt.setString(7, notification.getQuadrant());
            stmt.setString(8, notification.getStatus());

            notifications.add(notification);
            notifyObservers();

            stmt.execute();
            stmt.close();


            //props.add(property);
            notifyObservers();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void deleteNotifications(String userName){

        try {
            String query = "DELETE FROM notifications WHERE renterUserName = ?";
            PreparedStatement stmt = dbConnect.prepareStatement(query);
            stmt.setString(1, userName);
            notifyObservers();
            stmt.executeUpdate();
            stmt.close();

        } catch (SQLException e) {

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

                Notifications notif = new Notifications(Integer.toString(set.getInt("renterID")),
                        Integer.toString(set.getInt("bedrooms")),
                        Integer.toString(set.getInt("bathrooms")),
                        set.getString("type"), set.getString("furnished"), set.getString("quadrant"),
                        set.getString("renterUserName"),
                        set.getString("status")
                        );

                notifications.add(notif);

            }
            notifyObservers();

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public void setID(){

        if(notifications.size() != 0) {
            id = notifications.get(notifications.size()-1).getId() + 1;
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
