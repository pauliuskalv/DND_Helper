package lt.dndfan.dndhelper.bean.character.bonus.impl

import lt.dndfan.dndhelper.bean.character.ICharacter
import lt.dndfan.dndhelper.bean.character.IPlayableCharacter
import lt.dndfan.dndhelper.bean.character.bonus.IBonus
import lt.dndfan.dndhelper.bean.character.constant.EStat

class StatBonus(override val bonusName: String,
                override val description: String,
                override val origin: String,
                private val stat : EStat,
                private val value : Int) : AbstractBonus(bonusName, description, origin) {
    override fun applyBonus(character: IPlayableCharacter) {
        character.setStat(stat, character.getStat(stat) + value)
    }

    override fun removeBonus(character: IPlayableCharacter) {
        character.setStat(stat, character.getStat(stat) - value)
    }
}