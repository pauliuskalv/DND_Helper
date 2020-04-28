package lt.dndfan.dndhelper.service.dnd.definition.impl.bundle

import lt.dndfan.dndhelper.bean.definition.information.AbilityScore
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilder
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBundleService
import lt.dndfan.dndhelper.service.dnd.definition.impl.AbstractInnerDefinitionBundle
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service(DefinitionBundleService.ABILITY_SCORE)
class AbilityScoreDefinitionsBundle(
        @Autowired builder : DefinitionBuilder<AbilityScore>
) : AbstractInnerDefinitionBundle<AbilityScore>(
        "AbilityScore.json",
        builder
)