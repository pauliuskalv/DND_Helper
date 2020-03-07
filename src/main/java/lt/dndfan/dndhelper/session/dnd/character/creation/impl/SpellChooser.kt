package lt.dndfan.dndhelper.session.dnd.character.creation.impl

import lt.dndfan.dndhelper.bean.dnd.ISpellcaster
import lt.dndfan.dndhelper.bean.dnd.spell.ISpell
import lt.dndfan.dndhelper.domain.dnd.character.spell.impl.SpellDomain
import lt.dndfan.dndhelper.session.dnd.character.creation.IDualTableChooser

/**
 * Facade responsible of providing possible spell choices.
 * This should be used not only during the character creation, but also at certain level ups.
 * Consider moving it to a different package?
 * Consider using Spell instead of ISpell.
 */
/**  */
class SpellChooser (override val choiceTable: ArrayList<Any>,
                     override val selectableObjects : Int,
                    val character : ISpellcaster) : IDualTableChooser() {
    override val chosenTable = ArrayList<Any>()

    override fun applyChanges() {
        if(canApply()) {
            val spellDomain = SpellDomain()
            for (spell in chosenTable as ArrayList<ISpell>) {
                spellDomain.addSpell(character, spell)
            }
        }
        /** May want to notify the user here that they have not selected enough items */
    }
}