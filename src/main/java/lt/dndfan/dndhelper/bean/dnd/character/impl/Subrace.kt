package lt.dndfan.dndhelper.bean.dnd.character.impl

import lt.dndfan.dndhelper.bean.dnd.bonus.impl.StatBonus
import lt.dndfan.dndhelper.bean.dnd.character.ISubrace
import lt.dndfan.dndhelper.bean.dnd.feature.ITrait

class Subrace(override val name: String,
              override val description: String,
              override val race: String,
              override val statBonuses: List<StatBonus>,
              override val traits: List<ITrait>
              ) : ISubrace