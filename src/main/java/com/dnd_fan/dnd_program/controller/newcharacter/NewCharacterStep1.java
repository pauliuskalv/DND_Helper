package com.dnd_fan.dnd_program.controller.newcharacter;

import com.dnd_fan.dnd_program.controller.util.ChoiceScreenController;
import com.dnd_fan.dnd_program.json.*;
import com.dnd_fan.dnd_program.util.SettablePair;
import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.List;

public class NewCharacterStep1 {
    @FXML
    private ImageView mCharacterImageView;
    @FXML
    private Button mChooseCharacterImage;

    @FXML
    private TextField mCharacterNameField;
    @FXML
    private ChoiceBox<String> mRaceChoiceBox;
    @FXML
    private ChoiceBox<String> mSubraceChoiceBox;

    private ArrayList<SettablePair<Boolean, Integer>> mStatChoices;
    private boolean mSettingSelection;
    @FXML
    private Spinner<Integer> mStrengthChoiceBox;
    @FXML
    private Spinner<Integer> mDexterityChoiceBox;
    @FXML
    private Spinner<Integer> mConstitutionChoiceBox;
    @FXML
    private Spinner<Integer> mIntelligenceChoiceBox;
    @FXML
    private Spinner<Integer> mWisdomChoiceBox;
    @FXML
    private Spinner<Integer> mCharismaChoiceBox;

    @FXML
    private ListView<String> mClassList;
    @FXML
    private Label mClassDescription;
    @FXML
    private ChoiceBox<String> mSubclassList;
    @FXML
    private Label mSubclassDescription;

    private int mCantripsAllowed;
    private int mSpellsAllowed;
    @FXML
    private ListView<String> mAvailableSpells;
    @FXML
    private ListView<String> mSelectedSpells;

    @FXML
    private Button mSelectStartingInventoryButton;

