package lt.dndfan.dndhelper.service.dnd.definition.impl.bundle

import lt.dndfan.dndhelper.bean.definition.information.Spell
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilder
import lt.dndfan.dndhelper.service.dnd.definition.impl.AbstractInnerDefinitionBundle
import org.springframework.beans.factory.annotation.Autowired

class SpellDefinitionBundle(
        @Autowired builder : DefinitionBuilder<Spell>
) : AbstractInnerDefinitionBundle<Spell>(
        "Spells.json",
        builder
)