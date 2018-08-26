package com.dnd_fan.dnd_program.json;

import org.json.JSONArray;
import org.json.JSONObject;

public class RacesJSON {
    public static String[] getRaces() {
        JSONArray array = new JSONArray(JSONHelper.sRacesJSON);

        String[] toReturn = new String[array.length()];

        for (int i = 1;i < array.length(); i ++) {
            toReturn[i] = array.getJSONObject(i).getString("name");
        }

        return toReturn;
    }
}
