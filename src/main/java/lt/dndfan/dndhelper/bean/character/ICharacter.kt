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
    var armorClass : Int
    var speed : Int
    var swimmingSpeed : Int
    val languages : List<ELanguage>
    var alignment : EAlignment

    val resistances : List<String>
    val vulnerabilities : List<String>

    val hitDice : Int
    var hitDiceCount : Int
    var currentHitDice : Int

    val name : String
    val description : String

    fun getStat(desiredStat: EStat): Int
    fun setStat(desiredStat: EStat, value: Int)

    fun addLanguage(language : ELanguage)
    fun removeLanguage(language : ELanguage)

    fun addResistance(resistance : String)
    fun removeResistance(resistance : String)

    fun addVulnerability(vulnerability : String)
    fun removeVulnerability(vulnerability : String)
}