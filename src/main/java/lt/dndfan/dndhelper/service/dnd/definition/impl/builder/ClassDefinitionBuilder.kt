package lt.dndfan.dndhelper.service.dnd.definition.impl.builder

import lt.dndfan.dndhelper.bean.definition.characterclass.Class
import lt.dndfan.dndhelper.bean.definition.characterclass.ClassLevel
import lt.dndfan.dndhelper.bean.definition.information.AbilityScore
import lt.dndfan.dndhelper.bean.definition.information.Proficiency
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilder
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilderService
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBundle
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBundleService
import org.json.JSONObject
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.DependsOn
import org.springframework.stereotype.Service
import java.util.*

@Service(DefinitionBuilderService.CLASS)
@DependsOn(
        DefinitionBundleService.PROFICIENCY,
        DefinitionBundleService.ABILITY_SCORE,
        DefinitionBundleService.CLASS_LEVEL
)
class ClassDefinitionBuilder(
        @Autowired val proficiencyBundle : DefinitionBundle<Proficiency>,
        @Autowired val abilityScoreBundle : DefinitionBundle<AbilityScore>,
        @Autowired val classLevelBundle : DefinitionBundle<ClassLevel>
) : DefinitionBuilder<Class> {
    override fun build(obj: JSONObject): Class {
        val name = obj.getString("name")
        val hitDie = obj.getInt("hit_die")

        val proficiencies = LinkedList<Proficiency>()
        val proficiencyDefinitions = obj.getJSONArray("proficiencies")
        for (proficiencyDefinition in proficiencyDefinitions.iterator()) {
            proficiencyDefinition as JSONObject

            proficiencies.add(proficiencyBundle.getEntity(proficiencyDefinition.getString("name")))
        }

        val savingThrows = LinkedList<AbilityScore>()
        val savingThrowDefinitions = obj.getJSONArray("saving_throws")
        for (savingThrowDefinition in savingThrowDefinitions) {
            savingThrowDefinition as JSONObject

            savingThrows.add(abilityScoreBundle.getEntity(savingThrowDefinition.getString("name")))
        }

        // TODO: starting equipment


    }
}