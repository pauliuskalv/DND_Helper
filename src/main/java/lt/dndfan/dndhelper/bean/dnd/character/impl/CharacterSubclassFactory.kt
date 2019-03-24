package lt.dndfan.dndhelper.bean.dnd.character.impl

import lt.dndfan.dndhelper.bean.dnd.character.ICharacterSubclass
import lt.dndfan.dndhelper.bean.dnd.character.ICharacterSubclassFactory
import lt.dndfan.dndhelper.bean.dnd.feature.impl.Trait

class CharacterSubclassFactory : ICharacterSubclassFactory {
    override fun createCharacterSubclass(name: String, description: String, characterClass: String, flavor: String, traits: List<Trait>): CharacterSubclass {
        return CharacterSubclass(name,
                description,
                characterClass,
                flavor,
                traits)
    }
}