package lt.dndfan.dndhelper.bean.definition.characterclass

import lt.dndfan.dndhelper.bean.definition.BaseDefinition

class Subclass(
        name : String,
        val className : String,
        val subclassFlavor : String,
        val description : String,
        val features : List<String>
) : BaseDefinition(name)