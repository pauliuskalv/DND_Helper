package lt.dndfan.dndhelper.bean.character.bonus.impl

import lt.dndfan.dndhelper.bean.character.ICharacter
import lt.dndfan.dndhelper.bean.character.bonus.IBonus
import lt.dndfan.dndhelper.bean.character.constant.EStat

class StatBonus(override val bonusName: String,
                override val description: String,
                override val origin: String,

                val stat : EStat,
                val value : Int,

                private var mApplied : Boolean) : IBonus {
    override fun apply(character: ICharacter) {
        if (mApplied) return

        character.setStat(stat, character.getStat(stat) + value)
        mApplied = true
    }

    override fun remove(character: ICharacter) {
        if (!mApplied) return

        character.setStat(stat, character.getStat(stat) - value)
        mApplied = false
    }
}