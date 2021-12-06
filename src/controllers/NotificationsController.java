package controllers;

import tasks.*;
import java.sql.*;
import java.util.*;

public class NotificationsController extends DBController {

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

            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

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
