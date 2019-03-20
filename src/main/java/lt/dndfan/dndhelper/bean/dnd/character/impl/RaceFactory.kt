package lt.dndfan.dndhelper.bean.dnd.character.impl

import lt.dndfan.dndhelper.bean.dnd.bonus.impl.StatBonus
import lt.dndfan.dndhelper.bean.dnd.character.IRaceFactory

class RaceFactory : IRaceFactory {
    override fun createRace(name: String, speed: Int, size: String, statBonuses: List<StatBonus>): Race {
        return Race(name,
                speed,
                size,
                statBonuses)
    }
}