package lt.dndfan.dndhelper.service.dnd.character.overview.impl

import lt.dndfan.dndhelper.bean.dnd.ISpellcaster
import lt.dndfan.dndhelper.domain.dnd.character.spell.impl.SpellDomain
import lt.dndfan.dndhelper.service.dnd.character.overview.ISingleListFacade

/**
 * Should provide prepared and maybe overall available spells.
 * Also should provide spell slots.
 */

class Spells (
        spellDomain: SpellDomain,
        character : ISpellcaster,
        override val title: String
) : ISingleListFacade
{
    override val list = spellDomain.getCharacterSpellNames(character)
}