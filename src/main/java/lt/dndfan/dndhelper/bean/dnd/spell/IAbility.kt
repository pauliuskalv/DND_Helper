package lt.dndfan.dndhelper.bean.dnd.spell

import lt.dndfan.dndhelper.bean.dnd.constant.ERestType

interface IAbility {
    val name : String
    val description : String

    val count : Int             // if zero then it can be used without restriction
    val used : Int              // amount of times that the ability was already used

    val refresh : ERestType
}