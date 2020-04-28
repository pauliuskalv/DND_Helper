package lt.dndfan.dndhelper.service.dnd.definition.impl.builder

import lt.dndfan.dndhelper.bean.definition.information.Proficiency
import lt.dndfan.dndhelper.bean.definition.information.Race
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilder
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilderService
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBundle
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBundleService
import org.json.JSONObject
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.DependsOn
import org.springframework.stereotype.Service
import java.util.*

@Service(DefinitionBuilderService.PROFICIENCY)
@DependsOn(DefinitionBundleService.RACE)
class ProficiencyDefinitionBuilder(
        @Autowired val raceDefinitionBundle : DefinitionBundle<Race>
) : DefinitionBuilder<Proficiency> {
    override fun build(obj: JSONObject): Proficiency {
        val name = obj.getString("name")
        val type = obj.getString("type")

        val classes = LinkedList<String>()
        val classesDefinition = obj.getJSONArray("classes")
        for (classDefinition in classesDefinition.iterator()) {
            classDefinition as JSONObject

            classes.add(classDefinition.getString("name"))
        }

        val races = LinkedList<Race>()
        val racesDefinition = obj.getJSONArray("races")
        for (raceDefinition in racesDefinition.iterator()) {
            raceDefinition as JSONObject

            races.add(raceDefinitionBundle.getEntity(raceDefinition.getString("name")))
        }

        return Proficiency(
                name,
                type,
                classes,
                races
        )
    }
}