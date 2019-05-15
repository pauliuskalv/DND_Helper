package lt.dndfan.dndhelper.bean.dnd.bonus.impl

import lt.dndfan.dndhelper.bean.dnd.IPlayableCharacter
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Skill

class SkillProficiencyBonus(override val bonusName: String,
                             override val description: String,
                             override val origin: String,
                             private val proficiency : Skill) : AbstractBonus(bonusName, description, origin) {
    /**
     * This bonus should be responsible to providing all skill proficiencies to the character.
     * Consider renaming it to just "SkillBonus".
     */

    private var applied : Boolean = false

    override fun applyBonus(character: IPlayableCharacter) {
        if (character.skillProficiencies.contains(proficiency))
            return

        character.addSkillProficiency(proficiency)
        applied = true
    }

    override fun removeBonus(character: IPlayableCharacter) {
        if (!applied)
            return

        character.removeSkillProficiency(proficiency)
        applied = false
    }

}