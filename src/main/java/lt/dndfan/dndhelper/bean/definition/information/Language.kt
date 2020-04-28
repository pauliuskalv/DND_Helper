package lt.dndfan.dndhelper.bean.definition.information

import lt.dndfan.dndhelper.bean.definition.BaseDefinition

class Language(
        name : String,

        val type : String,
        val typicalSpeakers : List<String>,
        val script : String
) : BaseDefinition(name)