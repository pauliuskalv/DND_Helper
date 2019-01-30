package lt.dndfan.dndhelper.bean.character

import lt.dndfan.dndhelper.bean.character.inventory.ICharacterInventory

interface IPlayableCharacter : ICharacter {
    var temporaryHitPoints : Int
    var maxHitPoints : Int
    var currentHitPoints : Int

    val characterClass : String
    val characterSubclass : String

    fun getInventory() : ICharacterInventory

    fun isSpellcaster() : Boolean

    fun isBonusesApplied() : Boolean
    fun applyBonuses()
    fun removeBonuses()
}