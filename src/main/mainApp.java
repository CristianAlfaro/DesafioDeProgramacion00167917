package main;

import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import main.scenes.FactoryScene;
import main.scenes.TypeScene;


public class mainApp extends Application {

    private static mainApp main;

    @Override

    public void start(Stage primaryStage) throws Exception {


        primaryStage.setScene(FactoryScene.getScene(TypeScene.MAIN , this));
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.show();
        main = this;
    }

    public static void main(String... args) {
        launch(args);

    }

    public static mainApp obtenerdirrectorio() {
        main = new mainApp();
        return main;
    }

    public static mainApp getInstance() {
        return main;
    }

}
