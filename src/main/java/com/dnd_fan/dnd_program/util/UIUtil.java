package com.dnd_fan.dnd_program.util;

import com.dnd_fan.dnd_program.WindowPath;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.util.Pair;

import java.io.IOException;

public class UIUtil {
    /**
     * Loads a specific window and it's controller
     * @return
     */
    public static Pair<Scene, Object> loadWindow(EWindow window) {
        try {
            FXMLLoader loader = null;

            switch (window) {
                case NEW_CHARACTER_SCREEN_ONE:
                    loader = new FXMLLoader(Object.class.getResource(WindowPath.NEW_CHARACTER_SCREEN_ONE_PATH));
                    break;
                case NEW_CHARACTER_SCREEN_TWO:
                    loader = new FXMLLoader(Object.class.getResource(WindowPath.NEW_CHARACTER_SCREEN_TWO_PATH));
                    break;
                case SELECT_CHARACTER_SCREEN:
                    loader = new FXMLLoader(Object.class.getResource(WindowPath.SELECT_SCREEN_PATH));
                    break;
                case CHOICE_SCREEN:
                    loader = new FXMLLoader(Object.class.getResource(WindowPath.CHOICE_SCREEN_PATH));
                    break;
            }

            Parent root = loader.load();
            Object controller = loader.getController();

            return new Pair<Scene, Object>(new Scene(root), controller);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
