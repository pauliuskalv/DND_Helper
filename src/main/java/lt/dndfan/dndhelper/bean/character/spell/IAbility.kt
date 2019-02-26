package lt.dndfan.dndhelper.bean.character.spell

import lt.dndfan.dndhelper.bean.character.constant.ERestType
import lt.dndfan.dndhelper.bean.character.spell.impl.Spell

interface IAbility {
    val name : String
    val description : String

    val spell : Spell

    val once : Boolean          // can you cast this spell only once?
    val refresh : ERestType
}