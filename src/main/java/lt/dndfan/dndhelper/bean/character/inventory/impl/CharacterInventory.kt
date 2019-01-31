package lt.dndfan.dndhelper.bean.character.inventory.impl

import lt.dndfan.dndhelper.bean.character.inventory.ICharacterInventory
import lt.dndfan.dndhelper.bean.character.inventory.item.IItem
import lt.dndfan.dndhelper.bean.character.inventory.item.impl.Item

class CharacterInventory : ICharacterInventory {
    private val itemList : HashMap<String, IItem> = HashMap()

    override fun getItem(item: String): IItem = when(itemList.containsKey(item)) {
        true -> itemList[item]!!
        else -> Item.EMPTY
    }

    override fun addItem(item: IItem) = when(itemList.containsKey(item.name)) {
        true -> itemList[item.name]!!.count += item.count
        else -> itemList[item.name] = item
    }

    override fun removeItem(item: IItem) {
        if (!itemList.containsKey(item.name))
            return

        when (itemList[item.name]!!.count <= item.count) {
            true -> itemList.remove(item.name)
            else -> itemList[item.name]!!.count = item.count
        }
    }

    override fun getWeight(): Double {
        var sum : Double = 0.0

        for (item in this)
            sum += item.weight

        return sum
    }

    override fun iterator(): Iterator<IItem> {
        return itemList.values.iterator()
    }
}