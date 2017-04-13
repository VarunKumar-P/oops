package DBFunctions;

import UserInterface.Controller.PhaseControl;
import Utils.Enumerations;

import java.sql.ResultSet;
import java.sql.SQLException;

import static Utils.DBConnect.conn;

/**
 * Created by Shantanu on 2017-04-13.
 */
public class LoginFunctions {
    public void verifyCredentials(String userID, String password) throws SQLException {
        String loginQuery = "select * from adminlogin where userID = '" + userID + "'";
        ResultSet resultSet = conn.createStatement().executeQuery(loginQuery);

        if (resultSet.next()){
            if (password.equals(resultSet.getString("Password"))){
                PhaseControl.setUserName(resultSet.getString("name"));
                PhaseControl.setUserLogin(Enumerations.LoginResult.SUCCESS);
            } else {
                PhaseControl.setUserLogin(Enumerations.LoginResult.PASSWORD_MISMATCH);
            }
        } else {
            PhaseControl.setUserLogin(Enumerations.LoginResult.DOES_NOT_EXIST);
        }
    }
}
