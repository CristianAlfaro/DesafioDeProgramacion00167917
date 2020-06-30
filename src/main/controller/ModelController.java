package main.controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import main.mainApp;
import main.scenes.FactoryScene;
import main.scenes.TypeScene;
import org.w3c.dom.css.RGBColor;

import java.net.URL;
import java.util.ResourceBundle;

public class ModelController implements Initializable {

    double x = 0;
    double y = 0;

    @FXML private Pane pane1;
    @FXML private Pane pane2;
    @FXML private Pane pane3;
    @FXML private Polygon up1;
    @FXML private Polygon up2;
    @FXML private Button btn_mesh;
    @FXML private ImageView imgMesh;

    @FXML
    public void home (MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(FactoryScene.getScene(TypeScene.MAIN, mainApp.getInstance()));
    }

    @FXML
    public void next (MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(FactoryScene.getScene(TypeScene.STEP1, mainApp.getInstance()));
    }

    @FXML
    void close (MouseEvent event){
        Platform.exit();
        System.exit(0);
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

    @FXML
    public void pane1 (MouseEvent event){
        pane1.setVisible(true);
        up1.setVisible(true);
        pane2.setVisible(false);
        up2.setVisible(false);
        pane3.setVisible(false);
    }

    @FXML
    public void pane2 (MouseEvent event){
        pane1.setVisible(false);
        up1.setVisible(false);
        pane2.setVisible(true);
        up2.setVisible(true);
        pane3.setVisible(false);
    }

    @FXML
    public void pane3 (MouseEvent event){
        pane3.setVisible(true);
    }

    @FXML
    public void back (MouseEvent event){
        pane3.setVisible(false);
    }

    @FXML
    public void mesh (MouseEvent event){
        if(btn_mesh.getText().equals("Malla")){
            btn_mesh.setText("Dominio");
            Image image = new Image("main/resources/fondo.jpg");
            imgMesh.setImage(image);
        } else if(btn_mesh.getText().equals("Dominio")){
            btn_mesh.setText("Malla");
            Image image = new Image("main/resources/hestia_family.jpg");
            imgMesh.setImage(image);
        }

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
