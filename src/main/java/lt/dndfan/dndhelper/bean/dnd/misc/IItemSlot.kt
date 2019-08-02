package lt.dndfan.dndhelper.bean.dnd.misc

/**
 * TODO: Update IPlayableCharacter to contain IItemSlot fields.
 * TODO: Make equip and possibly other functions.
 */

interface IItemSlot {
    val slotName : String
    /** Technically free may not be needed if itemName when no item is equipped is "None" */
    var free : Boolean
    var itemName : String
}