package lt.dndfan.dndhelper.bean.character.spell.impl

import lt.dndfan.dndhelper.bean.character.constant.ERestType
import lt.dndfan.dndhelper.bean.character.spell.IAbility
import lt.dndfan.dndhelper.bean.character.spell.ISpell

class Ability ( override val name: String,
                override val description : String,
                override val once: Boolean,
                override val refresh: ERestType) : IAbility