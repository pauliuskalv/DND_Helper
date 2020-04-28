package lt.dndfan.dndhelper.service.dnd.definition.impl.bundle

import lt.dndfan.dndhelper.bean.definition.information.Trait
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilder
import lt.dndfan.dndhelper.service.dnd.definition.impl.AbstractInnerDefinitionBundle
import org.springframework.beans.factory.annotation.Autowired

class TraitDefinitionBundle(
        @Autowired builder : DefinitionBuilder<Trait>
) : AbstractInnerDefinitionBundle<Trait>(
        "Traits.json",
        builder
)