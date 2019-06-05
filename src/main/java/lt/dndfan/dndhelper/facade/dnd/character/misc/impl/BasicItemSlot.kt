package lt.dndfan.dndhelper.facade.dnd.character.misc.impl

import lt.dndfan.dndhelper.facade.dnd.character.misc.IItemSlot

class BasicItemSlot(
    override val slotName : String,
    override var free : Boolean,
    override var itemName : String
) : IItemSlot

{}