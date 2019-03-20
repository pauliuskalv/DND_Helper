package lt.dndfan.dndhelper.bean.dnd

import lt.dndfan.dndhelper.bean.dnd.constant.EAlignment
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Language
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Stat
import lt.dndfan.dndhelper.bean.dnd.spell.IAbility

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
    var temporaryHitPoints : Int
    var maxHitPoints : Int
    var currentHitPoints : Int

    // TODO: Create trait interface
    var armorClass : Int
    var initiative : Int
    var speed : Int
    var swimmingSpeed : Int
    var flyingSpeed : Int
    val languages : List<Language>
    var alignment : EAlignment

    val resistances : List<String>
    val vulnerabilities : List<String>

    var hitDiceCount : Int
    var currentHitDice : Int

    val name : String
    val description : String

    val traits : List<String>       // e. g. Darkvision
    val abilities : List<IAbility>

    fun addAbility(ability: IAbility)
    fun removeAbility(ability: IAbility)

    fun getStat(desiredStat: Stat): Int
    fun setStat(desiredStat: Stat, value: Int)

    fun addLanguage(language : Language)
    fun removeLanguage(language : Language)

    fun addResistance(resistance : String)
    fun removeResistance(resistance : String)

    fun addVulnerability(vulnerability : String)
    fun removeVulnerability(vulnerability : String)
}
