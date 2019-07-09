package lt.dndfan.dndhelper.facade.dnd.character.creation.impl

import lt.dndfan.dndhelper.bean.dnd.IPlayableCharacter
import lt.dndfan.dndhelper.bean.dnd.bonus.impl.StatBonusFactory
import lt.dndfan.dndhelper.bean.dnd.stats.IStat
import lt.dndfan.dndhelper.facade.dnd.character.creation.IStatChooser


class BonusStatChooser (val character : IPlayableCharacter,
                        /** Could pass in a corresponding trait name */
                        val origin: String = "Ability Score Improvement",
                        val description: String = "Stat improvement from level up.") : IStatChooser {
    override val stats = character.statPairs
    override var statPoints = character.statPoints
    override val improvedStats = ArrayList<lt.dndfan.dndhelper.util.collection.impl.Pair<IStat, Int>>()

    override fun applyChanges() {
        if(canApply()) {
            val bonusFactory = StatBonusFactory()
            for (improvedPair in improvedStats) {
                for (pair in stats) {
                    if(pair.key == improvedPair.key) {
                        val bonusMap: Map<String, Any> = mapOf(
                                Pair("name", improvedPair.key.fullName + " bonus"),
                                Pair("description", description),
                                Pair("origin", origin),
                                Pair("stat", improvedPair.key),
                                /** Assuming no negative values */
                                Pair("value", improvedPair.value - pair.value)
                        )
                        bonusFactory.createBonus(bonusMap)
                        break
                    }
                }
            }
            /** Not sure if applyBonuses should be called here */
            character.applyBonuses()
        }
    }
}