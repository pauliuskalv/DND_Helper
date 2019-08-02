package lt.dndfan.dndhelper.bean.dnd.spell

interface ISpellPool : Iterable<ISpell> {
    fun getSpell(name : String, spellLevel : Int = 0) : ISpell
    fun getAllSpells() : List<ISpell>
    fun getAllSpellNames() : List<String>
    fun getPreparedSpells() : List<ISpell>

    fun addSpell(spell : ISpell)
    fun removeSpell(spell : ISpell)

    fun prepareSpell(spell : ISpell)
    fun unPrepareSpell(spell : ISpell)

    fun isPrepared(spell : ISpell) : Boolean
}