package lt.dndfan.dndhelper.bean.dnd.character

import lt.dndfan.dndhelper.bean.dnd.bonus.impl.StatBonus
import lt.dndfan.dndhelper.bean.dnd.character.impl.Subrace
import lt.dndfan.dndhelper.bean.dnd.feature.impl.Trait

interface ISubraceFactory {
    fun createSubrace(name: String,
                      description: String,
                      race: String,
                      statBonuses: List<StatBonus>,
                      traits: List<Trait>
    ) : Subrace
}