package lt.dndfan.dndhelper.service.dnd.definition.impl.bundle

import lt.dndfan.dndhelper.bean.definition.information.Race
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilder
import lt.dndfan.dndhelper.service.dnd.definition.impl.AbstractInnerDefinitionBundle
import org.springframework.beans.factory.annotation.Autowired

class RaceDefinitionBundle(
        @Autowired builder : DefinitionBuilder<Race>
) : AbstractInnerDefinitionBundle<Race>(
        "Races.json",
        builder
)