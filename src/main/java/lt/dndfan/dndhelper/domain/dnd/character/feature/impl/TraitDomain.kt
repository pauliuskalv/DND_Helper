package lt.dndfan.dndhelper.domain.dnd.character.feature.impl

import lt.dndfan.dndhelper.bean.dnd.ICharacter
import lt.dndfan.dndhelper.bean.dnd.feature.ITrait
import lt.dndfan.dndhelper.domain.dnd.character.feature.ITraitDomain
import org.springframework.stereotype.Component

@Component
class TraitDomain : ITraitDomain {
    override fun getTraitByName(character: ICharacter, name: String): ITrait {
        for (trait in character.traits) {
            if(trait.name == name) {
                return trait
            }
        }
        /** TODO: Exception */
        return character.traits[0]
    }
    override fun getTraitsByDescription(character: ICharacter, desc: String): List<ITrait> {
        val matchedList = ArrayList<ITrait>()
        for (trait in character.traits) {
            if(trait.description.contains("""*$desc*""") ||
                    trait.description.toLowerCase().contains("""*$desc*""")) {
                matchedList.add(trait)
            }
        }
        return matchedList
    }
    override fun getTraitsByName(character: ICharacter, name: String): List<ITrait> {
        val matchedList = ArrayList<ITrait>()
        for (trait in character.traits) {
            if(trait.name.contains("""*$name*""") ||
                    trait.name.toLowerCase().contains("""*$name*""")) {
                matchedList.add(trait)
            }
        }
        return matchedList
    }
}