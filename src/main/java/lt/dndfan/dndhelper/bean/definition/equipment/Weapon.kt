package lt.dndfan.dndhelper.bean.definition.equipment

class Weapon(
    name : String,
    equipmentCategory : String,
    properties : List<String>,

    val weaponCategory : String,
    val weaponRange : String,
    val categoryRange : String,

    val cost : Int,

    val damageDiceCount : Int,
    val damageDiceValue : Int,
    val damageType : String,

    val rangeNormal : Int,
    val rangeLong : Int,

    val weight : Float
) : Equipment(name, equipmentCategory, properties)