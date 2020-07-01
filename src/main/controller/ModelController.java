package main.controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
    @FXML private Pane pane3;
    @FXML private Button btn_mesh;
    @FXML private ImageView imgMesh;
    @FXML private Button up;
    @FXML private Button down;
    @FXML private Button right;
    @FXML private Button left;
    @FXML private Button nodos;

    @FXML private Label info2;
    @FXML private Label info3;
    @FXML private ImageView info1;
    @FXML private Label info4;
    @FXML private ImageView info5;
    @FXML private ImageView info6;
    @FXML private ImageView info7;
    @FXML private ImageView info8;

    int i = 0;
    int j = 7;

    Boolean flags = false;

    String [][] modelo = {{"18.png","17.png","16.png","15.png","14.png","13.png","12.png","11.png"},
            {"28.png","27.png","26.png","25.png","24.png","23.png","22.png","21.png"}};

    String [][] mallado = {{"38.png","37.png","36.png","35.png","34.png","33.png","32.png","31.png"},
            {"48.png","47.png","46.png","45.png","44.png","43.png","42.png","41.png"}};

    String [][] nodes = {{"58.png","57.png","56.png","55.png","54.png","53.png","52.png","51.png"},
            {"68.png","67.png","66.png","65.png","64.png","63.png","62.png","61.png"}};



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
        pane3.setVisible(false);
    }

    @FXML
    public void condiciones (MouseEvent event){
        condiciones();
    }

    @FXML
    public void pane3 (MouseEvent event){
        pane3.setVisible(true);
    }

    @FXML
    public void back (MouseEvent event){
        pane3.setVisible(false);
    }

    public void condiciones(){
        if(up.isVisible()){
            String img = "main/resources/boundary.png";
            Image image = new Image(img);
            imgMesh.setImage(image);
            controler(false);
        } else{
            controler(true);
            setImage();
        }

    }
    
    
    public void setImage () {
        if (btn_mesh.getText().equals("Malla")) {
            String img = "main/resources/" + modelo[i][j];
            Image image = new Image(img);
            imgMesh.setImage(image);
        } else if (btn_mesh.getText().equals("Dominio")) {
            String img;
            if(flags){
                img = "main/resources/" + nodes[i][j];
            }else{
                img = "main/resources/" + mallado[i][j];
            }
            Image image = new Image(img);
            imgMesh.setImage(image);
        }
    }

    @FXML
    public void up (MouseEvent event){
        if(i == 1){
            i-=1;
        }else {
            i+=1;
        }
        setImage();
    }

    @FXML
    public void down (MouseEvent event){
        if(i == 0){
            i+=1;
        }else {
            i-=1;
        }
        setImage();

    }

    @FXML
    public void right (MouseEvent event){
        if(j == 7){
            j-=7;
        }else {
            j+=1;
        }
        setImage();
    }

    @FXML
    public void left (MouseEvent event){
        if(j == 0){
            j+=7;
        }else {
            j-=1;
        }
        setImage();
    }

    @FXML
    public void mesh (MouseEvent event){
        meshAux();
    }

    @FXML
    public void nod (MouseEvent event){
        if(flags){
            flags = false;
            setImage();
        } else {
            flags = true;
            setImage();
        }
    }


    public void meshAux(){
        controler(true);
        if(btn_mesh.getText().equals("Malla")){
            btn_mesh.setText("Dominio");
            setImage();
            nodos.setVisible(true);
        } else if(btn_mesh.getText().equals("Dominio")){
            btn_mesh.setText("Malla");
            nodos.setVisible(false);
            setImage();
        }
    }
    
    
    public void controler(Boolean flag){
        up.setVisible(flag);
        down.setVisible(flag);
        right.setVisible(flag);
        left.setVisible(flag);
        info1.setVisible(flag);
        info2.setVisible(flag);
        info3.setVisible(flag);
        info4.setVisible(!flag);
        info5.setVisible(!flag);
        info6.setVisible(!flag);
        info7.setVisible(!flag);
        info8.setVisible(!flag);
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
