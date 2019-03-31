package lt.dndfan.dndhelper.domain.dnd.translation.character

import lt.dndfan.dndhelper.bean.dnd.character.IRace

interface IRaceTranslator {
    fun translate(args: Map<String,Any>) : IRace
}