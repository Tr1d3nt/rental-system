package tasks;

public class Notifications {

    private int bedrooms;
    private int bathrooms;
    private String type;
    private String furnished;
    private String quadrant;
    private int renterID;

    public Notifications(String bed, String bath, String type,
            String furnished, String quadrant, String renterID) {

        bedrooms = Integer.parseInt(bed);
        bathrooms = Integer.parseInt(bath);
        this.type = type;
        this.furnished = furnished;
        this.quadrant = quadrant;
        this.renterID = Integer.parseInt(renterID);


    }

    public int getBedroom() {
        return this.bedrooms;
    }

    public int getBathroom() {
        return this.bathrooms;
    }

    public String getType() {
        return this.type;

    }

    public String getFurnished() {
        return this.furnished;

    }

    public String getQuadrant() {
        return this.quadrant;
    }

    public int getID() {
        return this.renterID;
    }

}
