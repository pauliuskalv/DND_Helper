package lt.dndfan.dndhelper.bean.dnd.bonus.impl

import lt.dndfan.dndhelper.bean.dnd.IPlayableCharacter
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Stat

class StatBonus(override val bonusName: String,
                override val description: String,
                override val origin: String,
                /** Made stat not private */
                val stat : Stat,
                private val value : Int) : AbstractBonus(bonusName, description, origin) {
    override fun applyBonus(character: IPlayableCharacter) {
        character.setStat(stat, character.getStat(stat) + value)
    }

    override fun removeBonus(character: IPlayableCharacter) {
        character.setStat(stat, character.getStat(stat) - value)
    }
}