package lt.dndfan.dndhelper.facade.dnd.character.misc

import lt.dndfan.dndhelper.bean.dnd.inventory.item.IEquipableItem

/**
 * TODO: Move item slots to bean.character package, since it is character property.
 * TODO: Update IPlayableCharacter to include item slots.
 * TODO: Make equip and other functions.
 */

interface IItemSlot {
    val slotName : String
    /** Technically free may not be needed if itemName when no item is equipped is "None" */
    var free : Boolean
    var itemName : String
}