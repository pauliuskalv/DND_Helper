package lt.dndfan.dndhelper.bean.definition.information

import lt.dndfan.dndhelper.bean.definition.BaseDefinition

class Race(
        name : String,

        val speed : Int,

        val abilityBonusStrength : Int,
        val abilityBonusDexterity : Int
) : BaseDefinition(name)