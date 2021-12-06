package tasks;

import java.util.Vector;

import javax.management.loading.PrivateClassLoader;

import controllers.*;
import interfaces.Observer;
import interfaces.Subject;

import java.util.*;

public class PropertyListings implements Observer {

    private PropertyController p = new PropertyController();
    private Vector<Vector<String>> propertyListing = new Vector<Vector<String>>();
    private ArrayList<Property> properties;
    private Subject subject;

    public PropertyListings(Subject s) {
        subject = s;
        subject.attach(this);
    }

    public PropertyListings() {

    }

    public void setPropertyListing() {

        for (int i = 0; i < p.getProp().size(); i++) {
            // new vector for each listing
            Vector<String> listing = new Vector<String>();
            // Integer type to hold integers for conversion to String
            Integer propID = properties.get(i).getPropertyID();
            Integer bed = properties.get(i).getBedandBath()[0];
            Integer bath = properties.get(i).getBedandBath()[1];
            // All the relevant information
            String propertyID = propID.toString();
            String address = properties.get(i).getAddress();
            String type = properties.get(i).getType();
            String bedrooms = bed.toString();
            String bathrooms = bath.toString();
            String isFurnished = properties.get(i).getFurnished();
            String quadrant = properties.get(i).getQuadrant();
            String status = properties.get(i).getStatus();
            String submitted = properties.get(i).getSubmitted().toString();

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

    // filtered version of property listing based on user preferences
    public Vector<Vector<String>> filteredPropertyListing(String type, String bed, String bath, String furn,
            String quadrant) {

        Vector<Vector<String>> filtered = new Vector<Vector<String>>();

        for (int i = 0; i < properties.size(); i++) {

            Vector<String> listing = new Vector<String>();

            if (properties.get(i).getType().equals(type) &&
                    properties.get(i).getBedandBath()[0] == Integer.parseInt(bed) &&
                    properties.get(i).getBedandBath()[1] == Integer.parseInt(bath) &&
                    properties.get(i).getFurnished().equals(furn) &&
                    properties.get(i).getQuadrant().equals(quadrant)) {

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

                listing.add(propertyID);
                listing.add(address);
                listing.add(type);
                listing.add(bedrooms);
                listing.add(bathrooms);
                listing.add(isFurnished);
                listing.add(quadrant_);
                listing.add(status);
                listing.add(submitted);

                filtered.add(listing);

            }

        }

        return filtered;

    }

    public Vector<Vector<String>> getPropertyListing() {

        return propertyListing;

    }

    public PropertyController getP() {
        return p;

    }

    @Override
    public void update(ArrayList<Property> arr) {

        this.properties = arr;
        setPropertyListing();

    }

    public static void main(String[] args) {

        PropertyListings listing = new PropertyListings();
        listing.setPropertyListing();
        for (int i = 0; i < listing.getPropertyListing().size(); i++) {

            System.out.println(listing.getPropertyListing().get(i).toString());

        }

    }

}
