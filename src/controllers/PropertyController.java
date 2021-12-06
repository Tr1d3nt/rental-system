
package controllers;

import tasks.*;
import java.sql.*;
import java.util.*;

import interfaces.ObserverProperty;
import interfaces.SubjectProperty;

public class PropertyController extends DBController implements SubjectProperty {

    private ArrayList<Property> props = new ArrayList<Property>();
    private ArrayList<ObserverProperty> observers;

    public PropertyController() {

        initializeConnection();

    }

    public void addProperty(Property property) {

        try {

            String query = "INSERT INTO property (propertyID, landLordID, address, type, bedrooms, bathrooms, furnished, quadrant, status, submitted, expiry)"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement stmt = dbConnect.prepareStatement(query);
            stmt.setInt(1, property.getPropertyID());
            stmt.setInt(2, property.getLandlordID());
            stmt.setString(3, property.getAddress());
            stmt.setString(4, property.getType());
            stmt.setInt(5, property.getBedandBath()[0]);
            stmt.setInt(6, property.getBedandBath()[1]);
            stmt.setString(7, property.getFurnished());
            stmt.setString(8, property.getQuadrant());
            stmt.setString(9, property.getStatus());
            stmt.setDate(10, property.getSubmitted());
            stmt.setDate(11, property.getExpiry());

            stmt.execute();
            stmt.close();

            props.add(property);
            notifyObservers();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void updateStatus(int propertyID, String status) {

        try {
            String query = "UPDATE property SET status = ? WHERE propertyID = ?";
            PreparedStatement stmt = dbConnect.prepareStatement(query);
            stmt.setString(0, status);
            stmt.setInt(1, propertyID);
            notifyObservers();

            stmt.executeUpdate();
            stmt.close();

        } catch (SQLException e) {

        }

    }

    public void removeProperty(int propertyID) {

        try {
            String query = "DELETE FROM property WHERE propertyID = ?";
            PreparedStatement stmt = dbConnect.prepareStatement(query);
            stmt.setInt(1, propertyID);
            notifyObservers();

            stmt.executeUpdate();
            stmt.close();

        } catch (SQLException e) {

        }

    }

    // do on laptop
    public void getAllProperty() {

        try {

            Statement stmt;
            ResultSet set;
            String query = "SELECT * FROM property";
            stmt = dbConnect.createStatement();
            set = stmt.executeQuery(query);
            while (set.next()) {

                Property p = new Property(set.getInt("propertyID"), set.getInt("landlordID"),
                        set.getString("address"), set.getString("type"), set.getInt("bedrooms"),
                        set.getInt("bathrooms"), set.getString("furnished"), set.getString("quadrant"),
                        set.getString("status"),
                        set.getDate("submitted"),
                        set.getDate("expiry"), set.getString("landlordName"));

                props.add(p);

            }

            notifyObservers();

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    public ArrayList<Property> getProp() {
        return props;
    }

    @Override
    public void notifyObservers() {

        for (int i = 0; i < observers.size(); i++) {
            ObserverProperty temp = observers.get(i);
            temp.update(props);
        }

    }

    @Override
    public void attach(ObserverProperty o) {

        this.observers.add(o);
        o.update(props);

    }

    @Override
    public void remove(ObserverProperty o) {

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

    public static void main(String[] args) {
        PropertyController p = new PropertyController();

        p.getAllProperty();

        for (int i = 0; i < p.getProp().size(); i++) {

            System.out.println(p.getProp().get(i).getPropertyID());

        }

    }

}