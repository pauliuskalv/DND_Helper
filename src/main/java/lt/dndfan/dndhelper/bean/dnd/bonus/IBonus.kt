package lt.dndfan.dndhelper.bean.dnd.bonus

import lt.dndfan.dndhelper.bean.dnd.IPlayableCharacter

interface IBonus {
    val bonusName : String
    val description : String
    val origin : String

    fun apply(character : IPlayableCharacter)
    fun remove(character : IPlayableCharacter)
    fun isApplied() : Boolean
}