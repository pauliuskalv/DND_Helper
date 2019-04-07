package lt.dndfan.dndhelper.bean.dnd.character

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.feature.ITrait

interface ISubrace {
    val name : String
    val description : String

    val race : String
    val bonuses : List<IBonus>
    val traits : List<ITrait>
}