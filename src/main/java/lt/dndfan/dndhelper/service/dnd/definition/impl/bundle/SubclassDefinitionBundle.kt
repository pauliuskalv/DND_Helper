package lt.dndfan.dndhelper.service.dnd.definition.impl.bundle

import lt.dndfan.dndhelper.bean.definition.characterclass.Subclass
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilder
import lt.dndfan.dndhelper.service.dnd.definition.impl.AbstractInnerDefinitionBundle
import org.springframework.beans.factory.annotation.Autowired

class SubclassDefinitionBundle(
        @Autowired builder : DefinitionBuilder<Subclass>
) : AbstractInnerDefinitionBundle<Subclass>(
        "Subclass.json",
        builder
)