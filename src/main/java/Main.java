import UserInterface.Phase.LoginPhase;
import UserInterface.Controller.PhaseControl;
import Utils.DBConnect;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

import static javafx.application.Application.launch;

/**
 * Created by varun on 09-Apr-17.
 */
public class Main extends Application {
    public void start(Stage primaryStage) throws IOException, SQLException {
        primaryStage.setTitle("Mall Card Manager");

        DBConnect.connectToDB();
        PhaseControl.setPhaseControls();

        primaryStage.show();

        LoginPhase login = new LoginPhase(primaryStage);
        login.loadLoginView();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
