package UserInterface.Controller;

import Utils.Enumerations;

/**
 * Created by Shantanu on 2017-04-13.
 */
public class PhaseControl {
    private static Enumerations.LoginResult userLogin;
    private static Enumerations.LoginViewStatus loginScene;
    private static String userName;

    public static void setUserLogin(Enumerations.LoginResult userLogin) {
        PhaseControl.userLogin = userLogin;
    }

    public static void setLoginScene(Enumerations.LoginViewStatus loginScene) {
        PhaseControl.loginScene = loginScene;
    }

    public static void setUserName(String userName){
        PhaseControl.userName = userName;
    }

    static Enumerations.LoginResult getUserLogin() {
        return userLogin;
    }

    static Enumerations.LoginViewStatus getLoginScene() {
        return loginScene;
    }

    static String getUserName(){
        return userName;
    }

    public static void setPhaseControls(){
        setLoginScene(Enumerations.LoginViewStatus.USER_EMPTY);
        setUserLogin(Enumerations.LoginResult.LOG_OUT);
        setUserName(null);
    }
}
