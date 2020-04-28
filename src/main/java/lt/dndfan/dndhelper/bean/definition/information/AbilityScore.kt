package lt.dndfan.dndhelper.bean.definition.information

import lt.dndfan.dndhelper.bean.definition.BaseDefinition

class AbilityScore(
        name : String,
        val fullName : String,
        val description : String,
        val skills : List<String>
) : BaseDefinition(name) {

}