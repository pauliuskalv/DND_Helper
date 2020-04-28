package lt.dndfan.dndhelper.bean.definition.information

import lt.dndfan.dndhelper.bean.definition.BaseDefinition

class Skill(
        name: String,
        val description : String,
        val abilityScore : AbilityScore
) : BaseDefinition(name)