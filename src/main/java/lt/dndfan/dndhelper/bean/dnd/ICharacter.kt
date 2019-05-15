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

    /**
     * Again, list of all stats should be passed in at a Facade level as ALL_STATS.
     * TODO: Change this as a pair of stat and a value.
     */
    val allStats: List<IStat>
    var temporaryHitPoints : Int
    var maxHitPoints : Int
    var currentHitPoints : Int

    var armorClass : Int
    var initiative : Int
    var speed : Int
    /** Consider making swimmingSpeed bonus. */
    var swimmingSpeed : Int
    /** Consider making flyingSpeed bonus.*/
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

    /** TODO: What if instead of these add/remove methods we could use add/removeBonus? */
    fun addAbility(ability: IAbility)
    fun removeAbility(ability: IAbility)

    fun getStat(desiredStat: IStat): Int
    /** setStat should only be used to set initial rolled stats. */
    fun setStat(desiredStat: IStat, value: Int)

    fun addLanguage(language : Language)
    fun removeLanguage(language : Language)

    fun addResistance(resistance : String)
    fun removeResistance(resistance : String)

    fun addVulnerability(vulnerability : String)
    fun removeVulnerability(vulnerability : String)
}
