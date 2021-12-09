package controllers;

import tasks.*;
import java.util.ArrayList;
import java.sql.*;

public class FeeController extends DBController {

    private ArrayList<Fee> fee_list = new ArrayList<Fee>();
    private static int id;

    public void increment(){
       this.id++;
    }




    public FeeController() {
        initializeConnection();
        getFees();
    }

    public void addFee(int period, int amount){

        try {
            String query = "UPDATE fee SET amount = ? WHERE period = ?";
            PreparedStatement stmt = dbConnect.prepareStatement(query);
            stmt.setInt(1, amount);
            stmt.setInt(2, period);

            stmt.executeUpdate();
            stmt.close();

            getFees();

        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

    public void getFees() {  // void for now not sure how the manager implementation will work
        try {
            fee_list.clear();
            Statement stmt;
            ResultSet set;
            String query = "SELECT * FROM fee";
            stmt = dbConnect.createStatement();
            set = stmt.executeQuery(query);
            while (set.next()) {

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
