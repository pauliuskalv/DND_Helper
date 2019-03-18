package lt.dndfan.dndhelper.bean.dnd

import lt.dndfan.dndhelper.bean.dnd.constant.ESpellSlot
import lt.dndfan.dndhelper.bean.dnd.spell.ISpell
import lt.dndfan.dndhelper.bean.dnd.spell.ISpellPool
import lt.dndfan.dndhelper.util.collection.IPair

interface ISpellcaster : IPlayableCharacter {
    var spellsKnown : Int
    var cantripsKnown : Int

    val spellSlots : List<IPair<ESpellSlot, Int>>
    val spellPool : ISpellPool

    fun castSpell(spell : ISpell) : Boolean

    fun resetSlots()
}