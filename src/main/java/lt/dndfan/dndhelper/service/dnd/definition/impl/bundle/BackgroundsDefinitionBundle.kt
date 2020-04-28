package lt.dndfan.dndhelper.service.dnd.definition.impl.bundle

import lt.dndfan.dndhelper.bean.definition.background.Background
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilder
import lt.dndfan.dndhelper.service.dnd.definition.impl.AbstractInnerDefinitionBundle
import org.springframework.beans.factory.annotation.Autowired

class BackgroundsDefinitionBundle(
        @Autowired builder : DefinitionBuilder<Background>
) : AbstractInnerDefinitionBundle<Background>(
        "Backgrounds.json",
        builder
)