package lt.dndfan.dndhelper.bean.character.constant

/**
 * value is the field in JSON that represents the
 *  spell slot count for the specific
 *  spell slot level
 */
enum class ESpellSlot(value : String) {
    CANTRIP("cantrips_known"),
    LEVEL_1("spell_slots_level_1"),
    LEVEL_2("spell_slots_level_2"),
    LEVEL_3("spell_slots_level_3"),
    LEVEL_4("spell_slots_level_4"),
    LEVEL_5("spell_slots_level_5"),
    LEVEL_6("spell_slots_level_6"),
    LEVEL_7("spell_slots_level_7"),
    LEVEL_8("spell_slots_level_8"),
    LEVEL_9("spell_slots_level_9")
}