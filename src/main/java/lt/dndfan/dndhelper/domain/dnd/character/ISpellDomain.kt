package lt.dndfan.dndhelper.domain.dnd.character

import lt.dndfan.dndhelper.bean.character.ISpellcaster
import lt.dndfan.dndhelper.bean.character.constant.ESpellComponent
import lt.dndfan.dndhelper.bean.character.spell.ISpell

interface ISpellDomain {
    fun addSpell(character: ISpellcaster, spell: ISpell) : Boolean
    fun removeSpell(character: ISpellcaster, spell: ISpell) : Boolean

    fun getPreparedSpells(character: ISpellcaster) : List<ISpell>
    fun getKnownSpells(character: ISpellcaster) : List<ISpell>

    fun getSpellsByLevel(spells : List<ISpell>, character: ISpellcaster, level : Int) : List<ISpell>
    fun getSpellsByDescription(spells : List<ISpell>, desc : String) : List<ISpell>
    fun getSpellsByComponent(spells : List<ISpell>, components : List<ESpellComponent>) : List<ISpell>

    fun isValid(character : ISpellcaster, spell : ISpell) : Boolean
}