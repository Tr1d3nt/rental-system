package tasks;

import java.util.ArrayList;
import controllers.*;
import java.sql.*;
import java.lang.Integer;

public class SummaryReport {
    private PropertyController propertyController;
    private static int listedHouses = 0;
    private static int rentedHouses = 0;
    private static int activeListing = 0;

    public SummaryReport(PropertyController pc){
        propertyController = pc;
        propertyController.getAllProperty();
    }

    //implement concrete functions here:
    //returns a 2D ArrayList of houses rented during the period
    //note change args to String
    //change to vector
    public ArrayList<ArrayList<String>> getRentedHouses(String month){
        ArrayList<ArrayList<String>> arr = new ArrayList<>();
        
        for(int i = 0; i < propertyController.getProp().size(); i++){
            Property temp = propertyController.getProp().get(i);
            String houseId = Integer.toString(temp.getPropertyID());
            String address = temp.getAddress();

            ArrayList<String> inside = new ArrayList<>();
            inside.add(houseId);
            inside.add(address);

            arr.add(inside);
        }


        return arr;
    }

    /*
    returns an Integer ArrayList containing:
    1. total number of houses listed in the period.
    2. total number of houses rented in the period.
    3. total number of active listings.
    */
    //change to vector
    public ArrayList<Integer> getDetails(String month){
        ArrayList<Integer> arr = new ArrayList<>();
        return arr;
    }

    public static void main(String[] args){
        PropertyController pc = new PropertyController();
        Date d1 = new Date(1000000000L);
        Date d2 = new Date(2000000000L);
        Date d3 = new Date(3000000000L);
        Date d4 = new Date(4000000000L);
        //Property p1 = new Property(0, 0, "address1", "apartment", 3, 3, "yes", "NW", "active", d1, d2);
       // Property p2 = new Property(1, 1, "address2", "house", 2, 1, "no", "SW", "rented", d3, d4);

        //pc.addProperty(p1);
        //pc.addProperty(p2);

        //pc.removeProperty(0);
        //pc.removeProperty(1);
        SummaryReport sr = new SummaryReport(pc);
        sr.getRentedHouses("December");
    }

}
