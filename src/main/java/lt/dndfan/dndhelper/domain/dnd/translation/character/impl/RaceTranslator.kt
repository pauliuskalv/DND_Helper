package lt.dndfan.dndhelper.domain.dnd.translation.character.impl

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.bonus.IBonusFactory
import lt.dndfan.dndhelper.bean.dnd.bonus.impl.StatBonus
import lt.dndfan.dndhelper.bean.dnd.bonus.impl.StatBonusFactory
import lt.dndfan.dndhelper.bean.dnd.character.IRaceFactory
import lt.dndfan.dndhelper.bean.dnd.character.impl.Race
import lt.dndfan.dndhelper.bean.dnd.character.impl.RaceFactory
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Stat
import lt.dndfan.dndhelper.domain.dnd.translation.character.IRaceTranslator
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Component
class RaceTranslator : IRaceTranslator {
    /**
     * TODO
     *   ALL_TRAITS and ALL_STATS are list of all stats or traits that are added to args at the facade
     */
    @Autowired
    private lateinit var raceFactory : IRaceFactory

    @Autowired
    @Qualifier("StatBonusFactory")
    private lateinit var statBonusFactory : IBonusFactory

    override fun translate(args: Map<String, Any>
    ): Race {

        val statBonuses = ArrayList<IBonus>()

        for ((statNumber, stat) in (args["ALL_STATS"] as List<Stat>).withIndex()) {
            val statMap: Map<String, Any> = mapOf(
                    Pair<String, Any>("name", stat.fullName),
                    Pair<String, Any>("description", stat.description),
                    Pair<String, Any>("origin", stat.fullName),
                    Pair<String, Any>("stat", stat),
                    Pair<String, Any>("value", (args["ability_bonuses"] as ArrayList<Int>)[statNumber])      // exception index out of range
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