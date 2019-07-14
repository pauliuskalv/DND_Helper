package lt.dndfan.dndhelper.bean.dnd.character.impl

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.character.ISubraceFactory
import lt.dndfan.dndhelper.bean.dnd.feature.ITrait

class SubraceFactory : ISubraceFactory {
    override fun createSubrace(name: String, description: String, race: String, bonuses: List<IBonus>, traitList : List<ITrait>): Subrace {
        return Subrace(name,
                description,
                race,
                bonuses,
                traitList)
    }
}