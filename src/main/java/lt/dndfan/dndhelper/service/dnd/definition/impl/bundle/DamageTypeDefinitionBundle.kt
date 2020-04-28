package lt.dndfan.dndhelper.service.dnd.definition.impl.bundle

import lt.dndfan.dndhelper.bean.definition.information.DamageType
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilder
import lt.dndfan.dndhelper.service.dnd.definition.impl.AbstractInnerDefinitionBundle
import org.springframework.beans.factory.annotation.Autowired

class DamageTypeDefinitionBundle(
        @Autowired builder : DefinitionBuilder<DamageType>
) : AbstractInnerDefinitionBundle<DamageType>(
        "Damage-Types.json",
        builder
)