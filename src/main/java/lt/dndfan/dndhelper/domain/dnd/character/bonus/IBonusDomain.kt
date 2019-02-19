package lt.dndfan.dndhelper.domain.dnd.character.bonus

import lt.dndfan.dndhelper.bean.character.bonus.IBonus

interface IBonusDomain {
    fun createBonus(args : Map<String, Any>) : IBonus
}