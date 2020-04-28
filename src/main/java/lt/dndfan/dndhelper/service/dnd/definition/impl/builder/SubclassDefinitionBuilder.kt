package lt.dndfan.dndhelper.service.dnd.definition.impl.builder

import lt.dndfan.dndhelper.bean.definition.characterclass.Subclass
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilder
import org.json.JSONObject
import java.util.*

class SubclassDefinitionBuilder : DefinitionBuilder<Subclass> {
    override fun build(obj: JSONObject): Subclass {
        val name = obj.getString("name")
        val className = obj.getJSONObject("class").getString("name")
        val subclassFlavor = obj.getString("subclass_flavor")

        val features = LinkedList<String>()
        val featureDefinitions = obj.getJSONArray("features")
        for (featureDefinition in featureDefinitions.iterator()) {
            featureDefinition as JSONObject

            features.add(featureDefinition.getString("name"))
        }

        val descriptionBuilder = StringBuilder()
        val description = obj.getJSONArray("desc")
        for (descriptionPart in description.iterator()) {
            descriptionPart as String

            descriptionBuilder.append(descriptionPart).append('\n')
        }

        return Subclass(
                name,
                className,
                subclassFlavor,
                descriptionBuilder.toString(),
                features
        )
    }
}