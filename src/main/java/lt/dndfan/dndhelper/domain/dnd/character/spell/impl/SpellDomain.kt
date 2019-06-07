package lt.dndfan.dndhelper.domain.dnd.character.spell.impl

import lt.dndfan.dndhelper.bean.dnd.ISpellcaster
import lt.dndfan.dndhelper.bean.dnd.constant.ESpellComponent
import lt.dndfan.dndhelper.bean.dnd.spell.ISpell
import lt.dndfan.dndhelper.domain.dnd.character.spell.ISpellDomain

class SpellDomain : ISpellDomain {
    /** Not sure if domain is a good place for ALL_SPELLS for ALL_SPELLS */
    override val ALL_SPELLS: List<ISpell>
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun addSpell(character: ISpellcaster, spell: ISpell): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun removeSpell(character: ISpellcaster, spell: ISpell): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getSpell(spells: List<ISpell>, name: String): ISpell {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCharacterSpells(character: ISpellcaster): List<ISpell> {
        return character.spellPool.getAllSpells()
    }

    override fun getCharacterSpellNames(character: ISpellcaster): List<String> {
        return character.spellPool.getAllSpellNames()
    }

    override fun getAllSpells(): List<ISpell> {
        return ALL_SPELLS
    }

    override fun getPreparedSpells(character: ISpellcaster): List<ISpell> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getKnownSpells(character: ISpellcaster): List<ISpell> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getSpellsByName(spells: List<ISpell>, name: String): List<ISpell> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getSpellsByLevel(spells: List<ISpell>, character: ISpellcaster, level: Int): List<ISpell> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getSpellsByDescription(spells: List<ISpell>, desc: String): List<ISpell> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getSpellsByComponent(spells: List<ISpell>, components: List<ESpellComponent>): List<ISpell> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isValid(character: ISpellcaster, spell: ISpell): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}