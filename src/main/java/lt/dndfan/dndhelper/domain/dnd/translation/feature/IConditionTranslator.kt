package lt.dndfan.dndhelper.domain.dnd.translation.feature

import lt.dndfan.dndhelper.bean.dnd.feature.ICondition

interface IConditionTranslator {
    fun translate (args : Map<String,Any>) : ICondition
}