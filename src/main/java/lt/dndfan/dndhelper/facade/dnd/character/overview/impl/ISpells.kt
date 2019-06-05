package lt.dndfan.dndhelper.facade.dnd.character.overview.impl

import lt.dndfan.dndhelper.bean.dnd.spell.ISpell

/**
 * Should provide prepared and maybe overall available spells.
 * Also should provide spell slots.
 */

interface ISpells {
    val spellList : List<ISpell>
}