package lt.dndfan.dndhelper.domain.dnd.character.spell

import lt.dndfan.dndhelper.bean.dnd.ISpellcaster
import lt.dndfan.dndhelper.bean.dnd.constant.ESpellComponent
import lt.dndfan.dndhelper.bean.dnd.spell.ISpell

interface ISpellDomain {
    fun addSpell(character: ISpellcaster, spell: ISpell) : Boolean
    fun removeSpell(character: ISpellcaster, spell: ISpell) : Boolean

    fun getSpell(spells : List<ISpell>, name : String) : ISpell

    fun getPreparedSpells(character: ISpellcaster) : List<ISpell>
    fun getKnownSpells(character: ISpellcaster) : List<ISpell>

    fun getSpellsByName(spells : List<ISpell>, name : String) : List<ISpell>
    fun getSpellsByLevel(spells : List<ISpell>, character: ISpellcaster, level : Int) : List<ISpell>
    fun getSpellsByDescription(spells : List<ISpell>, desc : String) : List<ISpell>
    fun getSpellsByComponent(spells : List<ISpell>, components : List<ESpellComponent>) : List<ISpell>

    fun isValid(character : ISpellcaster, spell : ISpell) : Boolean
}