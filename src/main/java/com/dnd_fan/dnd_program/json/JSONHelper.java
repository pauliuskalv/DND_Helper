package com.dnd_fan.dnd_program.json;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;

import java.io.IOException;
import java.nio.charset.Charset;

public class JSONHelper {
    // TODO: Implement this
    private static boolean sRAMMode = false;

    private static final Charset DEFAULT_CHARSET = Charsets.UTF_8;

    static String sAbilityScoresJSON;
    private static final String ABILITY_SCORES_PATH = "5e-SRD-Ability-Scores.json";

    static String sClassesJSON;
    private static final String CLASSES_PATH = "5e-SRD-Classes.json";

    static String sConditionsJSON;
    private static final String CONDITIONS_PATH = "5e-SRD-Conditions.json";

    static String sDamageTypesJSON;
    private static final String DAMAGE_TYPES = "5e-SRD-Damage-Types.json";

    static String sEquipmentJSON;
    private static final String EQUIPMENT_PATH = "5e-SRD-Equipment.json";

    static String sEquipmentCategoriesJSON;
    private static final String EQUIPMENT_CATEGORIES_PATH = "5e-SRD-Equipment-Categories.json";

    static String sFeaturesJSON;
    private static final String FEATURES_PATH = "5e-SRD-Features.json";

    static String sLanguagesJSON;
    private static final String LANGUAGES_PATH = "5e-SRD-Languages.json";

    static String sLevelsJSON;
    private static final String LEVELS_PATH = "5e-SRD-Levels.json";

    static String sMagicSchoolsJSON;
    private static final String MAGIC_SCHOOLS_PATH = "5e-SRD-Magic-Schools.json";

    static String sMonstersJSON;
    private static final String MONSTERS_PATH = "5e-SRD-Monsters.json";

    static String sProficienciesJSON;
    private static final String PROFICIENCIES_PATH = "5e-SRD-Proficiencies.json";

    static String sRacesJSON;
    private static final String RACES_PATH = "5e-SRD-Races.json";

    static String sSkillsJSON;
    private static final String SKILLS_PATH = "5e-SRD-Skills.json";

    static String sSpellcastingJSON;
    private static final String SPELLCASTING_PATH = "5e-SRD-Spellcasting.json";

    static String sSpellsJSON;
    private static final String SPELLS_PATH = "5e-SRD-Spells.json";

    static String sStartingEquipmentJSON;
    private static final String STARTING_EQUIPMENT_PATH = "5e-SRD-StartingEquipment.json";

    static String sSubclassesJSON;
    private static final String SUBCLASSES_PATH = "5e-SRD-Subclasses.json";

    static String sSubracesJSON;
    private static final String SUBRACES_PATH = "5e-SRD-Subraces.json";

    static String sTraitsJSON;
    private static final String TRAITS_PATH = "5e-SRD-Traits.json";

    static String sWeaponPropertiesJSON;
    private static final String WEAPON_PROPERTIES_PATH = "5e-SRD-Weapon-Properties.json";

    static String sBackgroundsJSON;
    private static final String BACKGROUNDS_PATH = "Backgrounds.json";

    static String sClassDescriptionJSON;
    private static final String CLASS_DESCRIPTION_PATH = "ClassDescription.json";

    /**
     * Loads all of the JSON files into RAM for faster loading and access speeds
     */
    public static void init() {
        try {
            sAbilityScoresJSON = Resources.toString(Resources.getResource(ABILITY_SCORES_PATH), DEFAULT_CHARSET);
            sClassesJSON = Resources.toString(Resources.getResource(CLASSES_PATH), DEFAULT_CHARSET);
            sConditionsJSON = Resources.toString(Resources.getResource(CONDITIONS_PATH), DEFAULT_CHARSET);
            sDamageTypesJSON = Resources.toString(Resources.getResource(DAMAGE_TYPES), DEFAULT_CHARSET);
            sEquipmentJSON = Resources.toString(Resources.getResource(EQUIPMENT_PATH), DEFAULT_CHARSET);
            sEquipmentCategoriesJSON = Resources.toString(Resources.getResource(EQUIPMENT_CATEGORIES_PATH), DEFAULT_CHARSET);
            sFeaturesJSON = Resources.toString(Resources.getResource(FEATURES_PATH), DEFAULT_CHARSET);
            sLanguagesJSON = Resources.toString(Resources.getResource(LANGUAGES_PATH), DEFAULT_CHARSET);
            sLevelsJSON = Resources.toString(Resources.getResource(LEVELS_PATH), DEFAULT_CHARSET);
            sMagicSchoolsJSON = Resources.toString(Resources.getResource(MAGIC_SCHOOLS_PATH), DEFAULT_CHARSET);
            sMonstersJSON = Resources.toString(Resources.getResource(MONSTERS_PATH), DEFAULT_CHARSET);
            sProficienciesJSON = Resources.toString(Resources.getResource(PROFICIENCIES_PATH), DEFAULT_CHARSET);
            sRacesJSON = Resources.toString(Resources.getResource(RACES_PATH), DEFAULT_CHARSET);
            sSkillsJSON = Resources.toString(Resources.getResource(SKILLS_PATH), DEFAULT_CHARSET);
            sSpellcastingJSON = Resources.toString(Resources.getResource(SPELLCASTING_PATH), DEFAULT_CHARSET);
            sSpellsJSON = Resources.toString(Resources.getResource(SPELLS_PATH), DEFAULT_CHARSET);
            sStartingEquipmentJSON = Resources.toString(Resources.getResource(STARTING_EQUIPMENT_PATH), DEFAULT_CHARSET);
            sSubclassesJSON = Resources.toString(Resources.getResource(SUBCLASSES_PATH), DEFAULT_CHARSET);
            sSubracesJSON = Resources.toString(Resources.getResource(SUBRACES_PATH), DEFAULT_CHARSET);
            sTraitsJSON = Resources.toString(Resources.getResource(TRAITS_PATH), DEFAULT_CHARSET);
            sWeaponPropertiesJSON = Resources.toString(Resources.getResource(WEAPON_PROPERTIES_PATH), DEFAULT_CHARSET);
            sBackgroundsJSON = Resources.toString(Resources.getResource(BACKGROUNDS_PATH), DEFAULT_CHARSET);
            sClassDescriptionJSON = Resources.toString(Resources.getResource(CLASS_DESCRIPTION_PATH), DEFAULT_CHARSET);
        }
        catch (IOException e) {
            e.printStackTrace();
            // TODO: Show error message here
        }
        // TODO: Assign the rest
    }
}
