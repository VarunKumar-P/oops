package Utils;

import UserInterface.Controller.PhaseControl;

/**
 * Created by Shantanu on 2017-04-14.
 */
public class Verifications {
    private String userID, password;
    public Verifications(String userID, String password){
        this.userID = userID;
        this.password = password;
    }

    public void loginToggle(){
        if (userID.trim().isEmpty()){
            PhaseControl.setLoginScene(Enumerations.LoginViewStatus.USER_EMPTY);
        } else {
            if (password.isEmpty()){
                PhaseControl.setLoginScene(Enumerations.LoginViewStatus.PASSWORD_EMPTY);
            } else {
                PhaseControl.setLoginScene(Enumerations.LoginViewStatus.FILLED);
            }
        }
    }
}
