package tasks;

public class Notifications {


    // class keeps track of notification preferences
    private int bedrooms;
    private int bathrooms;
    private String type;
    private String furnished;
    private String quadrant;
    private String renterUserName;
    private int id;
    private String status;

    public Notifications(String bed, String bath, String type,
            String furnished, String quadrant, String renterUserName, String status) {

        bedrooms = Integer.parseInt(bed);
        bathrooms = Integer.parseInt(bath);
        this.type = type;
        this.furnished = furnished;
        this.quadrant = quadrant;
        this.renterUserName = renterUserName;
        this.status = status;

    }
    public Notifications(String id, String bed, String bath, String type,
                          String furnished, String quadrant, String renterUserName, String status) {

        bedrooms = Integer.parseInt(bed);
        bathrooms = Integer.parseInt(bath);
        this.type = type;
        this.furnished = furnished;
        this.quadrant = quadrant;
        this.renterUserName = renterUserName;
        this.id = Integer.parseInt(id);
        this.status = status;

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

    public String getRenterUserName(){return this.renterUserName;}

    public int getId(){
        return this.id;
    }
    public String getStatus(){
        return this.status;
    }


}
