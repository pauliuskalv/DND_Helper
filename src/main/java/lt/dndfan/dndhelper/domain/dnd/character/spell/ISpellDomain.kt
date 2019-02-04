package lt.dndfan.dndhelper.domain.dnd.character.spell

import lt.dndfan.dndhelper.bean.character.IPlayableCharacter
import lt.dndfan.dndhelper.bean.character.spell.ISpell

interface ISpellDomain {
    fun isValid(character : IPlayableCharacter, spell : ISpell) : Boolean
}