package controllers;

import java.sql.*;




public class LoginController extends DBController {

    protected static int userID = 0;

    public LoginController(){
        initializeConnection();
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

    public void addUser(String username, String password, String userType){
        System.out.println("addUser method called.");

        try{
            String query = "INSERT INTO user (userID, Email, Password, userType)"
                    + " VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = dbConnect.prepareStatement(query);
            
            stmt.setInt(1, userID++);
            stmt.setString(2, username);
            stmt.setString(3, password);
            stmt.setString(4, userType);
            

            stmt.execute();
            stmt.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public boolean verifyUser(String username, String password, String userType){
        ResultSet rs;
        boolean isRegistered = false;
        try{
            String query = "SELECT * FROM user WHERE userName = (?) AND Password = (?) AND userType = (?)";
            PreparedStatement stmt = dbConnect.prepareStatement(query);

            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.setString(3, userType);

            rs = stmt.executeQuery();
            isRegistered = rs.next();
            stmt.close();

        }catch(SQLException e){
            e.printStackTrace();
        }
        return isRegistered;
    }

    public static void main(String[] args){
        LoginController lc = new LoginController();

        boolean isRegistered = lc.verifyUser("def", "boom", "landlord");
        
        if(isRegistered){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("Username or password is incorrect.");
        }

    }
}