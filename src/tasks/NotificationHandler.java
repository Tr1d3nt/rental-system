package tasks;

import interfaces.ObserverNotification;
import interfaces.ObserverProperty;
import interfaces.SubjectNotification;
import interfaces.SubjectProperty;

import java.util.*;

import controllers.NotificationsController;

public class NotificationHandler implements ObserverNotification, ObserverProperty {

    private ArrayList<Notifications> notifs = new ArrayList<Notifications>();
    private ArrayList<Property> properties = new ArrayList<Property>();
    NotificationsController notificationsController = new NotificationsController();
    private SubjectNotification subjectNotification;
    private SubjectProperty subjectProperty;

    public NotificationHandler(SubjectNotification sNotification, SubjectProperty sProperty) {

        notificationsController.getAllNotifications();
        this.subjectNotification = sNotification;
        this.subjectProperty = sProperty;

        subjectProperty.attach(this);
        subjectNotification.attach(this);

    }

    public void addNotification(String bed, String bath, String type,
            String furnished, String quadrant, String renterID) {

        Notifications temp = new Notifications(bed, bath, type, furnished, quadrant, renterID);
        notifs.add(temp);
        notificationsController.addNotification(temp);

    }

    public Vector<Vector<String>> notifyProperties(String userID) {

        Vector<Vector<String>> result = new Vector<Vector<String>>();
        int id = Integer.parseInt(userID);
        int bed = 0;
        int bath = 0;
        String type = "";
        String furnished = "";
        String quadrant = "";

        for (int i = 0; i < notifs.size(); i++) {

            if (id == notifs.get(i).getID()) {

                bed = notifs.get(i).getBedroom();
                bath = notifs.get(i).getBathroom();
                type = notifs.get(i).getType();
                furnished = notifs.get(i).getFurnished();
                quadrant = notifs.get(i).getQuadrant();

            }

        }

        for (int i = 0; i < properties.size(); i++) {

            if (properties.get(i).getBedandBath()[0] == bed &&
                    properties.get(i).getBedandBath()[1] == bath &&
                    properties.get(i).getType().equals(type) &&
                    properties.get(i).getFurnished().equals(furnished) &&
                    properties.get(i).getQuadrant().equals(quadrant)) {

                Vector<String> listings = new Vector<String>();

                // Integer type to hold integers for conversion to String
                Integer propID = properties.get(i).getPropertyID();
                Integer intBed = properties.get(i).getBedandBath()[0];
                Integer intBath = properties.get(i).getBedandBath()[1];
                // All the relevant information
                String propertyID = propID.toString();
                String address = properties.get(i).getAddress();
                String bedrooms = intBed.toString();
                String bathrooms = intBath.toString();
                String isFurnished = properties.get(i).getFurnished();
                String quadrant_ = properties.get(i).getQuadrant();
                String status = properties.get(i).getStatus();
                String submitted = properties.get(i).getSubmitted().toString();

                listings.add(propertyID);
                listings.add(address);
                listings.add(type);
                listings.add(bedrooms);
                listings.add(bathrooms);
                listings.add(isFurnished);
                listings.add(quadrant_);
                listings.add(status);
                listings.add(submitted);

                result.add(listings);

            }
        }

        return result;

    }

    public boolean hasNotification(String userID) {

        int id = Integer.parseInt(userID);

        for (int i = 0; i < notifs.size(); i++) {

            if (notifs.get(i).getID() == id) {

                return true;
            }

        }

        return false;

    }

    @Override
    public void updateNotifs(ArrayList<Notifications> arr) {
        this.notifs = arr;
    }

    @Override
    public void update(ArrayList<Property> arr) {
        this.properties = arr;
    }

}
