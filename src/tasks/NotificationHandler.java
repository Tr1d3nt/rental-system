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
            String furnished, String quadrant, String renterUserName, String status) {

        Notifications temp = new Notifications(bed, bath, type, furnished, quadrant, renterUserName, status);
        notificationsController.addNotification(temp);

    }

    public Vector<Vector<String>> notifyProperties(String userName) {

        Vector<Vector<String>> result = new Vector<Vector<String>>();
        int bed = 0;
        int bath = 0;
        String type = "";
        String furnished = "";
        String quadrant = "";

        for (int i = 0; i < notifs.size(); i++) {

            if (userName.equals(notifs.get(i).getRenterUserName())) {

                bed = notifs.get(i).getBedroom();
                bath = notifs.get(i).getBathroom();
                type = notifs.get(i).getType();
                furnished = notifs.get(i).getFurnished();
                quadrant = notifs.get(i).getQuadrant();

            }

        }

        System.out.println(properties.size());

        for (int i = 0; i < properties.size(); i++) {

            if (properties.get(i).getBedandBath()[0] == bed &&
                    properties.get(i).getBedandBath()[1] == bath &&
                    properties.get(i).getType().equals(type) &&
                    properties.get(i).getFurnished().equals(furnished) &&
                    properties.get(i).getQuadrant().equals(quadrant)) {

                Vector<String> listings = new Vector<String>();

                // Integer type to hold integers for conversion to String
                Integer intBed = properties.get(i).getBedandBath()[0];
                Integer intBath = properties.get(i).getBedandBath()[1];
                // All the relevant information
                String address = properties.get(i).getAddress();
                String bedrooms = intBed.toString();
                String bathrooms = intBath.toString();
                String isFurnished = properties.get(i).getFurnished();
                String quadrant_ = properties.get(i).getQuadrant();
                String status = properties.get(i).getStatus();
                String submitted = properties.get(i).getSubmitted().toString();

                listings.add(address);
                listings.add(type);
                listings.add(bedrooms);
                listings.add(bathrooms);
                listings.add(status);
                listings.add(isFurnished);
                listings.add(quadrant_);

                result.add(listings);

            }
        }

        return result;

    }

    public boolean hasNotification(String userName) {


        for (int i = 0; i < notifs.size(); i++) {

            if (notifs.get(i).getRenterUserName().equals(userName)) {

                return true;
            }

        }

        return false;

    }

    @Override
    public void updateNotifs(ArrayList<Notifications> arr) {
        this.notifs.clear();

        for (int i = 0; i < arr.size(); i++) {

            notifs.add(arr.get(i));

        }
    }

    @Override
    public void update(ArrayList<Property> arr) {

        this.properties.clear();

        for (int i = 0; i < arr.size(); i++) {

            properties.add((arr.get(i)));

        }

    }

}
