package tasks;

import controllers.*;

public class Login {

    private static Login onlyInstance; // future implementation for Singleton login when multiple instances are needed
    private LoginController lc; // loginController
    private boolean isRegistered = false; // keeps track if user is registered in database

    private Login(String username, String password, String userType){
        isRegistered = lc.verifyUser(username, password, userType);
    }

    // Future implementation: As the program runs only in one instance currently,
    // in future if multiple instances are needed, this method can be used
    public static Login getOnlyInstance(String username, String password, String userType){
        if(onlyInstance == null){
            onlyInstance = new Login(username, password, userType);
        }
        return onlyInstance;
    }
    // checks if the user is registered in database, returns false if not
    public boolean isVerified(){
        return isRegistered;
    }
}
