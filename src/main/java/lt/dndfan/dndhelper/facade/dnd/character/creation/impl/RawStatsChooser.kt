package lt.dndfan.dndhelper.facade.dnd.character.creation.impl

import lt.dndfan.dndhelper.bean.dnd.IPlayableCharacter
import lt.dndfan.dndhelper.bean.dnd.stats.IStat
import lt.dndfan.dndhelper.facade.dnd.character.creation.IStatChooser
import lt.dndfan.dndhelper.util.collection.impl.Pair

/**
 * Facade used in new character creation and NOT on level up.
 */

class RawStatsChooser(val character: IPlayableCharacter) : IStatChooser {
    override var statPoints = character.statPoints
    override val stats = character.statPairs
    override val improvedStats = ArrayList<Pair<IStat, Int>>()

    override fun applyChanges() {
        if(canApply()) {
            for (improvedPair in improvedStats) {
                character.setStat(improvedPair.key, improvedPair.value)
            }
        }
    }
}