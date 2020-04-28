package lt.dndfan.dndhelper.service.dnd.definition.impl.builder

import lt.dndfan.dndhelper.bean.definition.information.DamageType
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilder
import org.json.JSONObject

class DamageTypeDefinitionBuilder : DefinitionBuilder<DamageType> {
    override fun build(obj: JSONObject): DamageType {
        val name = obj.getString("name")

        val descriptionBuilder = StringBuilder()
        val description = obj.getJSONArray("desc")
        for (descriptionPart in description.iterator()) {
            descriptionPart as String

            descriptionBuilder.append(descriptionPart).append("\n")
        }

        return DamageType(
                name,
                descriptionBuilder.toString()
        )
    }
}