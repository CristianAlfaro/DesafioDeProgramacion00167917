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
import java.util.ResourceBundle;

import static jdk.nashorn.internal.parser.TokenType.CASE;

public class Step1Controller implements Initializable {

    double x = 0;
    double y = 0;

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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        focused(step1);
    }

    @FXML
    public void pass1 (MouseEvent event){
        passAux(1);
    }

    @FXML
    public void pass2 (MouseEvent event){
        passAux(2);
    }

    @FXML
    public void pass3 (MouseEvent event){
        passAux(3);
    }

    @FXML
    public void pass4 (MouseEvent event){
        passAux(4);
    }

    @FXML
    public void pass5 (MouseEvent event){
        passAux(5);
    }

    @FXML
    public void pass6 (MouseEvent event){
        passAux(6);
    }

    @FXML
    public void pass7 (MouseEvent event){
        passAux(7);
    }

    @FXML
    public void pass8 (MouseEvent event){
        passAux(8);
    }

    @FXML
    public void pass9 (MouseEvent event){
        passAux(9);
    }

    public void passAux (int pass){
        switch (pass){
            case 1:
                step2.setDisable(false);
                pane2();
                break;
            case 2:
                step3.setDisable(false);
                pane3();
                break;
            case 3:
                step4.setDisable(false);
                pane4();
                break;
            case 4:
                step5.setDisable(false);
                pane5();
                break;
            case 5:
                step6.setDisable(false);
                pane6();
                break;
            case 6:
                componentes.setDisable(false);
                pane7();
                break;
            case 7:
                ensamblaje.setDisable(false);
                pane8();
                break;
            case 8:
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
        paneAux();
        focused(step3);
        pane3.setVisible(true);
    }

    @FXML
    public void pane4 (){
        paneAux();
        focused(step4);
        pane4.setVisible(true);
    }

    @FXML
    public void pane5 (){
        paneAux();
        focused(step5);
        pane5.setVisible(true);
    }

    @FXML
    public void pane6 (){
        paneAux();
        focused(step6);
        pane6.setVisible(true);
    }

    @FXML
    public void pane7 (){
        paneAux();
        focused(componentes);
        pane7.setVisible(true);
    }

    @FXML
    public void pane8 (){
        paneAux();
        focused(ensamblaje);
        pane8.setVisible(true);
    }

    @FXML
    public void pane9 (){
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
    }

    public void focused(Button btn){
        btn.setStyle("-fx-background-color: #28354c;");
    }

    public void desfocused(Button btn){
        btn.setStyle("-fx-background-color: #161d2a;");
    }
}
