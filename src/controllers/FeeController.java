package controllers;

import tasks.*;
import java.sql.*;
import java.util.*;

public class FeeController extends DBController {

    private ArrayList<Fee> fee_list = new ArrayList<Fee>();
  

    public FeeController() {
        initializeConnection();
    }

    public void addFee(Fee fee){

        try {

            String query = "INSERT INTO fee (managerID, amount, period"
                    + " VALUES (?, ?, ?,)";

            PreparedStatement stmt = dbConnect.prepareStatement(query);

            stmt.setInt(0, fee.getManager());
            stmt.setInt(1, fee.getAmount());
            stmt.setInt(2, fee.getPeriod());
     
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void getFees() {  // void for now not sure how the manager implementation will work
        Fee fee;
        try {

            Statement stmt;
            ResultSet set;
            String query = "SELECT * FROM fee";
            stmt = dbConnect.createStatement();
            set = stmt.executeQuery(query);
            while (set.next()) {

                Fee fee_1 = new Fee(set.getInt("managerID"),
                       set.getInt("amount"),
                        set.getInt("period"));
                fee_list.add(fee_1);
                fee = fee_1;
                
            }

        } catch (SQLException e) {

            e.printStackTrace();

        }
      
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
