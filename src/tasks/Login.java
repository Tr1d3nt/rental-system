package tasks;

import controllers.*;

public class Login {
    private static Login onlyInstance;
    private LoginController lc;
    private boolean isRegistered = false;

    private Login(String username, String password, String userType){
        isRegistered = lc.verifyUser(username, password, userType);
    }

    public static Login getOnlyInstance(String username, String password, String userType){
        if(onlyInstance == null){
            onlyInstance = new Login(username, password, userType);
        }
        return onlyInstance;
    }

    public boolean isVerified(){
        return isRegistered;
    }
}
