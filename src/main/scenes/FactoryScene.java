package main.scenes;

import com.sun.org.apache.bcel.internal.generic.SWITCH;
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
            case DOMAIN:
                try {
                    fxml = FXMLLoader.load(app.getClass().getResource("fxml/domain.fxml"));
                    return new Scene(fxml);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case BOUNDARY:
                try {
                    fxml = FXMLLoader.load(app.getClass().getResource("fxml/boundary.fxml"));
                    return new Scene(fxml);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case MESH:
                try {
                    fxml = FXMLLoader.load(app.getClass().getResource("fxml/mesh.fxml"));
                    return new Scene(fxml);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case TABLE:
                try {
                    fxml = FXMLLoader.load(app.getClass().getResource("fxml/table.fxml"));
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
            case STEP2:
                try {
                    fxml = FXMLLoader.load(app.getClass().getResource("fxml/step2.fxml"));
                    return new Scene(fxml);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case STEP3:
                try {
                    fxml = FXMLLoader.load(app.getClass().getResource("fxml/step3.fxml"));
                    return new Scene(fxml);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case STEP4:
                try {
                    fxml = FXMLLoader.load(app.getClass().getResource("fxml/step4.fxml"));
                    return new Scene(fxml);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case STEP5:
                try {
                    fxml = FXMLLoader.load(app.getClass().getResource("fxml/step5.fxml"));
                    return new Scene(fxml);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case STEP6:
                try {
                    fxml = FXMLLoader.load(app.getClass().getResource("fxml/step6.fxml"));
                    return new Scene(fxml);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case COMPONENTS:
                try {
                    fxml = FXMLLoader.load(app.getClass().getResource("fxml/component.fxml"));
                    return new Scene(fxml);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case ASSEMBLY:
                try {
                    fxml = FXMLLoader.load(app.getClass().getResource("fxml/assembly.fxml"));
                    return new Scene(fxml);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case STEP8:
                try {
                    fxml = FXMLLoader.load(app.getClass().getResource("fxml/step8.fxml"));
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
