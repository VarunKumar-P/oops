package UserInterface.Controller;

import DBFunctions.LoginFunctions;
import Utils.Enumerations;
import Utils.Verifications;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.SQLException;

/**
 * Created by Shantanu on 2017-04-11.
 */
public class LoginController {
    Verifications verify;

    @FXML
    private TextField userID;

    @FXML
    private PasswordField userPassword;

    @FXML
    private Label loginWarningMessage;

    @FXML
    private Button loginButton;

    @FXML
    private void keyToggle(){
        verify = new Verifications(userID.getText(), userPassword.getText());
        verify.loginToggle();
        if (Enumerations.LoginViewStatus.FILLED == PhaseControl.getLoginScene()){
            loginButton.setDisable(false);
        } else {
            loginButton.setDisable(true);
        }
    }

    @FXML
    private void login() throws SQLException {
        LoginFunctions login = new LoginFunctions();
        login.verifyCredentials(userID.getText().trim(), userPassword.getText());

        switch (PhaseControl.getUserLogin()){
            case SUCCESS:
                loginWarningMessage.setText("Success");
                break;
            case DOES_NOT_EXIST:
                loginWarningMessage.setText("Please check UserName");
                break;
            case PASSWORD_MISMATCH:
                loginWarningMessage.setText("Wrong Password");
                break;
            default:
                loginWarningMessage.setText("");
        }
    }
}
