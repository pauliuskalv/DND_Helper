package lt.dndfan.dndhelper.bean.dnd.character

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.character.impl.Race

interface IRaceFactory {
    fun createRace(name: String,
                   speed: Int,
                   size: String,
                   bonuses: List<IBonus>
                   ) : Race
}