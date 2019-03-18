package lt.dndfan.dndhelper.bean.dnd.inventory

import lt.dndfan.dndhelper.bean.dnd.inventory.item.IItem

interface ICharacterInventory : Iterable<IItem> {
    fun getItem(item : String) : IItem

    fun addItem(item : IItem)
    fun removeItem(item : IItem)

    fun getWeight() : Double
}