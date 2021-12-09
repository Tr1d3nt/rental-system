package tasks;

import java.util.Vector;

import controllers.*;
import interfaces.ObserverProperty;
import interfaces.SubjectProperty;

import java.util.*;

public class PropertyListings implements ObserverProperty {

    private PropertyController p = new PropertyController();
    private static Vector<Vector<String>> propertyListing = new Vector<Vector<String>>();
    private ArrayList<Property> properties = new ArrayList<Property>();
    private SubjectProperty subject;

    public PropertyListings(SubjectProperty s) {
        subject = s;
        subject.attach(this);
    }

    public PropertyListings() {

    }

    public void changeListing(String status, int id){
        p.updateStatus(id, status);
    }

    public ArrayList<Property> managerProperties(){
        return p.getProp();
    }

    public Vector<Vector<String>> propertyListingLandlord(String userName){

       ArrayList<Property> properties = p.getLandlordProperty(userName);
       Vector<Vector<String>> result = new Vector<Vector<String>>();

       for(int i = 0; i < properties.size(); i++) {

           Vector<String> listing = new Vector<String>();
           // Integer type to hold integers for conversion to String
           Integer intBed = properties.get(i).getBedandBath()[0];
           Integer intBath = properties.get(i).getBedandBath()[1];
           // All the relevant information
           String address = properties.get(i).getAddress();
           String bedrooms = intBed.toString();
           String type = properties.get(i).getType();
           String bathrooms = intBath.toString();
           String isFurnished = properties.get(i).getFurnished();
           String quadrant_ = properties.get(i).getQuadrant();
           String status = properties.get(i).getStatus();

           listing.add(address);
           listing.add(type);
           listing.add(bedrooms);
           listing.add(bathrooms);
           listing.add(status);
           listing.add(isFurnished);
           listing.add(quadrant_);

           result.add(listing);
       }

       return result;


    }

    public ArrayList<Property> landlordProperties(String userName){
        return p.getLandlordProperty(userName);
    }

    public void setPropertyListing() {

        propertyListing.clear();
        for (int i = 0; i < properties.size(); i++) {
            // new vector for each listing
            Vector<String> listing = new Vector<String>();
            // Integer type to hold integers for conversion to String
            Integer propID = properties.get(i).getPropertyID();
            Integer bed = properties.get(i).getBedandBath()[0];
            Integer bath = properties.get(i).getBedandBath()[1];
            // All the relevant information
            String address = properties.get(i).getAddress();
            String type = properties.get(i).getType();
            String bedrooms = bed.toString();
            String bathrooms = bath.toString();
            String isFurnished = properties.get(i).getFurnished();
            String quadrant = properties.get(i).getQuadrant();
            String status = properties.get(i).getStatus();

            listing.add(address);
            listing.add(type);
            listing.add(bedrooms);
            listing.add(bathrooms);
            listing.add(status);
            listing.add(isFurnished);
            listing.add(quadrant);
            propertyListing.add(listing);

        }



    }

    // listing specific to landlord
    public Vector<Vector<String>> listingsForEdit(String userName, Boolean isManager){
        Vector<Vector<String>> result = new Vector<Vector<String>>();
        if(!isManager) {

            for(int i = 0; i < properties.size(); i++) {

                Vector<String> listing = new Vector<String>();

                if (properties.get(i).getEmail().equals(userName)) {

                    // Integer type to hold integers for conversion to String
                    Integer intBed = properties.get(i).getBedandBath()[0];
                    Integer intBath = properties.get(i).getBedandBath()[1];
                    // All the relevant information
                    String address = properties.get(i).getAddress();
                    String bedrooms = intBed.toString();
                    String bathrooms = intBath.toString();
                    String isFurnished = properties.get(i).getFurnished();
                    String quadrant_ = properties.get(i).getQuadrant();
                    String submitted = properties.get(i).getSubmitted().toString();

                    listing.add(address);
                    listing.add(bedrooms);
                    listing.add(bathrooms);
                    listing.add(isFurnished);
                    listing.add(quadrant_);
                    listing.add(submitted);

                    result.add(listing);




                }
            }

            return result;


        }
        else {

            return propertyListing;

        }

    }

    public void addProperty(Property p){
        this.p.addProperty(p);
    }


    // filtered version of property listing based on user preferences
    public Vector<Vector<String>> filteredPropertyListing(String type, String bed, String bath, String furn, String status,
            String quadrant) {

        Vector<Vector<String>> filtered = new Vector<Vector<String>>();

        for (int i = 0; i < properties.size(); i++) {

            Vector<String> listing = new Vector<String>();

            if (properties.get(i).getType().equals(type) &&
                    properties.get(i).getBedandBath()[0] == Integer.parseInt(bed) &&
                    properties.get(i).getBedandBath()[1] == Integer.parseInt(bath) &&
                    properties.get(i).getFurnished().equals(furn) &&
                    properties.get(i).getQuadrant().equals(quadrant) && properties.get(i).getStatus().equals(status)) {

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
                String submitted = properties.get(i).getSubmitted().toString();

                listing.add(address);
                listing.add(type);
                listing.add(bedrooms);
                listing.add(bathrooms);
                listing.add(status);
                listing.add(isFurnished);
                listing.add(quadrant);

                filtered.add(listing);

            }

        }

        return filtered;

    }

    public Vector<Vector<String>> getPropertyListing() {
        setPropertyListing();
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
