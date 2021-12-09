package tasks;

import java.sql.Date;
import java.util.Calendar;

import controllers.*;

public class Property {

    private int propertyID;
    private String email  ;
    private String address;
    private String type;
    private int bedrooms;
    private int bathrooms;
    private String furnished;
    private String quadrant;
    private String status;
    private java.sql.Date submitted;
    private java.sql.Date expiry;

    // contstructor for adding listing
    public Property(String email, String address, String type, String bed, String bath,
            String furnished, String quadrant, String status, String expiry) {

        this.email = email;
        this.address = address;
        this.type = type;
        this.bedrooms = Integer.parseInt(bed);
        this.bathrooms = Integer.parseInt(bath);
        this.furnished = furnished;
        this.quadrant = quadrant;
        this.status = status;
        int expiryT = Integer.parseInt(expiry);
        expiryT /= 30;
        Calendar calendar = Calendar.getInstance();
        this.submitted = new java.sql.Date(System.currentTimeMillis());
        calendar.add(Calendar.MONTH, expiryT);
        this.expiry = new java.sql.Date(calendar.getTimeInMillis());

    }

    // constructor for parsing database
    public Property(int propertyID, String email, String address, String type, int bed, int bath,
            String furnished, String quadrant, String status, Date submitted, Date expiry) {


        this.propertyID = propertyID;
        this.email = email;
        this.address = address;
        this.type = type;
        this.bedrooms = bed;
        this.bathrooms = bath;
        this.furnished = furnished;
        this.quadrant = quadrant;
        this.status = status;
        this.submitted = submitted;
        this.expiry = expiry;

    }



    // getters
    public String getEmail(){
        return this.email;
    }
    public int getPropertyID() {
        return this.propertyID;
    }

    public String getAddress() {
        return this.address;
    }

    public String getType() {
        return this.type;
    }

    public int[] getBedandBath() {

        int[] temp = { this.bedrooms, this.bathrooms };

        return temp;

    }

    public String getFurnished() {
        return this.furnished;
    }

    public String getQuadrant() {

        return this.quadrant;

    }

    public String getStatus() {
        return this.status;
    }

    public Date getSubmitted() {
        return this.submitted;
    }

    public Date getExpiry() {
        return this.expiry;
    }

}
