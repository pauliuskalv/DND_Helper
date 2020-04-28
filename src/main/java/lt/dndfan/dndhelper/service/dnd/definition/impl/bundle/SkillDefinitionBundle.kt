package lt.dndfan.dndhelper.service.dnd.definition.impl.bundle

import lt.dndfan.dndhelper.bean.definition.information.Skill
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilder
import lt.dndfan.dndhelper.service.dnd.definition.impl.AbstractInnerDefinitionBundle
import org.springframework.beans.factory.annotation.Autowired

class SkillDefinitionBundle(
        @Autowired builder : DefinitionBuilder<Skill>
) : AbstractInnerDefinitionBundle<Skill>(
        "Skills.json",
        builder
)