package lt.dndfan.dndhelper.bean.dnd.character

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.character.impl.Subrace
import lt.dndfan.dndhelper.bean.dnd.feature.ITrait

interface ISubraceFactory {
    fun createSubrace(name: String,
                      description: String,
                      race: String,
                      bonuses: List<IBonus>,
                      traitList : List<ITrait>
    ) : Subrace
}