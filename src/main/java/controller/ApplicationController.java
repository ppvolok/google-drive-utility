package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.File;

public class ApplicationController {

    @FXML
    private Button browseOutButton;

    @FXML
    private TextField browseOutField;

    @FXML
    private AnchorPane mainPane;

    @FXML
    private void browseOutButtonAction() {
        DirectoryChooser directoryChooser = new DirectoryChooser();
        directoryChooser.setTitle("Выберите папку для сохранения файлов");
        directoryChooser.setInitialDirectory(new File(System.getProperty("user.home")));
        Stage primaryStage = (Stage) mainPane.getScene().getWindow();
        File dir = directoryChooser.showDialog(primaryStage);
        if (dir != null) {
            browseOutField.setText(dir.getAbsolutePath());
        } else {
            browseOutField.setText(System.getProperty("user.home"));
        }
    }
}
