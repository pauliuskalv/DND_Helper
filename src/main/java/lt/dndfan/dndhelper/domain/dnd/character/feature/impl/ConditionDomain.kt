package lt.dndfan.dndhelper.domain.dnd.character.feature.impl

import lt.dndfan.dndhelper.bean.dnd.ICharacter
import lt.dndfan.dndhelper.bean.dnd.feature.ICondition
import lt.dndfan.dndhelper.domain.dnd.character.feature.IConditionDomain

class ConditionDomain : IConditionDomain {
    override fun getConditionByName(character: ICharacter, name: String): ICondition {
        for (condition in character.conditions) {
            condition.name === name
            return condition
        }
        /** TODO: Exception */
        return character.conditions[0]
    }
    override fun getConditionsByDescription(character: ICharacter, desc: String): List<ICondition> {
        val matchedList = ArrayList<ICondition>()
        for (condition in character.conditions) {
            if(condition.description.contains("""*$desc*""")) {
                matchedList.add(condition)
            }
        }
        return matchedList
    }
    override fun getConditionsByName(character: ICharacter, name: String): List<ICondition> {
        val matchedList = ArrayList<ICondition>()
        for (condition in character.conditions) {
            if(condition.name.contains("""*$name*""")) {
                matchedList.add(condition)
            }
        }
        return matchedList
    }
}