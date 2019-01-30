package lt.dndfan.dndhelper.bean.character.spell

interface ISpellList : Iterable<ISpell> {
    fun getSpell(name : String) : ISpell

    fun addSpell(spell : ISpell)
    fun removeSpell(spell : ISpell)
}