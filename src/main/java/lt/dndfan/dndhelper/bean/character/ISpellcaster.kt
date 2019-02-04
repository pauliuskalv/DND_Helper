package lt.dndfan.dndhelper.bean.character

import lt.dndfan.dndhelper.bean.character.constant.ESpellSlot
import lt.dndfan.dndhelper.bean.character.spell.ISpell
import lt.dndfan.dndhelper.bean.character.spell.ISpellPool
import lt.dndfan.dndhelper.util.collection.IPair

interface ISpellcaster : IPlayableCharacter {
    var spellsKnown : Int
    var cantripsKnown : Int

    val spellSlots : List<IPair<ESpellSlot, Int>>
    val spellPool : ISpellPool

    fun castSpell(spell : ISpell) : Boolean

    fun resetSlots()
}