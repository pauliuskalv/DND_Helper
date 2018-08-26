package com.dnd_fan.dnd_program.json;

import com.dnd_fan.dnd_program.controller.util.ChoiceScreenController;
import javafx.util.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class EquipmentJSON {
    public static List<String> getStartingEquipment(String charClass) {
        JSONArray array = new JSONArray(JSONHelper.sStartingEquipmentJSON);
        List<String> selectedItems = new ArrayList<String>();

        JSONObject obj = null;
        for (int i = 0; i < array.length(); i ++) {
            if (array.getJSONObject(i).getJSONObject("class").getString("name").equals(charClass))
                obj = array.getJSONObject(i);
        }

        int choiceCount = obj.getInt("choices_to_make");

        for (int i = 0; i < choiceCount; i ++) {
            // Show a selection screen for each choice
            JSONArray choice = obj.getJSONArray("choice_" + (i + 1));
            List<Pair<List<String>, Integer>> choiceList = new ArrayList<Pair<List<String>, Integer>>();

            for (int j = 0; j < choice.length(); j ++) {
                JSONObject selectionObject = choice.getJSONObject(j);
                JSONArray selectionArray = selectionObject.getJSONArray("from");

                int invChoiceCount = selectionObject.getInt("choose");
                List<String> list = new ArrayList<String>();

                for (int k = 0; k < selectionArray.length(); k ++)
                    for (int l = 0; l < selectionArray.getJSONObject(k).getInt("quantity"); l ++)
                        list.add(selectionArray.getJSONObject(k).getJSONObject("item").getString("name"));

                choiceList.add(new Pair<List<String>, Integer>(list, invChoiceCount));
            }

            selectedItems.addAll(ChoiceScreenController.showAndWait(choiceList));
        }

        return null;
    }

    public static String getItemDescription(String item) {
        // TODO: Implement

        return null;
    }
}
