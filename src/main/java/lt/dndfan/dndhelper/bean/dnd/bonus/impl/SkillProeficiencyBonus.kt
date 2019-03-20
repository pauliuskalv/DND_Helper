package lt.dndfan.dndhelper.bean.dnd.bonus.impl

import lt.dndfan.dndhelper.bean.dnd.IPlayableCharacter
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Skill

class SkillProeficiencyBonus(override val bonusName: String,
                             override val description: String,
                             override val origin: String,
                             private val proeficiency : Skill) : AbstractBonus(bonusName, description, origin) {
    private var applied : Boolean = false

    override fun applyBonus(character: IPlayableCharacter) {
        if (character.skillProficiencies.contains(proeficiency))
            return

        character.addSkillProficiency(proeficiency)
        applied = true
    }

    override fun removeBonus(character: IPlayableCharacter) {
        if (!applied)
            return

        character.removeSkillProficiency(proeficiency)
        applied = false
    }

}