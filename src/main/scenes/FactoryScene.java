package main.scenes;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.io.IOException;

public class FactoryScene {

    public static Scene getScene(TypeScene type, Application app) {
        Parent fxml;
        switch (type) {
            case MAIN:
                try {
                    fxml = FXMLLoader.load(app.getClass().getResource("fxml/main.fxml"));
                    return new Scene(fxml);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case MODEL:
                try {
                    fxml = FXMLLoader.load(app.getClass().getResource("fxml/model.fxml"));
                    return new Scene(fxml);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                break;
            case STEP1:
                try {
                    fxml = FXMLLoader.load(app.getClass().getResource("fxml/step1.fxml"));
                    return new Scene(fxml);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case BYEBYE:
                try {
                    fxml = FXMLLoader.load(app.getClass().getResource("fxml/byebye.fxml"));
                    return new Scene(fxml);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
        }
        return null;
    }
}
