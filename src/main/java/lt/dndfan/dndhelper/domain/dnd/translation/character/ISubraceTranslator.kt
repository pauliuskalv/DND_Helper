package lt.dndfan.dndhelper.domain.dnd.translation.character

import lt.dndfan.dndhelper.bean.dnd.character.impl.Subrace
import lt.dndfan.dndhelper.bean.dnd.feature.impl.Trait
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Stat

interface ISubraceTranslator {
    fun translate(args : Map<String,Any>) : Subrace
}