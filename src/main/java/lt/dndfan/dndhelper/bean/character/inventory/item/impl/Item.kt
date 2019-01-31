package lt.dndfan.dndhelper.bean.character.inventory.item.impl

import lt.dndfan.dndhelper.bean.character.inventory.item.IItem

class Item(override var count: Int,
           override val name: String,
           override val description: String,
           override val weight: Double) : IItem {

    companion object {
        val EMPTY : Item
            get() = Item(0,"","",0.0)
    }
}