    public NewCharacterStep1() {
        Platform.runLater(new Runnable() {
            public void run() {
                // Set the race choice box values
                mRaceChoiceBox.setItems(FXCollections.observableArrayList(RacesJSON.getRaces()));
                mRaceChoiceBox.getItems().remove(0);
                mRaceChoiceBox.setValue(mRaceChoiceBox.getItems().get(0));
                mRaceChoiceBox.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent actionEvent) {
                        updateSubracesChoiceBox();
                    }
                });

                // Set the subrace choice box values
                mSubraceChoiceBox.setItems(FXCollections.observableArrayList(SubracesJSON.getSubraces(mRaceChoiceBox.getValue())));
                mSubraceChoiceBox.getItems().remove(0);
                mSubraceChoiceBox.setValue(mSubraceChoiceBox.getItems().get(0));

                // Set the stat choice selection

                mStatChoices = new ArrayList<SettablePair<Boolean, Integer>>();

                // Add an effect on the ImageView
                mChooseCharacterImage.setOnMouseEntered(new EventHandler<MouseEvent>() {
                    public void handle(MouseEvent mouseEvent) {
                        FadeTransition transition = new FadeTransition();
                        transition.setFromValue(0.2);
                        transition.setToValue(1.0);
                        transition.setNode(mChooseCharacterImage);
                        transition.play();
                    }
                });

                mChooseCharacterImage.setOnMouseExited(new EventHandler<MouseEvent>() {
                    public void handle(MouseEvent mouseEvent) {
                        FadeTransition transition = new FadeTransition();
                        transition.setFromValue(1.0);
                        transition.setToValue(0.2);
                        transition.setNode(mChooseCharacterImage);
                        transition.play();
                    }
                });

                mStatChoices.add(new SettablePair<Boolean, Integer>(false, 8));
                mStatChoices.add(new SettablePair<Boolean, Integer>(false, 10));
                mStatChoices.add(new SettablePair<Boolean, Integer>(false, 12));
                mStatChoices.add(new SettablePair<Boolean, Integer>(false, 13));
                mStatChoices.add(new SettablePair<Boolean, Integer>(false, 14));
                mStatChoices.add(new SettablePair<Boolean, Integer>(false, 15));

                mClassList.setItems(FXCollections.observableArrayList(ClassJSON.getClasses()));

                mClassList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
                    public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                        onClassListItemSelected();
                    }
                });

                mSelectStartingInventoryButton.setDisable(true);
            }
        });
    }

    private void updateSubracesChoiceBox() {
        ObservableList<String> items = FXCollections.observableArrayList(SubracesJSON.getSubraces(mRaceChoiceBox.getValue()));

        if (items.size() > 0) {
            mSubraceChoiceBox.setItems(items);
            mSubraceChoiceBox.setDisable(false);
            mSubraceChoiceBox.setValue(mSubraceChoiceBox.getItems().get(0));
        }
        else
            mSubraceChoiceBox.setDisable(true);
    }

    private void onClassListItemSelected() {
        // Load the subrace selection
        mSubclassList.setItems(FXCollections.observableArrayList(SubclassJSON.getSubclasses(mClassList.getSelectionModel().getSelectedItem())));
        mSubclassList.getSelectionModel().select(mSubclassList.getItems().get(0));

        mClassDescription.setText(ClassJSON.getClassDescription(mClassList.getSelectionModel().getSelectedItem()));
    }

    @FXML
    private void onSubclassSelected() {
        mSubclassDescription.setText(SubclassJSON.getSubclassDescription(mSubclassList.getValue()));

        mSelectedSpells.getItems().removeAll(mSelectedSpells.getItems());

        mCantripsAllowed = ClassJSON.getSpellsCountByClass(mClassList.getSelectionModel().getSelectedItem(), 1, 0);
        mSpellsAllowed = ClassJSON.getSpellsCountByClass(mClassList.getSelectionModel().getSelectedItem(), 1, 1);

        loadAvailableSpells();
        mSelectStartingInventoryButton.setDisable(false);
    }

    private void loadAvailableSpells() {
        ObservableList<String> spells = FXCollections.observableArrayList();

        if (mCantripsAllowed != 0)
            spells.addAll(SpellsJSON.getAvailableSpellsByClass(mClassList.getSelectionModel().getSelectedItem(), 0));

        if (mSpellsAllowed != 0)
            spells.addAll(SpellsJSON.getAvailableSpellsByClass(mClassList.getSelectionModel().getSelectedItem(), 1));

        spells = spells.sorted();

        mAvailableSpells.setItems(spells);
        mAvailableSpells.scrollTo(0);
    }

    @FXML
    private synchronized void onSpellAddedToList() {
        if (mAvailableSpells.getSelectionModel().getSelectedItem() == null)
            return;

        int addedSpellLevel = SpellsJSON.getSpellLevel(mAvailableSpells.getSelectionModel().getSelectedItem());

        if (addedSpellLevel == 0)
            mCantripsAllowed --;
        else
            mSpellsAllowed --;

        addItemToListView(mSelectedSpells, mAvailableSpells.getSelectionModel().getSelectedItem());
        removeItemFromListView(mAvailableSpells, mAvailableSpells.getSelectionModel().getSelectedItem());

        if (mCantripsAllowed == 0) {
            for (String spell : SpellsJSON.getAvailableSpellsByClass(mClassList.getSelectionModel().getSelectedItem(), 0))
                removeItemFromListView(mAvailableSpells, spell);
        }

        if (mSpellsAllowed == 0) {
            for (String spell : SpellsJSON.getAvailableSpellsByClass(mClassList.getSelectionModel().getSelectedItem(), 1))
                removeItemFromListView(mAvailableSpells, spell);
        }
    }

    @FXML
    private synchronized void onSpellRemovedFromList() {
        if (mSelectedSpells.getSelectionModel().getSelectedItem() == null)
            return;

        int removedSpellLevel = SpellsJSON.getSpellLevel(mSelectedSpells.getSelectionModel().getSelectedItem());

        if (removedSpellLevel == 0)
            mCantripsAllowed ++;
        else
            mSpellsAllowed ++;

        addItemToListView(mAvailableSpells, mSelectedSpells.getSelectionModel().getSelectedItem());
        removeItemFromListView(mSelectedSpells, mSelectedSpells.getSelectionModel().getSelectedItem());
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

    @FXML
    private void onSelectStartingInventoryButtonClicked() {
        EquipmentJSON.getStartingEquipment(mClassList.getSelectionModel().getSelectedItem());
    }
}
