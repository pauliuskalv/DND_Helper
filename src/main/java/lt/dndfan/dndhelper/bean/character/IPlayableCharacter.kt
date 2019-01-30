package lt.dndfan.dndhelper.bean.character

import lt.dndfan.dndhelper.bean.character.constant.ESkill
import lt.dndfan.dndhelper.bean.character.constant.EStat
import lt.dndfan.dndhelper.bean.character.feature.IFeature
import lt.dndfan.dndhelper.bean.character.inventory.ICharacterInventory

interface IPlayableCharacter : ICharacter {
    var temporaryHitPoints : Int
    var maxHitPoints : Int
    var currentHitPoints : Int

    val savingThrowsProficiencies : List<EStat>
    val skillProficiencies : List<ESkill>
    val itemProficiencies : List<String>
    val features : List<IFeature>

    val characterClass : String
    val characterSubclass : String

    /**
     *
     */

    fun addSavingThrowProficiency(prof : EStat)
    fun removeSavingThrowProficiency(prof : EStat)

    fun addSkillProficiency(skill : ESkill)
    fun removeSkillProficiency(skill : ESkill)

    fun addItemProficiency(prof : String)
    fun removeItemProficiency(prof : String)

    fun addFeature(feature : IFeature)
    fun removeFeature(feature : IFeature)

    fun getInventory() : ICharacterInventory

    fun isBonusesApplied() : Boolean
    fun applyBonuses()
    fun removeBonuses()

    fun shortRest()
    fun longRest()
    /**
     * TODO: Inspiration
     */
}