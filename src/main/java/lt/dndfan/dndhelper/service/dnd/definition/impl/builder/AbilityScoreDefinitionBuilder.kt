package lt.dndfan.dndhelper.service.dnd.definition.impl.builder

import lt.dndfan.dndhelper.bean.definition.information.AbilityScore
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilder
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilderService
import org.json.JSONObject
import org.springframework.stereotype.Service
import java.util.*

@Service(DefinitionBuilderService.ABILITY_SCORE)
class AbilityScoreDefinitionBuilder : DefinitionBuilder<AbilityScore> {
    override fun build(obj: JSONObject): AbilityScore {
        return AbilityScore(
                obj.getString("name"),
                obj.getString("full_name"),
                obj.getString("desc"),
                LinkedList() // TODO: Skills
        )
    }
}