package lt.dndfan.dndhelper.bean.dnd.impl

import lt.dndfan.dndhelper.bean.dnd.ICharacter
import lt.dndfan.dndhelper.bean.dnd.constant.EAlignment
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Language
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Stat
import lt.dndfan.dndhelper.bean.dnd.spell.IAbility
import lt.dndfan.dndhelper.util.collection.impl.Pair

open class Character(override var armorClass: Int,
                     override var initiative: Int,
                     override var speed: Int,
                     override var swimmingSpeed: Int,
                     override var flyingSpeed: Int,
                     override var alignment: EAlignment,
                     override var hitDiceCount: Int,
                     override var currentHitDice: Int,
                     override val name: String,
                     override val description: String,
                     override val traits: List<String>,

                     override var temporaryHitPoints: Int,
                     override var maxHitPoints: Int,
                     override var currentHitPoints: Int) : ICharacter {
    private val stats : ArrayList<Pair<Stat, Int>> = arrayListOf(
            Pair(Stat.STRENGTH, 0),
            Pair(Stat.DEXTERITY, 0),
            Pair(Stat.CONSTITUTION, 0),
            Pair(Stat.INTELLIGENCE, 0),
            Pair(Stat.WISDOM, 0),
            Pair(Stat.CHARISMA, 0)
    )

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

    override fun getStat(desiredStat: Stat): Int {
        for (stat in stats) {
            if (stat.key == desiredStat)
                return stat.value
        }

        return 0
    }

    override fun setStat(desiredStat: Stat, value: Int) {
        for (stat in stats) {
            if (stat.key == desiredStat) {
                stat.value = value
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