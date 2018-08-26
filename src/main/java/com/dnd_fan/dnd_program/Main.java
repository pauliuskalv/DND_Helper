package com.dnd_fan.dnd_program;

import com.dnd_fan.dnd_program.json.JSONHelper;
import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.json.JSONArray;
import org.json.JSONObject;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Set the main window
        MainWindow.set(primaryStage);

        Parent root = FXMLLoader.load(getClass().getResource("/gui/SelectScreen.fxml"));
        primaryStage.setTitle("DND Helper");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        // Initialize classes
        JSONHelper.init();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
