package lt.dndfan.dndhelper.bean.dnd.character.impl

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.character.IRace

class Race (override val name: String,
            override val speed: Int,
            override val size: String,
            override val bonuses: List<IBonus>) : IRace