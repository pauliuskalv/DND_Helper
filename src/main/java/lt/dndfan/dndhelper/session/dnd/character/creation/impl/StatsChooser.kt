package lt.dndfan.dndhelper.session.dnd.character.creation.impl

import lt.dndfan.dndhelper.bean.dnd.IPlayableCharacter
import lt.dndfan.dndhelper.bean.dnd.stats.IStat
import lt.dndfan.dndhelper.session.dnd.character.creation.IDualTableChooser
import lt.dndfan.dndhelper.session.dnd.character.creation.IStatChooser
import lt.dndfan.dndhelper.util.collection.impl.Pair

/**
 * Facade used in new character creation and during level up.
 * Consider moving it to different package.
 */

class StatsChooser(val character: IPlayableCharacter) : IStatChooser {
    override var statPoints: Int = 0 // = character.statPoints
    override val improvedStats = ArrayList<Pair<IStat, Int>>()

    override fun applyChanges() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        /**
        if(canApply()) {
            /** TODO: Implement character.changeStat() */
            //character.changeStat(improvedStats)
        }
        */
    }
}