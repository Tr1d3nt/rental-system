package controllers;

import tasks.*;
import java.util.ArrayList;
import java.sql.*;

public class FeeController extends DBController {

    private ArrayList<Fee> fee_list = new ArrayList<Fee>();
    private static int id;

    // increments the ID after every fee added
    public void increment(){
       this.id++;
    }



    // constructor
    public FeeController() {
        initializeConnection();
        getFees();
    }

    // adds fee to the database for the specified period
    public void addFee(int period, int amount){

        try {
            String query = "UPDATE fee SET amount = ? WHERE period = ?"; // query for adding the fee
            PreparedStatement stmt = dbConnect.prepareStatement(query);
            stmt.setInt(1, amount);
            stmt.setInt(2, period);

            stmt.executeUpdate();// executes the query
            stmt.close();

            getFees(); // updates the arrayList for fees

        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

    // gets all the fees in database
    public void getFees() {
        try {
            fee_list.clear(); // clears the array list for fees
            Statement stmt;
            ResultSet set;
            String query = "SELECT * FROM fee"; // the query to pull fees from database
            stmt = dbConnect.createStatement();
            set = stmt.executeQuery(query);

            while (set.next()) { // adds a Fee type for each fee in database

                Fee fee_1 = new Fee(
                        set.getInt("amount"),
                        set.getInt("period"));
                fee_list.add(fee_1);
                this.id = set.getInt("managerID") + 1;

            }


        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

    // returns ArrayList for fees
    public ArrayList<Fee> feeList(){
        return this.fee_list;
    }

    public void initializeConnection() {

        try {

            this.dbConnect = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
            System.out.println("Connection established!\n");
        } catch (SQLException e) {

            e.printStackTrace();

        }
    }

    public void close() {

        try {

            dbConnect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }



}
