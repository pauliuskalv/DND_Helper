package lt.dndfan.dndhelper.service.dnd.definition.impl.bundle

import lt.dndfan.dndhelper.bean.definition.characterclass.ClassLevel
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilder
import lt.dndfan.dndhelper.service.dnd.definition.impl.AbstractInnerDefinitionBundle
import org.springframework.beans.factory.annotation.Autowired

class ClassLevelDefinitionBundle(
        @Autowired builder : DefinitionBuilder<ClassLevel>
) : AbstractInnerDefinitionBundle<ClassLevel>(
        "Levels.json",
        builder
)