package lt.dndfan.dndhelper.domain.dnd.translation.character

import lt.dndfan.dndhelper.bean.dnd.character.impl.CharacterClass

interface IClassTranslator {
    fun translate(args: Map<String, Any>) : CharacterClass
}