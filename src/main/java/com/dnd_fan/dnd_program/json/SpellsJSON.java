package com.dnd_fan.dnd_program.json;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class SpellsJSON {
    public static List<String> getAvailableSpellsByClass(String charClass, int level) {
        JSONArray array = new JSONArray(JSONHelper.sSpellsJSON);
        List<String> usableSpells = new ArrayList<String>();

        for (int i = 0; i < array.length(); i ++) {
            JSONObject obj = array.getJSONObject(i);
            JSONArray classes = obj.getJSONArray("classes");
            boolean canUse = false;

            for (int j = 0; j < classes.length(); j ++) {
                if (classes.getJSONObject(j).getString("name").equals(charClass)) {
                    canUse = true;
                    break;
                }
            }

            if (!canUse)
                continue;

            if (obj.getInt("level") == level)
                usableSpells.add(obj.getString("name"));
        }

        return usableSpells;
    }
    public static int getSpellLevel(String spell) {
        JSONArray array = new JSONArray(JSONHelper.sSpellsJSON);

        for (int i = 0; i < array.length(); i ++) {
            JSONObject obj = array.getJSONObject(i);

            if (obj.getString("name").equals(spell))
                return obj.getInt("level");
        }

        return 0;
    }
}
