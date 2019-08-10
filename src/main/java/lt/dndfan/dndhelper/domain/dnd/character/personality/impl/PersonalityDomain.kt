package lt.dndfan.dndhelper.domain.dnd.character.personality.impl

import lt.dndfan.dndhelper.bean.dnd.IPlayableCharacter
import lt.dndfan.dndhelper.domain.dnd.character.personality.IPersonalityDomain
import org.springframework.stereotype.Component

@Component
class PersonalityDomain : IPersonalityDomain {
    override fun getPersonalityTraits(character: IPlayableCharacter): List<String> {
        return character.personalityTraits
    }

    override fun getAlignment(character: IPlayableCharacter): String {
        return character.alignment.alignmentName
    }

    override fun getBonds(character: IPlayableCharacter): List<String> {
        return character.bonds
    }

    override fun getFlaws(character: IPlayableCharacter): List<String> {
        return character.flaws
    }

    override fun getIdeals(character: IPlayableCharacter): List<String> {
        return character.ideals
    }

}