package lt.dndfan.dndhelper.bean.character.spell

import lt.dndfan.dndhelper.bean.character.constant.ERestType
import lt.dndfan.dndhelper.bean.character.spell.impl.Spell

interface IAbility {
    val name : String
    val description : String

    val once : Boolean          // can you use ability only once
    val refresh : ERestType
}