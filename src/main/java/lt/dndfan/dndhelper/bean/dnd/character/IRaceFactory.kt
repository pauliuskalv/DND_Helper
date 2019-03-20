package lt.dndfan.dndhelper.bean.dnd.character

import lt.dndfan.dndhelper.bean.dnd.bonus.impl.StatBonus
import lt.dndfan.dndhelper.bean.dnd.character.impl.Race

interface IRaceFactory {
    fun createRace(name: String,
                   speed: Int,
                   size: String,
                   statBonuses: List<StatBonus>
                   ) : Race
}