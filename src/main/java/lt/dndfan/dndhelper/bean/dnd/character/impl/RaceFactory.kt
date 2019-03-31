package lt.dndfan.dndhelper.bean.dnd.character.impl

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.bonus.impl.StatBonus
import lt.dndfan.dndhelper.bean.dnd.character.IRaceFactory

class RaceFactory : IRaceFactory {
    override fun createRace(name: String, speed: Int, size: String, bonuses: List<IBonus>): Race {
        return Race(name,
                speed,
                size,
                bonuses)
    }
}