import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ApplicationLauncher extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/window.fxml"));
        Parent root = loader.load();

        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Google Drive PDF Utility");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
