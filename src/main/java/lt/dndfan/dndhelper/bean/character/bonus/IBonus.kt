package lt.dndfan.dndhelper.bean.character.bonus

import lt.dndfan.dndhelper.bean.character.ICharacter

interface IBonus {
    val bonusName : String
    val description : String
    val origin : String

    fun apply(character : ICharacter)
    fun remove(character : ICharacter)
}