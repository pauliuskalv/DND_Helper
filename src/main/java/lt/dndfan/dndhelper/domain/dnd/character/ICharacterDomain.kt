package lt.dndfan.dndhelper.domain.dnd.character

import lt.dndfan.dndhelper.bean.character.ICharacter
import lt.dndfan.dndhelper.bean.character.IPlayableCharacter

interface ICharacterDomain {
    // Creation
    fun createCharacter(args : Map<String, Any>) : ICharacter
    fun createPlayableCharacter(args : Map<String, Any>) : IPlayableCharacter

    fun getCharacterByName(name : String) : ICharacter
}