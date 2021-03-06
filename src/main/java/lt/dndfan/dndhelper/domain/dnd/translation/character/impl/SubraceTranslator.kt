package lt.dndfan.dndhelper.domain.dnd.translation.character.impl

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.bonus.IBonusFactory
import lt.dndfan.dndhelper.bean.dnd.bonus.impl.StatBonus
import lt.dndfan.dndhelper.bean.dnd.bonus.impl.StatBonusFactory
import lt.dndfan.dndhelper.bean.dnd.character.ISubrace
import lt.dndfan.dndhelper.bean.dnd.character.ISubraceFactory
import lt.dndfan.dndhelper.bean.dnd.character.impl.Subrace
import lt.dndfan.dndhelper.bean.dnd.character.impl.SubraceFactory
import lt.dndfan.dndhelper.bean.dnd.feature.impl.Trait
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Stat
import lt.dndfan.dndhelper.domain.dnd.translation.character.ISubraceTranslator
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Component
class SubraceTranslator : ISubraceTranslator {
    /**
     * TODO
     *   "ALL_TRAITS" and "ALL_STATS" are list of all stats or traits that are added to args at the facade
     */
    @Autowired
    private lateinit var subraceFactory : ISubraceFactory

    @Autowired
    @Qualifier("StatBonusFactory")
    private lateinit var statBonusFactory : IBonusFactory

    override fun translate(args: Map<String, Any>): ISubrace {
        val statBonuses = ArrayList<IBonus>()

        for ((statNumber, stat) in (args["ALL_STATS"] as List<Stat>).withIndex()) {
            val statMap: Map<String, Any> = mapOf(
                    Pair<String, Any>("name", stat.fullName),
                    Pair<String, Any>("description", stat.description),
                    Pair<String, Any>("origin", stat.fullName),
                    Pair<String, Any>("stat", stat),
                    Pair<String, Any>("value", (args["ability_bonuses"] as ArrayList<Int>)[statNumber])      // index out of range exception
            )
            statBonuses.add(statBonusFactory.createBonus(statMap))
        }

        val traitList = ArrayList<Trait>()
        for (traitMap in args["racial_traits"] as ArrayList<Map<String, Any>>) {
            for (trait in (args["ALL_TRAITS"] as List<Trait>)) {
                if ((traitMap["name"] as String) == trait.name) {
                    traitList.add(trait)
                    break
                }
            }
        }

        return subraceFactory.createSubrace(
                args["name"] as String,
                args["description"] as String,
                (args["race"] as Map<String, Any>)["name"] as String,
                statBonuses,
                traitList)
    }
}