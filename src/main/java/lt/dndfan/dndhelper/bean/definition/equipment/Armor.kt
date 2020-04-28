package lt.dndfan.dndhelper.bean.definition.equipment

class Armor(
        name : String,
        equipmentCategory : String,
        properties : List<String>,

        val armorCategory : String,

        val baseArmor : Int,
        val dexterityBonus : Boolean,
        val maxBonus : Int,

        val minimumStrength : Int,
        val stealthDisadvantage : Boolean,

        val weight : Float,
        val cost : Int
) : Equipment(name, equipmentCategory, properties)