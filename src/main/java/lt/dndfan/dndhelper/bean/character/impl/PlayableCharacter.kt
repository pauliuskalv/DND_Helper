package lt.dndfan.dndhelper.bean.character.impl

import lt.dndfan.dndhelper.bean.character.IPlayableCharacter
import lt.dndfan.dndhelper.bean.character.bonus.IBonus
import lt.dndfan.dndhelper.bean.character.constant.EAlignment
import lt.dndfan.dndhelper.bean.character.constant.ESkill
import lt.dndfan.dndhelper.bean.character.constant.EStat
import lt.dndfan.dndhelper.bean.character.feature.IFeature
import lt.dndfan.dndhelper.bean.character.inventory.ICharacterInventory
import javax.management.monitor.StringMonitor

open class PlayableCharacter(
        override var armorClass: Int,
        override var initiative: Int,
        override var speed: Int,
        override var swimmingSpeed: Int,
        override var flyingSpeed: Int,
        override var alignment: EAlignment,
        override val hitDice: Int,
        override var hitDiceCount: Int,
        override var currentHitDice: Int,
        override val name: String,
        override val description: String,
        override val traits: List<String>,

        override var temporaryHitPoints: Int,
        override var maxHitPoints: Int,
        override var currentHitPoints: Int,

        override val characterClass: String,
        override val characterSubclass: String,

        private val characterInventory : ICharacterInventory
) : IPlayableCharacter,
        Character(armorClass,
                  initiative,
                  speed,
                  swimmingSpeed,
                  flyingSpeed,
                  alignment,
                  hitDice,
                  hitDiceCount,
                  currentHitDice,
                  name,
                  description,
                  traits,

                  temporaryHitPoints,
                  maxHitPoints,
                  currentHitPoints
        ) {
    private val savingThrowProficiencyList : ArrayList<EStat> = ArrayList()
    override val savingThrowProficiencies: List<EStat>
    get() = savingThrowProficiencyList

    private val skillProficiencyList : ArrayList<ESkill> = ArrayList()
    override val skillProficiencies: List<ESkill>
    get() = skillProficiencyList

    private val itemProficiencyList : ArrayList<String> = ArrayList()
    override val itemProficiencies: List<String>
    get() = itemProficiencyList

    private val featureList : ArrayList<IFeature> = ArrayList()
    override val features: List<IFeature>
    get() = featureList

    private val bonusList : ArrayList<IBonus> = ArrayList()

    override fun addSavingThrowProficiency(prof: EStat) {
        if (!savingThrowProficiencyList.contains(prof))
            savingThrowProficiencyList.add(prof)
    }

    override fun removeSavingThrowProficiency(prof: EStat) {
        if (savingThrowProficiencyList.contains(prof))
            savingThrowProficiencyList.remove(prof)
    }

    override fun addSkillProficiency(skill: ESkill) {
        if (!skillProficiencyList.contains(skill))
            skillProficiencyList.add(skill)
    }

    override fun removeSkillProficiency(skill: ESkill) {
        if (skillProficiencyList.contains(skill))
            skillProficiencyList.remove(skill)
    }

    override fun addItemProficiency(prof: String) {
        if (!itemProficiencyList.contains(prof))
            itemProficiencyList.add(prof)
    }

    override fun removeItemProficiency(prof: String) {
        if (itemProficiencyList.contains(prof))
            itemProficiencyList.remove(prof)
    }

    override fun addFeature(feature: IFeature) {
        if (!featureList.contains(feature))
            featureList.add(feature)
    }

    override fun removeFeature(feature: IFeature) {
        if (featureList.contains(feature))
            featureList.remove(feature)
    }

    override fun getInventory(): ICharacterInventory = characterInventory

    override fun isBonusesApplied(): Boolean {
        var applied = true

        for (bonus in bonusList)
            if (!bonus.isApplied())
                applied = false

        return applied
    }

    override fun applyBonuses() {
        for (bonus in bonusList)
            bonus.apply(this)
    }

    override fun removeBonuses() {
        for (bonus in bonusList)
            bonus.apply(this)
    }

    override fun shortRest() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun longRest() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}