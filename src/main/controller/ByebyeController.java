package main.controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import main.mainApp;
import main.scenes.FactoryScene;
import main.scenes.TypeScene;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ByebyeController implements Initializable {

    double x = 0;
    double y = 0;

    @FXML private Pane despedida;

    @FXML
    public void atras (MouseEvent event) {
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
    public void home (MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(FactoryScene.getScene(TypeScene.MAIN, mainApp.getInstance()));
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

    public void videoPlayer(Pane pane){
        MediaPlayer player = new MediaPlayer( new Media(getClass().getResource("/main/resources/prueba.mp4").toExternalForm()));
        MediaView mediaView = new MediaView(player);
        player.setAutoPlay(true);
        mediaView.setFitWidth(905);
        mediaView.setFitHeight(565);
        pane.getChildren().add(mediaView);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        videoPlayer(despedida);
    }
}
