package tasks;

import java.util.ArrayList;
import controllers.*;
import java.sql.*;
import java.lang.Integer;
import java.util.Calendar;
import java.util.Vector;

public class SummaryReport {
    private PropertyController propertyController;
    private static int listedHouses = 0;
    private static int rentedHouses = 0;
    private static int activeListing = 0;
    private Vector<Vector<String>> arr = new Vector<Vector<String>>();
    Vector<Integer> arr1 = new Vector<Integer>();

    public SummaryReport(PropertyController pc){
        propertyController = pc;
        propertyController.getAllProperty();
    }

    
    //PROMISES: returns a 2D ArrayList of houses rented during the period
    //Note the order in which the results are released:
    //1. Landlord Name
    //2. House ID
    //3. Property Address
    public Vector<Vector<String>> getRentedHouses(String month, String year){
        

        for(int i = 0; i < propertyController.getProp().size(); i++){

            
            Property temp = propertyController.getProp().get(i);

            Calendar cal = Calendar.getInstance();
            cal.setTime(temp.getSubmitted());
            int monthVal = cal.get(Calendar.MONTH) + 1;
            int yearVal = cal.get(Calendar.YEAR);

            int monthInt = Integer.parseInt(month);
            int yearInt = Integer.parseInt(year);

            //If status != Available, then don't include in result arraylist
            if(!(temp.getStatus().equals("Rented"))){
                continue;
            }

            //If month and year do not match specified period, then don't include in result arraylist
            if((monthVal != monthInt) || (yearVal != yearInt)){
                continue;
            } 

            String landlordName = temp.getEmail();
            String houseId = Integer.toString(temp.getPropertyID());
            String address = temp.getAddress();

            Vector<String> inside = new Vector<String>();

            inside.add(houseId);
            inside.add(landlordName);
            inside.add(address);

            arr.add(inside);
        }


        return arr;
    }

    /*
    PROMISES: returns an Integer ArrayList containing (in the exact order as specified):
    1. total number of houses listed in the period.
    2. total number of houses rented in the period.
    3. total number of active listings.
    */
    public Vector<Integer> getDetails(String month, String year){

        for(int i = 0; i < propertyController.getProp().size(); i++){
            Property temp = propertyController.getProp().get(i);

            Calendar cal = Calendar.getInstance();
            cal.setTime(temp.getSubmitted());
            int monthVal = cal.get(Calendar.MONTH) + 1;
            int yearVal = cal.get(Calendar.YEAR);

            int monthInt = Integer.parseInt(month);
            int yearInt = Integer.parseInt(year);

            //Don't include in the report if it isn't within the specified period:
            if((monthVal != monthInt) || (yearVal != yearInt)){
                continue;
            } 

            listedHouses++;

            if(temp.getStatus().equals("Rented")){
                rentedHouses++;
            }

            if(temp.getStatus().equals("Active")){
                activeListing++;
            }

        }

        arr1.add(rentedHouses);
        arr1.add(listedHouses);
        arr1.add(activeListing);

        return arr1;
    }

    public static void main(String[] args){
//        PropertyController pc = new PropertyController();
//        Date d1 = new Date(0L);
//        Date d2 = new Date(3000L);
//        Date d3 = new Date(5000L);
//        Date d4 = new Date(6000L);
//        Date d5 = new Date(10000000000L);
//        Date d6 = new Date(20000000000L);
//
//       // Property p1 = new Property(0, 0, "address1", "apartment", 3, 3, "yes", "NW", "Available", d1, d2, "Landlord1");
//       // Property p2 = new Property(1, 1, "address2", "house", 2, 1, "no", "SW", "rented", d3, d4, "Landlord2");
//       // Property p3 = new Property(2, 2, "address3", "condo", 2, 2, "yes", "NE", "inactive", d5, d6, "Landlord3");
//
//
//
//        //pc.addProperty(p1);
//        // pc.addProperty(p2);
//        // pc.addProperty(p3);
//
//        // pc.removeProperty(0);
//        // pc.removeProperty(1);
//        // pc.removeProperty(2);
//
//        SummaryReport sr = new SummaryReport(pc);
//        //sr.getRentedHouses("December", "2017");
//
//        System.out.println("-----------TEST-------");
//        ArrayList<ArrayList<String>> res = new ArrayList<>();
//
//       // res = sr.getRentedHouses("12", "1969");
//
//
//        for(int i = 0; i < res.size(); i++){
//            System.out.print(res.get(i).get(0) + ", ");
//            System.out.print(res.get(i).get(1) + ", ");
//            System.out.println(res.get(i).get(2));
//        }
//
//        ArrayList<Integer> res1 = new ArrayList<>();
//
//        res1 = sr.getDetails("12", "1969");
//
//        System.out.println("getDetails() results:");
//        System.out.println("Month: " + 12 + "Year: " + 1969);
//        System.out.println("Houses listed in period: " + res1.get(0));
//        System.out.println("Rented houses during period: " + res1.get(1));
//        System.out.println("Active listings during period: " + res1.get(2));
//

        
    }

}
