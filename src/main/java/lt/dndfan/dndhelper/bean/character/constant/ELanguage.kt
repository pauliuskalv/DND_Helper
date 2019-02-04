package lt.dndfan.dndhelper.bean.character.constant

enum class ELanguage(val value : String, val script : String) {
    COMMON("Common", "Common"),
    DWARVISH("Dwarvish", "Dwarvish"),
    ELVISH("Elvish", "Elvish"),
    GIANT("Giant", "Dwarvish"),
    GNOMISH("Gnomish", "Dwarvish"),
    GOBLIN("Goblin", "Dwarvish"),
    HALFLING("Halfling", "Common"),
    ORC("Orc", "Dwarvish"),

    ABYSSAL("Abyssal", "Infernal"),
    CELESTIAL("Celestial", "Celestial"),
    DRACONIC("Draconic", "Draconic"),
    DEEP_SPEECH("Deep speech", "None"),
    INFERNAL("Infernal", "Infernal"),
    PRIMORDIAL("Primordial", "Dwarvish"),
    SYLVAN("Sylvan", "Elvish"),
    UNDERCOMMON("Undercommon", "Elvish"),
    DRUIDIC("Druidic", "None")
}