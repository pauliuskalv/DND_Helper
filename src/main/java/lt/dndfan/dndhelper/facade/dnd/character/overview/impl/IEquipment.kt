package lt.dndfan.dndhelper.facade.dnd.character.overview.impl

import lt.dndfan.dndhelper.facade.dnd.character.misc.IItemSlot

/**
 * Should provide list of equipped items with their respective categories.
 */

interface IEquipment {
    val slots : List<IItemSlot>
}