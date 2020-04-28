package lt.dndfan.dndhelper.service.dnd.definition.impl.builder

import lt.dndfan.dndhelper.bean.definition.background.Background
import lt.dndfan.dndhelper.bean.definition.background.BackgroundFeature
import lt.dndfan.dndhelper.bean.definition.background.BackgroundIdeal
import lt.dndfan.dndhelper.bean.definition.information.Skill
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilder
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilderService
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBundleService
import lt.dndfan.dndhelper.service.dnd.definition.impl.AbstractDefinitionBundle
import org.json.JSONObject
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.DependsOn
import org.springframework.stereotype.Service
import java.util.*

@Service(DefinitionBuilderService.BACKGROUND)
@DependsOn(DefinitionBundleService.SKILL)
class BackgroundDefinitionBuilder(
        @Autowired val skillsDefinitionBundle : AbstractDefinitionBundle<Skill>
) : DefinitionBuilder<Background> {
    override fun build(obj: JSONObject): Background {
        val skills = LinkedList<Skill>()
        val skillsDefinition = obj.getJSONArray("skills")
        for (skill in skillsDefinition.iterator()) {
            skill as JSONObject

            skills.add(skillsDefinitionBundle.getEntity(skill.getString("name")))
        }

        val toolProficiencies = LinkedList<String>()
        val toolProficiencyDefinition = obj.getString("tool_proficiencies")
        for (toolProficiency in toolProficiencyDefinition.iterator()) {
            toolProficiency as JSONObject

            toolProficiencies.add(toolProficiency.getString("name"))
        }

        val backgroundFeatures = LinkedList<BackgroundFeature>()
        val backgroundFeatureDefinition = obj.getJSONArray("features")
        for (backgroundFeature in backgroundFeatureDefinition.iterator()) {
            backgroundFeature as JSONObject

            backgroundFeatures.add(
                    BackgroundFeature(
                            backgroundFeature.getString("name"),
                            backgroundFeature.getString("desc")
                    )
            )
        }

        val personalityTraits = LinkedList<String>()
        val personalityTraitDefinition = obj.getJSONArray("personality_traits")
        for (personalityTrait in personalityTraitDefinition.iterator()) {
            personalityTrait as JSONObject

            personalityTraits.add(personalityTrait.getString("desc"))
        }

        val backgroundIdeals = LinkedList<BackgroundIdeal>()
        val backgroundIdealDefinition = obj.getJSONArray("ideals")
        for (backgroundIdeal in backgroundIdealDefinition.iterator()) {
            backgroundIdeal as JSONObject

            backgroundIdeals.add(
                    BackgroundIdeal(
                            backgroundIdeal.getString("name"),
                            backgroundIdeal.getString("desc")
                    )
            )
        }

        val backgroundBonds = LinkedList<String>()
        val backgroundBondDefinition = obj.getJSONArray("bonds")
        for (backgroundBond in backgroundBondDefinition.iterator()) {
            backgroundBond as JSONObject

            backgroundBonds.add(backgroundBond.getString("desc"))
        }

        val backgroundFlaws = LinkedList<String>()
        val backgroundFlawDefinition = obj.getJSONArray("flaws")
        for (backgroundFlaw in backgroundFlawDefinition.iterator()) {
            backgroundFlaw as JSONObject

            backgroundFlaws.add(backgroundFlaw.getString("desc"))
        }

        return Background(
                obj.getString("name"),
                obj.getString("desc"),
                skills,
                obj.getInt("lang_count"),
                listOf(), // TODO : finish once tool proficiencies have been implemented
                listOf(), // TODO : finish once background items have been implemented
                obj.getInt("gold"),
                backgroundFeatures,
                personalityTraits,
                backgroundIdeals,
                backgroundBonds,
                backgroundFlaws
        )
    }
}