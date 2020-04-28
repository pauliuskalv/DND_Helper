package lt.dndfan.dndhelper.bean.definition.characterclass

import lt.dndfan.dndhelper.bean.definition.BaseDefinition

class Feature(
        name : String,
        val validClass : List<Class>,
        val validSubclass : List<Subclass>
) : BaseDefinition(name)