package tasks;

import java.util.Vector;

import controllers.*;
import java.util.*;

public class PropertyListings {

    private PropertyController p = new PropertyController();
    private Vector<Vector<String>> propertyListing = new Vector<Vector<String>>();

    public void setPropertyListing() {

        p.getAllProperty();

        for (int i = 0; i < p.getProp().size(); i++) {
            // new vector for each listing
            Vector<String> listing = new Vector<String>();
            // Integer type to hold integers for conversion to String
            Integer propID = p.getProp().get(i).getPropertyID();
            Integer bed = p.getProp().get(i).getBedandBath()[0];
            Integer bath = p.getProp().get(i).getBedandBath()[1];
            Integer furnished = p.getProp().get(i).getFurnished();
            // All the relevant information
            String propertyID = propID.toString();
            String address = p.getProp().get(i).getAddress();
            String type = p.getProp().get(i).getType();
            String bedrooms = bed.toString();
            String bathrooms = bath.toString();
            String isFurnished = furnished.toString();
            String quadrant = p.getProp().get(i).getQuadrant();
            String status = p.getProp().get(i).getStatus();
            String submitted = p.getProp().get(i).getSubmitted().toString();

            listing.add(propertyID);
            listing.add(address);
            listing.add(type);
            listing.add(bedrooms);
            listing.add(bathrooms);
            listing.add(isFurnished);
            listing.add(quadrant);
            listing.add(status);
            listing.add(submitted);

            propertyListing.add(listing);

        }

    }

    public Vector<Vector<String>> getPropertyListing() {

        return propertyListing;

    }

    public PropertyController getP() {
        return p;

    }

    public static void main(String[] args) {

        PropertyListings listing = new PropertyListings();
        listing.setPropertyListing();
        for (int i = 0; i < listing.getPropertyListing().size(); i++) {



                System.out.println(listing.getPropertyListing().get(i).toString());



        }

    }

}
