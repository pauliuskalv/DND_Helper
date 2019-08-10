package lt.dndfan.dndhelper.bean.dnd.character.impl

import lt.dndfan.dndhelper.bean.dnd.character.ICharacterSubclassFactory
import lt.dndfan.dndhelper.bean.dnd.feature.ITrait
import org.springframework.stereotype.Component

@Component
class CharacterSubclassFactory : ICharacterSubclassFactory {
    override fun createCharacterSubclass(name: String, description: String, characterClass: String, flavor: String, traits: List<ITrait>): CharacterSubclass {
        return CharacterSubclass(name,
                description,
                characterClass,
                flavor,
                traits)
    }
}