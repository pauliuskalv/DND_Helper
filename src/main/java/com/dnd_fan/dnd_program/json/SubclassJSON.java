package com.dnd_fan.dnd_program.json;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class SubclassJSON {
    public static List<String> getSubclasses(String charClass) {
        JSONArray array = new JSONArray(JSONHelper.sSubclassesJSON);
        List<String> toReturnSubclasses = new ArrayList<String>();

        for (int i = 0; i < array.length(); i ++)
            if (array.getJSONObject(i).getJSONObject("class").getString("name").equals(charClass))
                toReturnSubclasses.add(array.getJSONObject(i).getString("name"));

        return toReturnSubclasses;
    }

    public static String getSubclassDescription(String subclass) {
        JSONArray array = new JSONArray(JSONHelper.sSubclassesJSON);

        for (int i = 0; i < array.length(); i ++)
            if (array.getJSONObject(i).getString("name").equals(subclass))
                return array.getJSONObject(i).getJSONArray("desc").getString(0);

        return null;
    }
}
