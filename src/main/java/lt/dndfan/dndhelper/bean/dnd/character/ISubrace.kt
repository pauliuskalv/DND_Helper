package lt.dndfan.dndhelper.bean.dnd.character

import lt.dndfan.dndhelper.bean.dnd.bonus.impl.AbilityBonus
import lt.dndfan.dndhelper.bean.dnd.feature.ITrait

interface ISubrace {
    val name : String
    val description : String

    val race : String
    val abilityBonuses : List<AbilityBonus>
    val traits : List<ITrait>
}