package lt.dndfan.dndhelper.bean.dnd.inventory.item.impl

import lt.dndfan.dndhelper.bean.dnd.constant.EItemType
import lt.dndfan.dndhelper.bean.dnd.inventory.item.IItem

class Item(override var count: Int,
           override val name: String,
           override val description: String,
           override val magical: Boolean,
           override val weight: Double,
           override val value : Int,
           override val type: EItemType): IItem