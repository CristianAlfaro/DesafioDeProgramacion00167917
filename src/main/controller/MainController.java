package main.controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import main.mainApp;
import main.scenes.FactoryScene;
import main.scenes.TypeScene;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    double x = 0;
    double y = 0;

    @FXML
    public void start (MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(FactoryScene.getScene(TypeScene.MODEL, mainApp.getInstance()));

    }

    @FXML
    void close (MouseEvent event){
        Platform.exit();
        System.exit(0);
    }

    @FXML
    void minimized (MouseEvent event){
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setIconified(true);
    }

    @FXML
    void dragged (MouseEvent event){
        Node node = (Node) event.getSource();
        Stage stage = (Stage) node.getScene().getWindow();

        stage.setX(event.getScreenX() - x);
        stage.setY(event.getScreenY() - y);
    }
    @FXML
    void pressed (MouseEvent event) {
        x = event.getSceneX();
        y = event.getSceneY();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
