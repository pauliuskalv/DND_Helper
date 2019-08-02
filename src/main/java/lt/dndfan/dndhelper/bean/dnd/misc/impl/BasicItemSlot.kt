package lt.dndfan.dndhelper.bean.dnd.misc.impl

import lt.dndfan.dndhelper.bean.dnd.misc.IItemSlot

class BasicItemSlot(
    override val slotName : String,
    override var free : Boolean,
    override var itemName : String
) : IItemSlot
{}