package lt.dndfan.dndhelper.service.dnd.definition.impl.bundle

import lt.dndfan.dndhelper.bean.definition.information.Language
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilder
import lt.dndfan.dndhelper.service.dnd.definition.impl.AbstractInnerDefinitionBundle
import org.springframework.beans.factory.annotation.Autowired

class LanguageDefinitionBundle(
        @Autowired builder : DefinitionBuilder<Language>
) : AbstractInnerDefinitionBundle<Language>(
        "Languages.json",
        builder
)