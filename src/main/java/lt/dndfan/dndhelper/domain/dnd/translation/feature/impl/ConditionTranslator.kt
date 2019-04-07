package lt.dndfan.dndhelper.domain.dnd.translation.feature.impl

import lt.dndfan.dndhelper.bean.dnd.feature.impl.Condition
import lt.dndfan.dndhelper.bean.dnd.feature.impl.ConditionFactory
import lt.dndfan.dndhelper.domain.dnd.translation.feature.IConditionTranslator

class ConditionTranslator : IConditionTranslator {
    private val conditionFactory = ConditionFactory()

    override fun translate(args: Map<String, Any>): Condition {
        return conditionFactory.createCondition(
                args["name"] as String,
                (args["desc"] as List<String>).joinToString(" ")
                )
    }
}