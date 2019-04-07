package lt.dndfan.dndhelper.domain.dnd.translation.character

import lt.dndfan.dndhelper.bean.dnd.character.ICharacterSubclass

interface ISubclassTranslator {
    fun translate (args: Map<String,Any>) : ICharacterSubclass
}