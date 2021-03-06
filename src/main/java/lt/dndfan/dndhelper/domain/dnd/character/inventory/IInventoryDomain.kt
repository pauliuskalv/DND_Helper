package lt.dndfan.dndhelper.domain.dnd.character.inventory

import lt.dndfan.dndhelper.bean.dnd.constant.EItemType
import lt.dndfan.dndhelper.bean.dnd.inventory.ICharacterInventory
import lt.dndfan.dndhelper.bean.dnd.inventory.item.IItem

interface IInventoryDomain {
    fun getItem(inventory : ICharacterInventory, name : String) : IItem

    /** Inventory */
    fun getItems(inventory : ICharacterInventory) : List<IItem>
    fun getUnequippedItems(inventory : ICharacterInventory, equippedItems : List<IItem>) : List<IItem>
    fun getItemsByName(inventory : ICharacterInventory, name : String) : List<IItem>
    /** Consider adding a differential field to allow for approximate value */
    fun getItemsByValue(inventory : ICharacterInventory, value : Int) : List<IItem>
    fun getItemsByType(inventory : ICharacterInventory, type : EItemType) : List<IItem>
    fun getItemsByDescription(inventory : ICharacterInventory, desc : String) : List<IItem>
    fun getItemsByTags(inventory : ICharacterInventory, vararg tags : String) : List<IItem>
}