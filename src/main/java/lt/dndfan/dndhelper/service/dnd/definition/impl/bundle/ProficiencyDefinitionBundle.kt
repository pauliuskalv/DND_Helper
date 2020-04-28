package lt.dndfan.dndhelper.service.dnd.definition.impl.bundle

import lt.dndfan.dndhelper.bean.definition.information.Proficiency
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilder
import lt.dndfan.dndhelper.service.dnd.definition.impl.AbstractInnerDefinitionBundle
import org.springframework.beans.factory.annotation.Autowired

class ProficiencyDefinitionBundle(
        @Autowired builder : DefinitionBuilder<Proficiency>
) : AbstractInnerDefinitionBundle<Proficiency>(
        "Proficiencies.json",
        builder
)