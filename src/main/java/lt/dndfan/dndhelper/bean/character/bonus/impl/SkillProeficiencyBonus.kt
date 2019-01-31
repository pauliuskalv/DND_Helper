package lt.dndfan.dndhelper.bean.character.bonus.impl

import lt.dndfan.dndhelper.bean.character.ICharacter
import lt.dndfan.dndhelper.bean.character.IPlayableCharacter
import lt.dndfan.dndhelper.bean.character.bonus.IBonus
import lt.dndfan.dndhelper.bean.character.constant.ESkill

class SkillProeficiencyBonus(override val bonusName: String,
                             override val description: String,
                             override val origin: String,
                             private val proeficiency : ESkill) : AbstractBonus(bonusName, description, origin) {
    override fun applyBonus(character: IPlayableCharacter) {
        character.addSkillProficiency(proeficiency)
    }

    override fun removeBonus(character: IPlayableCharacter) {
        character.removeSkillProficiency(proeficiency)
    }

}