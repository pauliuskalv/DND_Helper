package lt.dndfan.dndhelper.bean.dnd.character

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus

interface IRace {
    val name : String
    /**
     * Speed should be handled as a bonus!
     */
    val speed : Int
    /**
     * Consider reworking character size as a bonus.
     */
    val size : String
    val bonuses : List<IBonus>
}