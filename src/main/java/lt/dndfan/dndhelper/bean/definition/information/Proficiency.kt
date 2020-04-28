package lt.dndfan.dndhelper.bean.definition.information

import lt.dndfan.dndhelper.bean.definition.BaseDefinition

class Proficiency(
        name : String,
        val type : String,
        val classes : List<String>,
        val races : List<String>
) : BaseDefinition(name)