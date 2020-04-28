package lt.dndfan.dndhelper.bean.definition.equipment

class AdventuringGear(
        name : String,
        equipmentCategory : String,
        properties : List<String>,

        val gearCategory : String,

        val description : String,

        val cost : Int,
        val weight : Float
) : Equipment(name, equipmentCategory, properties)