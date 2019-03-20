package lt.dndfan.dndhelper.bean.dnd.character

import lt.dndfan.dndhelper.bean.dnd.bonus.impl.StatBonus

interface IRace {
    val name : String
    val speed : Int
    val size : String
    val abilityBonuses : List<StatBonus>
}