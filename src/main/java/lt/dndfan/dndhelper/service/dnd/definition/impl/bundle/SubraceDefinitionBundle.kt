package lt.dndfan.dndhelper.service.dnd.definition.impl.bundle

import lt.dndfan.dndhelper.bean.definition.information.Subrace
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilder
import lt.dndfan.dndhelper.service.dnd.definition.impl.AbstractInnerDefinitionBundle
import org.springframework.beans.factory.annotation.Autowired

class SubraceDefinitionBundle(
        @Autowired builder : DefinitionBuilder<Subrace>
) : AbstractInnerDefinitionBundle<Subrace>(
        "Subraces.json",
        builder
)