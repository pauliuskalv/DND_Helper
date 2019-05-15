package lt.dndfan.dndhelper.bean.dnd.spell.impl

import lt.dndfan.dndhelper.bean.dnd.spell.ISpell
import lt.dndfan.dndhelper.bean.dnd.spell.ISpellPool
import lt.dndfan.dndhelper.bean.dnd.spell.exception.SpellNotFoundException

class SpellPool : ISpellPool {
    private val spellList : HashMap<String, ISpell> = HashMap()
    private val preparedSpells : ArrayList<ISpell> = ArrayList()

    override fun getSpell(name: String, spellLevel: Int): ISpell {
        for (spell in this) {
            if (spell.spellName.equals(name) && spell.spellLevel.equals(spellLevel))
                return spell
        }

        throw SpellNotFoundException()
    }

    override fun addSpell(spell: ISpell) {
        this.spellList[spell.spellName] = spell
    }

    override fun removeSpell(spell: ISpell) {
        this.spellList.remove(spell.spellName)
    }

    override fun prepareSpell(spell: ISpell) {
        if (!preparedSpells.contains(spell))
            preparedSpells.add(spell)
    }

    override fun unPrepareSpell(spell: ISpell) {
        if (preparedSpells.contains(spell))
            preparedSpells.remove(spell)
    }

    override fun isPrepared(spell: ISpell): Boolean = preparedSpells.contains(spell)

    override fun iterator(): Iterator<ISpell> {
        return spellList.values.iterator()
    }
}