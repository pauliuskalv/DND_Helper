package lt.dndfan.dndhelper.domain.dnd.translation.character

import lt.dndfan.dndhelper.bean.dnd.character.ISubrace

interface ISubraceTranslator {
    fun translate(args : Map<String,Any>) : ISubrace
}