package lt.dndfan.dndhelper.domain.dnd.character.bonus

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.stats.ISkill
import lt.dndfan.dndhelper.bean.dnd.stats.IStat

interface IBonusDomain {
    fun createBonus(args : Map<String, Any>) : IBonus

    fun getBonusByType(bonusList : List<IBonus>, type : IBonus) : List<IBonus>
    fun getBonusByOrigin(bonusList : List<IBonus>, origin : String) : List<IBonus>

    fun getBonusByStat(bonusList : List<IBonus>, stat : IStat) : List<IBonus>
    fun getBonusBySkill(bonusList : List<IBonus>, skill : ISkill) : List<IBonus>
}