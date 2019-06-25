package lt.dndfan.dndhelper.domain.dnd.character.feature

import lt.dndfan.dndhelper.bean.dnd.ICharacter
import lt.dndfan.dndhelper.bean.dnd.feature.ITrait

interface ITraitDomain {
    /** Used to get a specific trait */
    fun getTraitByName(character : ICharacter, name : String) : ITrait
    /** Used for searches */
    fun getTraitsByName(character : ICharacter, name : String) : List<ITrait>
    fun getTraitsByDescription(character : ICharacter, desc : String) : List<ITrait>
}