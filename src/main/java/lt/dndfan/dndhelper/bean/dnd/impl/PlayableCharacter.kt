package lt.dndfan.dndhelper.bean.dnd.impl

import lt.dndfan.dndhelper.bean.dnd.IPlayableCharacter
import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.constant.EAlignment
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Stat
import lt.dndfan.dndhelper.bean.dnd.feature.IFeature
import lt.dndfan.dndhelper.bean.dnd.inventory.ICharacterInventory
import lt.dndfan.dndhelper.bean.dnd.inventory.item.impl.EquipableItem
import lt.dndfan.dndhelper.bean.dnd.spell.IAbility
import lt.dndfan.dndhelper.bean.dnd.stats.ISkill
import lt.dndfan.dndhelper.bean.dnd.stats.IStat

open class PlayableCharacter(
        override val allStats: List<Stat>,
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
        override val traits: List<String>,
        override val abilities: List<IAbility>,
        override val spellModifier: Stat,

        override var temporaryHitPoints: Int,
        override var maxHitPoints: Int,
        override var currentHitPoints: Int,

        override val characterClass: String,
        override val characterSubclass: String,

        override val race: String,
        override val subrace: String,

        override val characterInventory : ICharacterInventory,

        override var inspiration: Boolean,
        override var inspirationDie: Int
) : IPlayableCharacter,
        Character(allStats,
                  armorClass,
                  initiative,
                  speed,
                  swimmingSpeed,
                  flyingSpeed,
                  alignment,
                  hitDiceCount,
                  currentHitDice,
                  name,
                  description,
                  traits,

                  temporaryHitPoints,
                  maxHitPoints,
                  currentHitPoints,
                  inspiration,
                  inspirationDie
        ) {

    private val equippedItemList : ArrayList<EquipableItem> = ArrayList()
    override val characterEquipment : List<EquipableItem>
    get() = equippedItemList

    private val personalityTraitList : ArrayList<String> = ArrayList()
    override val personalityTraits: List<String>
    get() = personalityTraitList

    private val idealList : ArrayList<String> = ArrayList()
    override val ideals : List<String>
    get() = idealList

    private val bondList : ArrayList<String> = ArrayList()
    override val bonds : List<String>
    get() = bondList

    private val flawList : ArrayList<String> = ArrayList()
    override val flaws : List<String>
    get() = flawList

    private val savingThrowProficiencyList : ArrayList<IStat> = ArrayList()
    override val savingThrowProficiencies: List<IStat>
    get() = savingThrowProficiencyList

    private val skillProficiencyList : ArrayList<ISkill> = ArrayList()
    override val skillProficiencies: List<ISkill>
    get() = skillProficiencyList

    private val itemProficiencyList : ArrayList<String> = ArrayList()
    override val itemProficiencies: List<String>
    get() = itemProficiencyList

    private val featureList : ArrayList<IFeature> = ArrayList()
    override val features: List<IFeature>
    get() = featureList

    private val bonusList : ArrayList<IBonus> = ArrayList()

    override fun equipItem(item : EquipableItem){
        equippedItemList.add(item)
    }

    override fun unequipItem(item : EquipableItem){
        if(equippedItemList.contains(item))
            equippedItemList.remove(item)
    }

    override fun addPersonalityTrait(trait: String) {
        if (!personalityTraitList.contains(trait))
            personalityTraitList.add(trait)
    }

    override fun removePersonalityTrait(trait: String) {
        if(personalityTraitList.contains(trait))
            personalityTraitList.remove(trait)
    }

    override fun addIdeal(ideal: String) {
        if(!idealList.contains(ideal))
            idealList.add(ideal)
    }

    override fun removeIdeal(ideal: String) {
        if(idealList.contains(ideal))
            idealList.remove(ideal)
    }

    override fun addBond(bond: String) {
        if(!bondList.contains(bond))
            bondList.add(bond)
    }

    override fun removeBond(bond: String) {
        if(bondList.contains(bond))
            bondList.remove(bond)
    }

    override fun addFlaw(flaw: String) {
        if(!flawList.contains(flaw))
            flawList.add(flaw)
    }

    override fun removeFlaw(flaw: String) {
        if(flawList.contains(flaw))
            flawList.remove(flaw)
    }

    override fun addSavingThrowProficiency(prof: IStat) {
        if (!savingThrowProficiencyList.contains(prof))
            savingThrowProficiencyList.add(prof)
    }

    override fun removeSavingThrowProficiency(prof: IStat) {
        if (savingThrowProficiencyList.contains(prof))
            savingThrowProficiencyList.remove(prof)
    }

    override fun addSkillProficiency(skill: ISkill) {
        if (!skillProficiencyList.contains(skill))
            skillProficiencyList.add(skill)
    }

    override fun removeSkillProficiency(skill: ISkill) {
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