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
            case STAGE2:
                try {
                    fxml = FXMLLoader.load(app.getClass().getResource("fxml/stage2.fxml"));
                    return new Scene(fxml);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
        }
        return null;
    }
}
