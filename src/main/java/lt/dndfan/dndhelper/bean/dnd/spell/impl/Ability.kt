package lt.dndfan.dndhelper.bean.dnd.spell.impl

import lt.dndfan.dndhelper.bean.dnd.constant.ERestType
import lt.dndfan.dndhelper.bean.dnd.spell.IAbility

class Ability ( override val name: String,
                override val description : String,
                override val once: Boolean,
                override val refresh: ERestType) : IAbility