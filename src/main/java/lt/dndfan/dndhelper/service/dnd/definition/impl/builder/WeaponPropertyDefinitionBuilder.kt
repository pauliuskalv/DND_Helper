package lt.dndfan.dndhelper.service.dnd.definition.impl.builder

import lt.dndfan.dndhelper.bean.definition.information.WeaponProperty
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilder
import org.json.JSONObject

class WeaponPropertyDefinitionBuilder : DefinitionBuilder<WeaponProperty> {
    override fun build(obj: JSONObject): WeaponProperty {
        val name = obj.getString("name")

        val descriptionBuilder = StringBuilder()
        val description = obj.getJSONArray("desc")
        for (descriptionPart in description.iterator()) {
            descriptionPart as String

            descriptionBuilder.append(descriptionPart).append("\n")
        }

        return WeaponProperty(
                name,
                descriptionBuilder.toString()
        )
    }
}