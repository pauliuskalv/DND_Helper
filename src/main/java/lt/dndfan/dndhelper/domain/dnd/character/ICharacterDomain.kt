package lt.dndfan.dndhelper.domain.dnd.character

import lt.dndfan.dndhelper.bean.dnd.ICharacter
import lt.dndfan.dndhelper.bean.dnd.IPlayableCharacter
import lt.dndfan.dndhelper.bean.dnd.ISpellcaster

interface ICharacterDomain {
    /** Creation */
    fun createCharacter(args : Map<String, Any>) : ICharacter
    fun createPlayableCharacter(args : Map<String, Any>) : IPlayableCharacter
    fun createSpellCaster(args : Map<String,Any>) : ISpellcaster

    /** characterList is a global character list */
    fun getCharacterByName(characterList: List<ICharacter>, name : String) : ICharacter
}