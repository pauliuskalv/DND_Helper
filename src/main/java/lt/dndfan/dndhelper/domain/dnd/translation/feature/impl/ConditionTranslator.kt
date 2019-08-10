package lt.dndfan.dndhelper.domain.dnd.translation.feature.impl

import lt.dndfan.dndhelper.bean.dnd.feature.ICondition
import lt.dndfan.dndhelper.bean.dnd.feature.IConditionFactory
import lt.dndfan.dndhelper.domain.dnd.translation.feature.IConditionTranslator
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class ConditionTranslator : IConditionTranslator {
    @Autowired
    private lateinit var conditionFactory : IConditionFactory

    override fun translate(args: Map<String, Any>): ICondition {
        return conditionFactory.createCondition(
                args["name"] as String,
                (args["desc"] as List<String>).joinToString(" ")
                )
    }
}