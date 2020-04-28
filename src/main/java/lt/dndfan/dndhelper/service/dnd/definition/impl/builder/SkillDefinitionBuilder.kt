package lt.dndfan.dndhelper.service.dnd.definition.impl.builder

import lt.dndfan.dndhelper.bean.definition.information.AbilityScore
import lt.dndfan.dndhelper.bean.definition.information.Skill
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilder
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilderService
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBundle
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBundleService
import org.json.JSONObject
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.DependsOn
import org.springframework.stereotype.Service

@Service(DefinitionBuilderService.SKILL)
@DependsOn(DefinitionBundleService.ABILITY_SCORE)
class SkillDefinitionBuilder(
        @Autowired val abilityScoreBundle : DefinitionBundle<AbilityScore>
) : DefinitionBuilder<Skill> {
    override fun build(obj: JSONObject): Skill {
        val name = obj.getString("name")

        val descriptionBuilder = StringBuilder()
        val description = obj.getJSONArray("desc")
        for (descriptionPart in description.iterator()) {
            descriptionPart as String

            descriptionBuilder.append(descriptionPart).append('\n')
        }

        val correspondingAbilityScore = abilityScoreBundle.getEntity(
            obj.getJSONObject("ability_score").getString("name")
        )

        return Skill(
            name,
                descriptionBuilder.toString(),
                correspondingAbilityScore
        )
    }
}