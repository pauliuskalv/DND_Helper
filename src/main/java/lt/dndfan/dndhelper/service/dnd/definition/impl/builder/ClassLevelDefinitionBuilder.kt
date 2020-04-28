package lt.dndfan.dndhelper.service.dnd.definition.impl.builder

import lt.dndfan.dndhelper.bean.definition.characterclass.Class
import lt.dndfan.dndhelper.bean.definition.characterclass.ClassLevel
import lt.dndfan.dndhelper.bean.definition.characterclass.Feature
import lt.dndfan.dndhelper.bean.definition.characterclass.Subclass
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilder
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilderService
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBundle
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBundleService
import org.json.JSONObject
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.DependsOn
import org.springframework.stereotype.Service
import java.util.*

@Service(DefinitionBuilderService.CLASS_LEVEL)
@DependsOn(
        DefinitionBundleService.CLASS,
        DefinitionBundleService.SUBCLASS,
        DefinitionBundleService.FEATURE
)
class ClassLevelDefinitionBuilder(
        @Autowired val classBundle : DefinitionBundle<Class>,
        @Autowired val subclassBundle : DefinitionBundle<Subclass>,
        @Autowired val featureBundle : DefinitionBundle<Feature>
) : DefinitionBuilder<ClassLevel> {
    override fun build(obj: JSONObject): ClassLevel {
        val level = obj.getInt("level")
        val abilityScoreBonus = obj.getInt("ability_score_bonuses")
        val proficiencyBonus = obj.getInt("prof_bonus")

        // TODO: feature_choices

        // TODO: class_specific

        val features = LinkedList<Feature>()
        val featureDefinitions = obj.getJSONArray("features")
        for (featureDefinition in featureDefinitions.iterator()) {
            featureDefinition as JSONObject

            features.add(featureBundle.getEntity(featureDefinition.getString("name")))
        }

        val levelClass = classBundle.getEntity(obj.getJSONObject("class").getString("name"))

        val levelSubclass : Optional<Subclass>
        if (obj.has("subclass") && obj.getJSONObject("subclass").has("name")) {
            levelSubclass = Optional.of(subclassBundle.getEntity(obj.getJSONObject("subclass").getString("name")))
        } else {
            levelSubclass = Optional.empty<Subclass>()
        }

        return ClassLevel(
                levelClass.name,
                level,
                abilityScoreBonus,
                proficiencyBonus,
                features,
                levelClass,
                levelSubclass
        )
    }
}