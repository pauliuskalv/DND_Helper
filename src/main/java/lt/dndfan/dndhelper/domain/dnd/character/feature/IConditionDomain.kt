package lt.dndfan.dndhelper.domain.dnd.character.feature

import lt.dndfan.dndhelper.bean.dnd.ICharacter
import lt.dndfan.dndhelper.bean.dnd.feature.ICondition

interface IConditionDomain {
    /** Used to get a specific condition */
    fun getConditionByName(character : ICharacter, name : String) : ICondition
    /** Used for searches */
    fun getConditionsByName(character : ICharacter, name : String) : List<ICondition>
    fun getConditionsByDescription(character : ICharacter, desc : String) : List<ICondition>
}