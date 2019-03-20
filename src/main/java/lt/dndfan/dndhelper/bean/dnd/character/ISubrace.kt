package lt.dndfan.dndhelper.bean.dnd.character

import lt.dndfan.dndhelper.bean.dnd.bonus.impl.StatBonus
import lt.dndfan.dndhelper.bean.dnd.feature.ITrait

interface ISubrace {
    val name : String
    val description : String

    val race : String
    val statBonuses : List<StatBonus>
    val traits : List<ITrait>
}