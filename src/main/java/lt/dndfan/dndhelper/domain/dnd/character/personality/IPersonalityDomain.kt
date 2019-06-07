package lt.dndfan.dndhelper.domain.dnd.character.personality

import lt.dndfan.dndhelper.bean.dnd.IPlayableCharacter

/**
 * TODO: Add remove/add bond/flaw/ideal functions.
 *
 */

interface IPersonalityDomain {
    fun getPersonalityTraits(character : IPlayableCharacter) : List<String>
    fun getAlignment(character :  IPlayableCharacter) : String
    fun getBonds(character : IPlayableCharacter) : List<String>
    fun getFlaws(character : IPlayableCharacter) : List<String>
    fun getIdeals(character : IPlayableCharacter) : List<String>
}