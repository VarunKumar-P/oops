package UserInterface.Phase;

import Utils.AppPaths;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by Shantanu on 2017-04-11.
 */
public class LoginPhase {
    AppPaths paths;
    Stage primaryStage;
    public LoginPhase(Stage primaryStage) throws IOException {
        paths = new AppPaths();
        this.primaryStage = primaryStage;
    }

    public void loadLoginView() throws IOException {
        Parent base = FXMLLoader.load(paths.getLoginView());

        primaryStage.setScene(new Scene(base));
    }
}
