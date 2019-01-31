package lt.dndfan.dndhelper.bean.character.spell.impl

import lt.dndfan.dndhelper.bean.character.spell.ISpell
import lt.dndfan.dndhelper.bean.character.spell.ISpellPool
import lt.dndfan.dndhelper.util.collection.IPair

class SpellPool(override val spellList: List<IPair<ISpell, Boolean>>) : ISpellPool {
    private val

    override fun getSpell(name: String, spellLevel: Int): ISpell {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addSpell(spell: ISpell) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun removeSpell(spell: ISpell) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun prepareSpell(spell: ISpell) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun unprepareSpell(spell: ISpell) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isPrepared(spell: ISpell): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun iterator(): Iterator<ISpell> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}