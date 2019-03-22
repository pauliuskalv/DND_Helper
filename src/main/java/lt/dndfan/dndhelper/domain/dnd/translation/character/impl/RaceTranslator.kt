package lt.dndfan.dndhelper.domain.dnd.translation.character.impl

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.bonus.impl.StatBonus
import lt.dndfan.dndhelper.bean.dnd.bonus.impl.StatBonusFactory
import lt.dndfan.dndhelper.bean.dnd.character.impl.Race
import lt.dndfan.dndhelper.bean.dnd.character.impl.RaceFactory
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Stat
import lt.dndfan.dndhelper.domain.dnd.translation.character.IRaceTranslator

class RaceTranslator : IRaceTranslator {

    private val raceFactory = RaceFactory()
    private val statBonusFactory = StatBonusFactory()

    override fun translate(args: Map<String, Any>,
            statList : ArrayList<Stat>           // all stats objects
            ): Race {

        val statBonuses = ArrayList<StatBonus>()

        for((statNumber,stat) in statList.withIndex())
        {
            val statMap : Map<String,Any> = mapOf(
                    Pair<String,Any>("name", stat.fullName),
                    Pair<String,Any>("description", stat.description),
                    Pair<String,Any>("origin", stat.fullName),
                    Pair<String,Any>("stat", stat),
                    Pair<String,Any>("value", (args["ability_bonuses"] as ArrayList<Int>)[statNumber])      // exception index out of range
            )
            statBonuses.add(statBonusFactory.createBonus(statMap))
        }

        return raceFactory.createRace(
                args["name"] as String,
                args["speed"] as Int,
                args["size"] as String,
                statBonuses
                )
    }
}