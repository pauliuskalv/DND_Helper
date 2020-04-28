package lt.dndfan.dndhelper.service.dnd.definition.impl.bundle

import lt.dndfan.dndhelper.bean.definition.characterclass.ClassDescription
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilder
import lt.dndfan.dndhelper.service.dnd.definition.impl.AbstractInnerDefinitionBundle
import org.springframework.beans.factory.annotation.Autowired

class ClassDescriptionDefinitionBundle(
        @Autowired builder : DefinitionBuilder<ClassDescription>
) : AbstractInnerDefinitionBundle<ClassDescription>(
        "ClassDescription.json",
        builder
)