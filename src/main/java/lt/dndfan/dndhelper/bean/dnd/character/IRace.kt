package lt.dndfan.dndhelper.bean.dnd.character

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus

interface IRace {
    val name : String
    val speed : Int
    val size : String
    /** Should be stat bonuses */
    val bonuses : List<IBonus>
}