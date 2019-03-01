package lt.dndfan.dndhelper.bean.character.impl

import lt.dndfan.dndhelper.bean.character.ICharacter
import lt.dndfan.dndhelper.bean.character.constant.EAlignment
import lt.dndfan.dndhelper.bean.character.constant.ELanguage
import lt.dndfan.dndhelper.bean.character.constant.EStat
import lt.dndfan.dndhelper.bean.character.spell.IAbility
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
    private val stats : ArrayList<Pair<EStat, Int>> = arrayListOf(
            Pair(EStat.STRENGTH, 0),
            Pair(EStat.DEXTERITY, 0),
            Pair(EStat.CONSTITUTION, 0),
            Pair(EStat.INTELLIGENCE, 0),
            Pair(EStat.WISDOM, 0),
            Pair(EStat.CHARISMA, 0)
    )

    private val abilityList : ArrayList<IAbility> = ArrayList()
    override val abilities : List<IAbility>
    get() = abilityList

    private val languageList : ArrayList<ELanguage> = ArrayList()
    override val languages: List<ELanguage>
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

    override fun getStat(desiredStat: EStat): Int {
        for (stat in stats) {
            if (stat.key == desiredStat)
                return stat.value
        }

        return 0
    }

    override fun setStat(desiredStat: EStat, value: Int) {
        for (stat in stats) {
            if (stat.key == desiredStat) {
                stat.value = value
            }
        }
    }

    override fun addLanguage(language: ELanguage) {
        if (!languageList.contains(language))
            languageList.add(language)
    }

    override fun removeLanguage(language: ELanguage) {
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