package lt.dndfan.dndhelper.bean.dnd.character.impl

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.character.ISubrace
import lt.dndfan.dndhelper.bean.dnd.feature.ITrait

class Subrace(override val name: String,
              override val description: String,
              override val race: String,
              override val bonuses: List<IBonus>
              ) : ISubrace