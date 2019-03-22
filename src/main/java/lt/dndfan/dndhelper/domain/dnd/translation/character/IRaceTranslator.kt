package lt.dndfan.dndhelper.domain.dnd.translation.character

import lt.dndfan.dndhelper.bean.dnd.character.impl.Race
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Stat

interface IRaceTranslator {
    fun translate(args: Map<String,Any>,
                  allStats : ArrayList<Stat>) : Race
}