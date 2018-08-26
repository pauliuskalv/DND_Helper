package com.dnd_fan.dnd_program.controller;

import com.dnd_fan.dnd_program.MainWindow;
import com.dnd_fan.dnd_program.util.EWindow;
import com.dnd_fan.dnd_program.util.UIUtil;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import javafx.util.Pair;

public class SelectScreenController {
    @FXML
    private ListView<String> mCharacterList;
    @FXML
    private Button mSelectCharacterButton;

    public SelectScreenController() {
        Platform.runLater(new Runnable() {
            public void run() {
                mSelectCharacterButton.setDisable(true);
                mCharacterList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
                    public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                        onCharacterListItemSelected();
                    }
                });
            }
        });
    }

    @FXML
    private void onCharacterListItemSelected() {
        String selectedItem = mCharacterList.getSelectionModel().getSelectedItem();

        System.out.println(selectedItem);
    }

    @FXML
    private void onCreateButtonClick() {
        Pair<Scene, Object> pair = UIUtil.loadWindow(EWindow.NEW_CHARACTER_SCREEN_ONE);

        MainWindow.get().close();

        Stage characterCreationScreen = new Stage();
        characterCreationScreen.setScene(pair.getKey());
        characterCreationScreen.show();
    }

    @FXML
    private void onSelectCharacterClick() {
        // TODO: Load an already created character
    }
}
