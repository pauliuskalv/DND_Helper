package com.dnd_fan.dnd_program.json;

import com.dnd_fan.dnd_program.model.ClassSavingThrows;
import com.dnd_fan.dnd_program.model.ClassSkillProficiencies;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

public class ClassJSON {
    public static String[] getClasses() {
        JSONArray array = new JSONArray(JSONHelper.sClassesJSON);

        String[] toReturn = new String[array.length()];

        for (int i = 0; i < array.length(); i ++) {
            System.out.println(array.getJSONObject(i).getString("name"));
            toReturn[i] = array.getJSONObject(i).getString("name");
        }

        return toReturn;
    }

    public static ClassSavingThrows getClassSavingThrows(String charClass) {
        JSONArray array = new JSONArray(JSONHelper.sClassesJSON);

        boolean strength = false;
        boolean dexterity = false;
        boolean constitution = false;
        boolean intelligence = false;
        boolean wisdom = false;
        boolean charisma = false;

        JSONObject object = null;
        for (int i = 0; i < array.length(); i ++) {
            if (array.getJSONObject(i).getString("name").equals(charClass)) {
                object = array.getJSONObject(i);
                break;
            }
        }

        JSONArray savingThrows = object.getJSONArray("saving_throws");

        for (int i = 0; i < savingThrows.length(); i ++) {
            String savingThrow = savingThrows.getJSONObject(i).getString("name");

            if (savingThrow.equals("STR"))
                strength = true;
            else
                if (savingThrow.equals("DEX"))
                    dexterity = true;
            else
                if (savingThrow.equals("CON"))
                    constitution = true;
            else
                if (savingThrow.equals("INT"))
                    intelligence = true;
            else
                if (savingThrow.equals("WIS"))
                    wisdom = true;
            else
                if (savingThrow.equals("CHA"))
                    charisma = true;
        }

        return new ClassSavingThrows(
                strength,
                dexterity,
                constitution,
                intelligence,
                wisdom,
                charisma
        );
    }

    public static ClassSkillProficiencies getClassSkillProficiencies(String charClass) {
        JSONArray array = new JSONArray(JSONHelper.sClassesJSON);

        boolean acrobatics = false;
        boolean animalHandling = false;
        boolean arcana = false;
        boolean athletics = false;
        boolean deception = false;
        boolean history = false;
        boolean insight = false;
        boolean intimidation = false;
        boolean investigation = false;
        boolean medicine = false;
        boolean nature = false;
        boolean perception = false;
        boolean performance = false;
        boolean persuasion = false;
        boolean religion = false;
        boolean sleightOfHand = false;
        boolean stealth = false;
        boolean survival = false;

        JSONObject object = null;
        for (int i = 1; i < array.length(); i ++) {
            if (array.getJSONObject(i).getString("name").equals(charClass)) {
                object = array.getJSONObject(i);
                break;
            }
        }

        JSONArray profArray = object.getJSONArray("proficiency_choices").getJSONObject(0).getJSONArray("from");

        for (int i = 0; i < profArray.length(); i ++) {
            JSONObject obj = profArray.getJSONObject(i);

            String prof = obj.getString("name");

            if (prof.contains("Acrobatics"))
                acrobatics = true;
            else
                if (prof.contains("Animal Handling"))
                    animalHandling = true;
            else
                if (prof.contains("Arcana"))
                    arcana = true;
            else
                if (prof.contains("Athletics"))
                    athletics = true;
            else
                if (prof.contains("Deception"))
                    deception = true;
            else
                if (prof.contains("History"))
                    history = true;
            else
                if (prof.contains("Insight"))
                    insight = true;
            else
                if (prof.contains("Intimidation"))
                    intimidation = true;
            else
                if (prof.contains("Investigation"))
                    investigation = true;
            else
                if (prof.contains("Medicine"))
                    medicine = true;
            else
                if (prof.contains("Nature"))
                    nature = true;
            else
                if (prof.contains("Perception"))
                    perception = true;
            else
                if (prof.contains("Performance"))
                    performance = true;
            else
                if (prof.contains("Persuasion"))
                    persuasion = true;
            else
                if (prof.contains("Religion"))
                    religion = true;
            else
                if (prof.contains("Sleight of Hand"))
                    sleightOfHand = true;
            else
                if (prof.contains("Stealth"))
                    stealth = true;
            else
                if (prof.contains("Survival"))
                    survival = true;
        }

        return new ClassSkillProficiencies(
                acrobatics,
                animalHandling,
                arcana,
                athletics,
                deception,
                history,
                insight,
                intimidation,
                investigation,
                medicine,
                nature,
                perception,
                performance,
                persuasion,
                religion,
                sleightOfHand,
                stealth,
                survival
        );
    }

    public static List<String> getClassProficiencies(String charClass) {
        JSONArray array = new JSONArray(JSONHelper.sClassesJSON);

        JSONObject object = null;
        for (int i = 0; i < array.length(); i ++) {
            if (array.getJSONObject(i).getString("name").equals(charClass)) {
                object = array.getJSONObject(i);
                break;
            }
        }

        JSONArray classProficiencies = object.getJSONArray("proficiencies");

        for (int i = 0; i < classProficiencies.length(); i ++) {
            // TODO
        }

        return null;
    }

    public static String getClassDescription(String charClass) {
        JSONArray array = new JSONArray(JSONHelper.sClassDescriptionJSON);

        for (int i = 0; i < array.length(); i ++) {
            if (array.getJSONObject(i).getString("name").equals(charClass))
                return array.getJSONObject(i).getString("desc");
        }

        return null;
    }

    public static int getSpellsCountByClass(String charClass, int level, int spellLevel) {
        JSONArray array = new JSONArray(JSONHelper.sLevelsJSON);

        for (int i = 0; i < array.length(); i ++) {
            JSONObject obj = array.getJSONObject(i);
            JSONObject classes = obj.getJSONObject("class");

            if (!classes.getString("name").equals(charClass))
                continue;

            if (obj.getInt("level") != level)
                continue;

            System.out.println(obj.toString());

            JSONObject spellcastingInfo = obj.getJSONObject("spellcasting");
            if (spellcastingInfo.length() == 0)
                return 0;

            if (spellLevel == 0) {
                if (spellcastingInfo.has("cantrips_known"))
                    return spellcastingInfo.getInt("cantrips_known");
                else
                    return 0;
            } else {
                return  spellcastingInfo.getInt("spell_slots_level_" + spellLevel);
            }
        }

        return 0;
    }
}
