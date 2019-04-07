package lt.dndfan.dndhelper.domain.dnd.character.bonus

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus

interface IBonusDomain {
    fun createBonus(args : Map<String, Any>) : IBonus
}