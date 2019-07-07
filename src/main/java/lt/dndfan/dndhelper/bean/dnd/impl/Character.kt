package lt.dndfan.dndhelper.bean.dnd.impl

import lt.dndfan.dndhelper.bean.dnd.ICharacter
import lt.dndfan.dndhelper.bean.dnd.constant.EAlignment
import lt.dndfan.dndhelper.bean.dnd.feature.ICondition
import lt.dndfan.dndhelper.bean.dnd.feature.ITrait
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Language
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Stat
import lt.dndfan.dndhelper.bean.dnd.spell.IAbility
import lt.dndfan.dndhelper.bean.dnd.stats.IStat
import lt.dndfan.dndhelper.util.collection.impl.Pair

open class Character(override val allStats: List<Stat>,
                     override val statPairs: List<Pair<IStat, Int>>,
                     override var level : Int,
                     override var armorClass: Int,
                     override var initiative: Int,
                     override var speed: Int,
                     override var swimmingSpeed: Int,
                     override var flyingSpeed: Int,
                     override var alignment: EAlignment,
                     override var hitDiceCount: Int,
                     override var currentHitDice: Int,
                     override val name: String,
                     override val description: String,
                     override val traits: List<ITrait>,

                     override var temporaryHitPoints: Int,
                     override var maxHitPoints: Int,
                     override var currentHitPoints: Int,

                     override var inspiration: Boolean,
                     override var inspirationDie: Int

) : ICharacter {
    /**
     *  Stats should contain every stat from allStats and a number.
     *  The list of all available stats should be passed at a facade level as ALL_STATS.
     *  TODO: Change "ArrayList<Pair" to "Map<".
     */
    private val stats = ArrayList<Pair<Stat, Int>>()

    /** Conditions should be empty on character creation */
    override val conditions : ArrayList<ICondition> = ArrayList()

    private val abilityList : ArrayList<IAbility> = ArrayList()
    override val abilities : List<IAbility>
    get() = abilityList

    private val languageList : ArrayList<Language> = ArrayList()
    override val languages: List<Language>
    get() = languageList

    private val resistanceList : ArrayList<String> = ArrayList()
    override val resistances: List<String>
    get() = resistanceList

    private val vulnerabilityList : ArrayList<String> = ArrayList()
    override val vulnerabilities: List<String>
    get() = vulnerabilityList

    override fun addAbility(ability: IAbility) {
        if(!abilityList.contains(ability)) {
            abilityList.add(ability)
        }
    }

    override fun removeAbility(ability: IAbility) {
        if(abilityList.contains(ability)) {
            abilityList.remove(ability)
        }
    }

    override fun getStat(desiredStat: IStat): Int {
        for (stat in stats) {
            if (stat.key == desiredStat)
                return stat.value
        }

        return 0
    }

    /**
     * setStat should only be used to set the raw default stats that were rolled.
     * All further stat modification should be done through bonuses.
     */
    override fun setStat(desiredStat: IStat, value: Int) {
        for (stat in stats) {
            if (stat.key == desiredStat) {
                stat.value = value
                break
            }
        }
    }

    override fun addLanguage(language: Language) {
        if (!languageList.contains(language))
            languageList.add(language)
    }

    override fun removeLanguage(language: Language) {
        if (languageList.contains(language))
            languageList.remove(language)
    }

    override fun addResistance(resistance: String) {
        if (!resistanceList.contains(resistance))
            resistanceList.add(resistance)
    }

    override fun removeResistance(resistance: String) {
        if (resistanceList.contains(resistance))
            resistanceList.remove(resistance)
    }

    override fun addVulnerability(vulnerability: String) {
        if (!vulnerabilityList.contains(vulnerability))
            vulnerabilityList.add(vulnerability)
    }

    override fun removeVulnerability(vulnerability: String) {
        if (vulnerabilityList.contains(vulnerability))
            vulnerabilityList.remove(vulnerability)
    }
}