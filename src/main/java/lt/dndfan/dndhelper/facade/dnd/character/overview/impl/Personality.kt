package lt.dndfan.dndhelper.facade.dnd.character.overview.impl

import lt.dndfan.dndhelper.bean.dnd.IPlayableCharacter
import lt.dndfan.dndhelper.domain.dnd.character.personality.impl.PersonalityDomain
import lt.dndfan.dndhelper.facade.dnd.character.overview.ISingleListFacade

/**
 * Should provide character alignment, character traits and character background.
 * Consider separating everything to different facades.
 */

class Personality (
        val character : IPlayableCharacter,
        personalityDomain : PersonalityDomain
) : ISingleListFacade
{
    override val list = listOf(
                "Alignment\n" + personalityDomain.getAlignment(character),
                "Traits\n" + personalityDomain.getPersonalityTraits(character).toString(),
                "Bonds\n" + personalityDomain.getBonds(character).toString(),
                "Ideals\n" + personalityDomain.getIdeals(character).toString(),
                "Flaws\n" + personalityDomain.getFlaws(character).toString()
        )
}