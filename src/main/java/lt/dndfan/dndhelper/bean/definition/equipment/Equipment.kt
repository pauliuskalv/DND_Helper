package lt.dndfan.dndhelper.bean.definition.equipment

import lt.dndfan.dndhelper.bean.definition.BaseDefinition

abstract class Equipment(
        name : String,

        val equipmentCategory : String,
        val properties : List<String>
) : BaseDefinition(name)