package lt.dndfan.dndhelper.bean.dnd

import lt.dndfan.dndhelper.bean.dnd.constant.ESkill
import lt.dndfan.dndhelper.bean.dnd.constant.EStat
import lt.dndfan.dndhelper.bean.dnd.feature.IFeature
import lt.dndfan.dndhelper.bean.dnd.inventory.ICharacterInventory
import lt.dndfan.dndhelper.bean.dnd.inventory.item.impl.EquipableItem

interface IPlayableCharacter : ICharacter {
    val savingThrowProficiencies : List<EStat>
    val skillProficiencies : List<ESkill>
    val itemProficiencies : List<String>
    val features : List<IFeature>
    val spellModifier : EStat

    val characterClass : String
    val characterSubclass : String

    val race : String
    val subrace : String

    val personalityTraits : List<String>
    val ideals : List<String>
    val bonds : List<String>
    val flaws : List<String>

    val characterInventory : ICharacterInventory
    val characterEquipment : List<EquipableItem>

    /**
     *
     */

    fun addPersonalityTrait(trait : String)
    fun removePersonalityTrait(trait : String)
    fun addIdeal(ideal : String)
    fun removeIdeal(ideal : String)
    fun addBond(bond : String)
    fun removeBond(bond : String)
    fun addFlaw(flaw : String)
    fun removeFlaw(flaw : String)

    fun addSavingThrowProficiency(prof : EStat)
    fun removeSavingThrowProficiency(prof : EStat)

    fun addSkillProficiency(skill : ESkill)
    fun removeSkillProficiency(skill : ESkill)

    fun addItemProficiency(prof : String)
    fun removeItemProficiency(prof : String)

    fun addFeature(feature : IFeature)
    fun removeFeature(feature : IFeature)

    fun getInventory() : ICharacterInventory

    fun equipItem(item : EquipableItem)
    fun unequipItem(item : EquipableItem)

    fun isBonusesApplied() : Boolean
    fun applyBonuses()
    fun removeBonuses()

    fun shortRest()
    fun longRest()
    /**
     * TODO: Inspiration
     */
}
