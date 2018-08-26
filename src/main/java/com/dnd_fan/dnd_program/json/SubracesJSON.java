package com.dnd_fan.dnd_program.json;

import com.dnd_fan.dnd_program.model.Subrace;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class SubracesJSON {
    public static List<String> getSubraces(String race) {
        JSONArray array = new JSONArray(JSONHelper.sSubracesJSON);

        List<String> toReturnSubraces = new ArrayList<String>();
        for (int i = 0; i < array.length(); i ++) {
            JSONObject obj = array.getJSONObject(i);
            if (obj.getJSONObject("race").getString("name").equals(race)) {
                toReturnSubraces.add(obj.getString("name"));
            }
        }

        return toReturnSubraces;
    }

    public Subrace getSubrace(String subrace) {
        // TODO

        return null;
    }
}
