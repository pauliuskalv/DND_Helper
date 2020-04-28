package lt.dndfan.dndhelper.service.dnd.definition.impl

import lt.dndfan.dndhelper.bean.definition.BaseDefinition
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilder

abstract class AbstractInnerDefinitionBundle<T : BaseDefinition>(
        filePath : String,
        builder : DefinitionBuilder<T>
) : AbstractDefinitionBundle<T>(
        "/definitions/${filePath}",
        builder
)