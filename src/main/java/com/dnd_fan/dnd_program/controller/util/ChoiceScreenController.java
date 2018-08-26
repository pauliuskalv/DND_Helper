package com.dnd_fan.dnd_program.controller.util;

import com.dnd_fan.dnd_program.util.EWindow;
import com.dnd_fan.dnd_program.util.UIUtil;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Pair;

import java.util.List;

public class ChoiceScreenController {
    @FXML
    private ListView<String> mChoicesList;
    @FXML
    private ListView<String> mChoiceChoices;
    @FXML
    private ListView<String> mSelectedItems;

    @FXML
    private Label mSelectNumberLabel;

    @FXML
    private Button mDoneButton;

    private Stage mWindowStage;
    private List<Pair<List<String>, Integer>> mItems;
    private int mSelectionCount;

    public ChoiceScreenController() {
        Platform.runLater(new Runnable() {
            public void run() {
                mChoicesList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
                    public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                        onChoiceListItemSelected();
                    }
                });

                mSelectNumberLabel.setText("");
                mDoneButton.setDisable(true);
            }
        });
    }

    @FXML
    private void onAddItemButtonClick() {
        if (mChoiceChoices.getSelectionModel().getSelectedItem() == null)
            return;

        if (mSelectionCount == 0)
            return;

        addItemToListView(mSelectedItems, mChoiceChoices.getSelectionModel().getSelectedItem());
        removeItemFromListView(mChoiceChoices, mChoiceChoices.getSelectionModel().getSelectedItem());

        mSelectionCount --;

        if (mSelectionCount == 0) {
            mDoneButton.setDisable(false);
        }

        updateNumberLabel();
    }

    @FXML
    private void onRemoveItemButtonClick() {
        if (mSelectedItems.getSelectionModel().getSelectedItem() == null)
            return;

        mDoneButton.setDisable(true);

        addItemToListView(mChoiceChoices, mSelectedItems.getSelectionModel().getSelectedItem());
        removeItemFromListView(mSelectedItems, mSelectedItems.getSelectionModel().getSelectedItem());

        mSelectionCount ++;
        updateNumberLabel();
    }

    private void addItemToListView(ListView<String> list, String toAdd) {
        ObservableList<String> toSetList = FXCollections.observableArrayList(list.getItems());

        toSetList.add(toAdd);

        list.setItems(toSetList.sorted());
    }

    private void removeItemFromListView(ListView<String> list, String toRemove) {
        ObservableList<String> toSetList = FXCollections.observableArrayList(list.getItems());

        toSetList.remove(toRemove);

        list.setItems(toSetList.sorted());
    }

    private void onChoiceListItemSelected() {
        int count = mItems.get(mChoicesList.getSelectionModel().getSelectedIndex()).getValue();
        List<String> items = mItems.get(mChoicesList.getSelectionModel().getSelectedIndex()).getKey();

        if (count == items.size()) {
            mChoiceChoices.getItems().removeAll(mChoiceChoices.getItems());
            mChoiceChoices.setDisable(true);

            mSelectedItems.setItems(FXCollections.observableArrayList(items));
            mDoneButton.setDisable(false);
            mSelectNumberLabel.setText("");
            return;
        } else {
            mDoneButton.setDisable(true);
        }

        mChoiceChoices.setItems(FXCollections.observableArrayList(items));

        mSelectionCount = count;
        updateNumberLabel();
    }

    private void updateNumberLabel() {
        mSelectNumberLabel.setText("Select " + mSelectionCount + "x more items");
    }

    @FXML
    private void onDoneButtonClick() {
        mWindowStage.close();
    }

    private void setStage(Stage stage) {
        mWindowStage = stage;
    }

    private void setChoices(List<Pair<List<String>, Integer>> choices) {
        mItems = choices;

        for (int i = 0; i < mItems.size(); i ++)
            mChoicesList.getItems().add("Choice " + (i + 1));
    }

    private List<String> getSelectedItems() {
        return mSelectedItems.getItems();
    }

    public static List<String> showAndWait(List<Pair<List<String>, Integer>> choices) {
        Stage windowStage = new Stage();
        windowStage.initModality(Modality.APPLICATION_MODAL);
        windowStage.setResizable(false);

        Pair<Scene, Object> pair = UIUtil.loadWindow(EWindow.CHOICE_SCREEN);

        ChoiceScreenController controller = (ChoiceScreenController)pair.getValue();

        controller.setChoices(choices);
        controller.setStage(windowStage);

        windowStage.setScene(pair.getKey());
        windowStage.showAndWait();

        return controller.getSelectedItems();
    }
}
