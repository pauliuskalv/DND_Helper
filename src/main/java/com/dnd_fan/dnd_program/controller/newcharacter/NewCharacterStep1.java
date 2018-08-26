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
    private ChoiceBox<Integer> mStrengthChoiceBox;
    @FXML
    private ChoiceBox<Integer> mDexterityChoiceBox;
    @FXML
    private ChoiceBox<Integer> mConstitutionChoiceBox;
    @FXML
    private ChoiceBox<Integer> mIntelligenceChoiceBox;
    @FXML
    private ChoiceBox<Integer> mWisdomChoiceBox;
    @FXML
    private ChoiceBox<Integer> mCharismaChoiceBox;

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
                mClassList.getItems().remove(0);

                mClassList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
                    public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                        onClassListItemSelected();
                    }
                });

                mSelectStartingInventoryButton.setDisable(true);

                onStatChoiceBoxClicked();
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

    @FXML
    private void onStatChoiceBoxClicked() {
        if (mSettingSelection)
            return;

        for (SettablePair<Boolean, Integer> item : mStatChoices)
            item.setKey(false);

        Integer str = null, dex = null, con = null, intell = null, wis = null, cha = null;

        if (mStrengthChoiceBox.getSelectionModel().getSelectedItem() != null) {
            disableStatChoice(mStrengthChoiceBox.getValue());
            str = mStrengthChoiceBox.getSelectionModel().getSelectedItem();
        }
        if (mDexterityChoiceBox.getSelectionModel().getSelectedItem() != null) {
            disableStatChoice(mDexterityChoiceBox.getValue());
            dex = mDexterityChoiceBox.getSelectionModel().getSelectedItem();
        }
        if (mConstitutionChoiceBox.getSelectionModel().getSelectedItem() != null) {
            disableStatChoice(mConstitutionChoiceBox.getValue());
            con = mConstitutionChoiceBox.getSelectionModel().getSelectedItem();
        }
        if (mIntelligenceChoiceBox.getSelectionModel().getSelectedItem() != null) {
            disableStatChoice(mIntelligenceChoiceBox.getValue());
            intell = mIntelligenceChoiceBox.getSelectionModel().getSelectedItem();
        }
        if (mWisdomChoiceBox.getSelectionModel().getSelectedItem() != null) {
            disableStatChoice(mWisdomChoiceBox.getValue());
            wis = mWisdomChoiceBox.getSelectionModel().getSelectedItem();
        }
        if (mCharismaChoiceBox.getSelectionModel().getSelectedItem() != null) {
            disableStatChoice(mCharismaChoiceBox.getValue());
            cha = mCharismaChoiceBox.getSelectionModel().getSelectedItem();
        }

        List<Integer> list = new ArrayList<Integer>();
        list.add(null);

        for (int i = 0; i < mStatChoices.size(); i ++)
            if (!mStatChoices.get(i).getKey())
                list.add(mStatChoices.get(i).getValue());

        mSettingSelection = true;

        mStrengthChoiceBox.setItems(FXCollections.observableArrayList(list));
        mDexterityChoiceBox.setItems(FXCollections.observableArrayList(list));
        mConstitutionChoiceBox.setItems(FXCollections.observableArrayList(list));
        mIntelligenceChoiceBox.setItems(FXCollections.observableArrayList(list));
        mWisdomChoiceBox.setItems(FXCollections.observableArrayList(list));
        mCharismaChoiceBox.setItems(FXCollections.observableArrayList(list));

        if (str != null)
            mStrengthChoiceBox.getItems().add(str);
        mStrengthChoiceBox.getSelectionModel().select(str);

        if (dex != null)
            mDexterityChoiceBox.getItems().add(dex);
        mDexterityChoiceBox.getSelectionModel().select(dex);

        if (con != null)
            mConstitutionChoiceBox.getItems().add(con);
        mConstitutionChoiceBox.getSelectionModel().select(con);

        if (intell != null)
            mIntelligenceChoiceBox.getItems().add(intell);
        mIntelligenceChoiceBox.getSelectionModel().select(intell);

        if (wis != null)
            mWisdomChoiceBox.getItems().add(wis);
        mWisdomChoiceBox.getSelectionModel().select(wis);

        if (cha != null)
            mCharismaChoiceBox.getItems().add(cha);
        mCharismaChoiceBox.getSelectionModel().select(cha);

        mSettingSelection = false;
    }

    private void disableStatChoice(int value) {
        for (SettablePair<Boolean, Integer> pair : mStatChoices) {
            if (pair.getValue() == value) {
                pair.setKey(true);
                break;
            }
        }
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
