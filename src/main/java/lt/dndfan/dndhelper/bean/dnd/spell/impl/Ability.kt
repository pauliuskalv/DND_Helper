package lt.dndfan.dndhelper.bean.dnd.spell.impl

import lt.dndfan.dndhelper.bean.dnd.constant.ERestType
import lt.dndfan.dndhelper.bean.dnd.spell.IAbility

class Ability ( override val name: String,
                override val description : String,
                override val count: Int,
                override val used: Int,
                override val refresh: ERestType) : IAbility