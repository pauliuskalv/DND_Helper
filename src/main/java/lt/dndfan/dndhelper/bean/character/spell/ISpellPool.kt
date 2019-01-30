package lt.dndfan.dndhelper.bean.character.spell

import lt.dndfan.dndhelper.util.collection.IPair

interface ISpellPool : Iterable<ISpell> {
    val spellList : List<IPair<ISpell, Boolean>>

    fun getSpell(name : String, spellLevel : Int = 0) : ISpell

    fun addSpell(spell : ISpell)
    fun removeSpell(spell : ISpell)

    fun prepareSpell(spell : ISpell)
    fun unprepareSpell(spell : ISpell)

    fun isPrepared(spell : ISpell) : Boolean
}