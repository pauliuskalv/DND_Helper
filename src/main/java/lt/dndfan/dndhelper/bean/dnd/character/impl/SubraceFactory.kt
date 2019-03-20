package lt.dndfan.dndhelper.bean.dnd.character.impl

import lt.dndfan.dndhelper.bean.dnd.bonus.impl.StatBonus
import lt.dndfan.dndhelper.bean.dnd.character.ISubraceFactory
import lt.dndfan.dndhelper.bean.dnd.feature.impl.Trait

class SubraceFactory : ISubraceFactory {
    override fun createSubrace(name: String, description: String, race: String, statBonuses: List<StatBonus>, traits: List<Trait>): Subrace {
        return Subrace(name,
                description,
                race,
                statBonuses,
                traits)
    }
}