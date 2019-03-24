package lt.dndfan.dndhelper.domain.dnd.translation.character

import lt.dndfan.dndhelper.bean.dnd.character.impl.CharacterSubclass
import lt.dndfan.dndhelper.bean.dnd.feature.impl.Trait

interface ISubclassTranslator {
    fun translate (args: Map<String,Any>,
                   allTraits : List<Trait>) : CharacterSubclass
}