package lt.dndfan.dndhelper.bean.character

import lt.dndfan.dndhelper.bean.character.constant.EAlignment
import lt.dndfan.dndhelper.bean.character.constant.ELanguage
import lt.dndfan.dndhelper.bean.character.constant.EStat

interface ICharacter {
    /**
     * Stats
     * ArmorClass
     * Speed
     * Swimming speed
     * Alignment
     * Name
     * Description
     * Resistances
     * Vulnerabilities
     * Languages
     * Hit dice
     */
    val armorClass : Int
    val speed : Int
    val swimmingSpeed : Int
    val languages : List<ELanguage>
    val alignment : EAlignment

    val resistances : List<String>
    val vulnerabilities : List<String>

    val hitDice : Int

    val name : String
    val description : String

    fun getStat(desiredStat: EStat): Int
    fun setStat(desiredStat: EStat, value: Int)
}