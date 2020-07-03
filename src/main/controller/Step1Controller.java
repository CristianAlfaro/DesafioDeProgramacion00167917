package main.controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import main.mainApp;
import main.scenes.FactoryScene;
import main.scenes.TypeScene;

import java.awt.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import static jdk.nashorn.internal.parser.TokenType.CASE;

public class Step1Controller implements Initializable {

    double x = 0;
    double y = 0;

    int i_5 = 0;
    int i_6 = 0;
    int currentPane = 1;

    @FXML private Pane pane1;
    @FXML private Pane pane2;
    @FXML private Pane pane3;
    @FXML private Pane pane4;
    @FXML private Pane pane5;
    @FXML private Pane pane6;
    @FXML private Pane pane7;
    @FXML private Pane pane8;
    @FXML private Pane pane9;

    @FXML private Button step1;
    @FXML private Button step2;
    @FXML private Button step3;
    @FXML private Button step4;
    @FXML private Button step5;
    @FXML private Button step6;
    @FXML private Button componentes;
    @FXML private Button ensamblaje;
    @FXML private Button step8;
    @FXML private Button home;

    @FXML private Pane pane51;
    @FXML private Pane pane52;
    @FXML private Pane pane53;

    @FXML private Pane pane61;
    @FXML private Pane pane62;
    @FXML private Pane pane63;

    @FXML private Button anterior;
    @FXML private Button siguiente;

    ArrayList<Pane> paneS5 = new ArrayList<Pane>();
    ArrayList<Pane> paneS6 = new ArrayList<Pane>();

    private ArrayList<Pane> steps;
    private int i;


    @FXML
    public void back (MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(FactoryScene.getScene(TypeScene.MODEL, mainApp.getInstance()));
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

    @FXML
    public void pass (){
        passAux(currentPane);
    }

    public void passAux (int pass){
        switch (pass){
            case 1:
                currentPane = 2;
                step2.setDisable(false);
                pane2();
                break;
            case 2:
                currentPane = 3;
                step3.setDisable(false);
                pane3();
                break;
            case 3:
                currentPane = 4;
                step4.setDisable(false);
                pane4();
                break;
            case 4:
                currentPane = 5;
                step5.setDisable(false);
                pane5();
                break;
            case 5:
                currentPane = 6;
                step6.setDisable(false);
                pane6();
                break;
            case 6:
                currentPane = 7;
                componentes.setDisable(false);
                pane7();
                break;
            case 7:
                currentPane = 8;
                ensamblaje.setDisable(false);
                pane8();
                break;
            case 8:
                currentPane = 9;
                step8.setDisable(false);
                pane9();
                break;
            case 9:
                home.setDisable(false);
                break;
        }
    }

    @FXML
    public void pane1 (){
        currentPane = 1;
        paneAux();
        focused(step1);
        pane1.setVisible(true);
    }

    @FXML
    public void pane2 (){
        paneAux();
        focused(step2);
        pane2.setVisible(true);
    }

    @FXML
    public void pane3 (){
        currentPane = 3;
        paneAux();
        focused(step3);
        pane3.setVisible(true);
    }

    @FXML
    public void pane4 (){
        currentPane = 4;
        paneAux();
        focused(step4);
        pane4.setVisible(true);
    }

    @FXML
    public void pane5 (){
        currentPane = 5;
        paneAux();
        focused(step5);
        pane5.setVisible(true);
        moveAux(paneS5, i_5);
    }

    @FXML
    public void pane6 (){
        currentPane = 6;
        paneAux();
        focused(step6);
        pane6.setVisible(true);
        moveAux(paneS6, i_6);
    }

    @FXML
    public void pane7 (){
        currentPane = 7;
        paneAux();
        focused(componentes);
        pane7.setVisible(true);
    }

    @FXML
    public void pane8 (){
        currentPane = 8;
        paneAux();
        focused(ensamblaje);
        pane8.setVisible(true);
    }

    @FXML
    public void pane9 (){
        currentPane = 9;
        paneAux();
        focused(step8);
        pane9.setVisible(true);
    }

    public void paneAux(){
        pane1.setVisible(false);
        pane2.setVisible(false);
        pane3.setVisible(false);
        pane4.setVisible(false);
        pane5.setVisible(false);
        pane6.setVisible(false);
        pane7.setVisible(false);
        pane8.setVisible(false);
        pane9.setVisible(false);
        desfocused(step1);
        desfocused(step2);
        desfocused(step3);
        desfocused(step4);
        desfocused(step5);
        desfocused(step6);
        desfocused(componentes);
        desfocused(ensamblaje);
        desfocused(step8);
        anterior.setDisable(true);
        siguiente.setDisable(true);
    }

    public void focused(Button btn){
        btn.setStyle("-fx-background-color: #28354c;");
    }

    public void desfocused(Button btn){
        btn.setStyle("-fx-background-color: #161d2a;");
    }

    @FXML
    public void siguiente(){
        if(currentPane == 5 && i_5 < paneS5.size()-1){
            i_5++;
            stepAux(paneS5, i_5, "adelante");
            moveAux(paneS5, i_5);
        }else if(currentPane == 6 && i_6 < paneS6.size()-1){
            i_6++;
            stepAux(paneS6, i_6, "adelante");
            moveAux(paneS6, i_6);
        }
    }

    @FXML
    public void anterior(){
        if(currentPane == 5 && i_5 > 0){
            i_5--;
            stepAux(paneS5, i_5, "atras");
            moveAux(paneS5, i_5);
        }else if(currentPane == 6 && i_6 > 0){
            i_6--;
            stepAux(paneS6, i_6, "atras");
            moveAux(paneS6, i_6);
        }
    }

    public void stepAux(ArrayList<Pane> steps, int i, String adonde){
        if (adonde == "adelante"){
            steps.get(i-1).setVisible(false);
            steps.get(i).setVisible(true);
        } else {
            steps.get(i+1).setVisible(false);
            steps.get(i).setVisible(true);
        }

    }

    public void moveAux(ArrayList<Pane> steps, int i){
        if(i == 0){
            anterior.setDisable(true);
            siguiente.setDisable(false);
        }else if(i == steps.size()-1){
            anterior.setDisable(false);
            siguiente.setDisable(true);
        }else{
            anterior.setDisable(false);
            siguiente.setDisable(false);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        focused(step1);
        paneS5.add(pane51);
        paneS5.add(pane52);
        paneS5.add(pane53);
        paneS6.add(pane61);
        paneS6.add(pane62);
        paneS6.add(pane63);
    }
}
