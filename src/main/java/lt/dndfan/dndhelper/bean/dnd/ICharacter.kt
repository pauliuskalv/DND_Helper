package lt.dndfan.dndhelper.bean.dnd

import lt.dndfan.dndhelper.bean.dnd.constant.EAlignment
import lt.dndfan.dndhelper.bean.dnd.spell.IAbility
import lt.dndfan.dndhelper.bean.dnd.stats.ILanguage
import lt.dndfan.dndhelper.bean.dnd.stats.IStat
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Language

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
     * Traits
     * Abilities
     */
    val allStats: List<IStat>
    var temporaryHitPoints : Int
    var maxHitPoints : Int
    var currentHitPoints : Int

    var armorClass : Int
    var initiative : Int
    var speed : Int
    var swimmingSpeed : Int
    var flyingSpeed : Int
    val languages : List<ILanguage>
    var alignment : EAlignment

    val resistances : List<String>
    val vulnerabilities : List<String>

    var hitDiceCount : Int
    var currentHitDice : Int

    val name : String
    val description : String

    /** e. g. Darkvision */
    val traits : List<String>
    /** e. g. Barbarian`s "Rage" or Tiefling`s "Hellish Rebuke" */
    val abilities : List<IAbility>
    /** Whether the character is inspired by a bard */
    var inspiration : Boolean
    /** 6 for d6, 10 for d10 */
    var inspirationDie : Int

    fun addAbility(ability: IAbility)
    fun removeAbility(ability: IAbility)

    fun getStat(desiredStat: IStat): Int
    fun setStat(desiredStat: IStat, value: Int)

    fun addLanguage(language : Language)
    fun removeLanguage(language : Language)

    fun addResistance(resistance : String)
    fun removeResistance(resistance : String)

    fun addVulnerability(vulnerability : String)
    fun removeVulnerability(vulnerability : String)
}
