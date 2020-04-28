package lt.dndfan.dndhelper.service.dnd.definition.impl.bundle

import lt.dndfan.dndhelper.bean.definition.characterclass.Class
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilder
import lt.dndfan.dndhelper.service.dnd.definition.impl.AbstractInnerDefinitionBundle
import org.springframework.beans.factory.annotation.Autowired

class ClassDefinitionBundle(
        @Autowired builder : DefinitionBuilder<Class>
) : AbstractInnerDefinitionBundle<Class>(
        "Classes.json",
        builder
)