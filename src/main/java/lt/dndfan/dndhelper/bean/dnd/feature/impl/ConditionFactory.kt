package lt.dndfan.dndhelper.bean.dnd.feature.impl

import lt.dndfan.dndhelper.bean.dnd.feature.IConditionFactory
import org.springframework.stereotype.Component

@Component
class ConditionFactory : IConditionFactory {
    override fun createCondition(name: String, description: String): Condition {
        return Condition(name, description)
    }
}