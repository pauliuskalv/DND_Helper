package lt.dndfan.dndhelper.bean.character.bonus

import lt.dndfan.dndhelper.bean.character.ICharacter
import lt.dndfan.dndhelper.bean.character.IPlayableCharacter

interface IBonus {
    val bonusName : String
    val description : String
    val origin : String

    fun apply(character : IPlayableCharacter)
    fun remove(character : IPlayableCharacter)
}