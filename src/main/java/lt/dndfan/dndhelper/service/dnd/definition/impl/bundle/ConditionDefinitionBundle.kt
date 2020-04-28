package lt.dndfan.dndhelper.service.dnd.definition.impl.bundle

import lt.dndfan.dndhelper.bean.definition.information.Condition
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilder
import lt.dndfan.dndhelper.service.dnd.definition.impl.AbstractInnerDefinitionBundle
import org.springframework.beans.factory.annotation.Autowired

class ConditionDefinitionBundle(
        @Autowired builder : DefinitionBuilder<Condition>
) : AbstractInnerDefinitionBundle<Condition>(
        "Conditions.json",
        builder
)