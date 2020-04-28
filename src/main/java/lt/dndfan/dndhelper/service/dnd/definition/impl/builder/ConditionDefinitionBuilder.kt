package lt.dndfan.dndhelper.service.dnd.definition.impl.builder

import lt.dndfan.dndhelper.bean.definition.information.Condition
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilder
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilderService
import org.json.JSONObject
import org.springframework.stereotype.Service

@Service(DefinitionBuilderService.CONDITION)
class ConditionDefinitionBuilder : DefinitionBuilder<Condition> {
    override fun build(obj: JSONObject): Condition {
        val name = obj.getString("name")

        val descriptionBuilder = StringBuilder()
        val description = obj.getJSONArray("desc")
        for (descriptionPart in description.iterator()) {
            descriptionPart as String

            descriptionBuilder.append(descriptionPart).append("\n")
        }

        return Condition(
                name,
                descriptionBuilder.toString()
        )
    }
}