import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ApplicationLauncher extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/window.fxml"));

        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Google Drive PDF Utility");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
