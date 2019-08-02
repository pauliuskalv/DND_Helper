package lt.dndfan.dndhelper.domain.dnd.character.inventory.impl

import lt.dndfan.dndhelper.bean.dnd.constant.EItemType
import lt.dndfan.dndhelper.bean.dnd.inventory.ICharacterInventory
import lt.dndfan.dndhelper.bean.dnd.inventory.item.IItem
import lt.dndfan.dndhelper.domain.dnd.character.inventory.IInventoryDomain
import java.io.UncheckedIOException
import java.lang.Exception

class InventoryDomain : IInventoryDomain {
    override fun getItem(inventory: ICharacterInventory, name: String): IItem {
        return inventory.getItem(name)
    }

    override fun getItems(inventory: ICharacterInventory): List<IItem> {
        return inventory.getAllItems()
    }

    override fun getUnequippedItems(inventory: ICharacterInventory, equippedItems : List<IItem>): List<IItem> {
        val matchedList = ArrayList<IItem>(inventory.getAllItems())
        for (equippedItem in equippedItems) {
            if(matchedList.contains(equippedItem)){
                matchedList.remove(equippedItem)
            }
        }
        return matchedList
    }

    override fun getItemsByName(inventory: ICharacterInventory, name: String): List<IItem> {
        val matchedList = ArrayList<IItem>()
        for( item in inventory.getAllItems()) {
            if(item.name.contains("""*$name*""") ||
                    item.name.toLowerCase().contains("""*$name*""")) {
                matchedList.add(item)
            }
        }
        return matchedList
    }

    override fun getItemsByValue(inventory: ICharacterInventory, value: Int): List<IItem> {
        val matchedList = ArrayList<IItem>()
        for(item in inventory.getAllItems()) {
            if(item.value == value) {
                matchedList.add(item)
            }
        }
        return matchedList
    }

    override fun getItemsByType(inventory: ICharacterInventory, type: EItemType): List<IItem> {
        val matchedList = ArrayList<IItem>()
        for(item in inventory.getAllItems()) {
            if(item.type == type) {
                matchedList.add(item)
            }
        }
        return matchedList
    }

    override fun getItemsByDescription(inventory: ICharacterInventory, desc: String): List<IItem> {
        val matchedList = ArrayList<IItem>()
        for(item in inventory.getAllItems()) {
            if(item.description.contains("""*$desc*""") ||
                    item.description.toLowerCase().contains("""*$desc*""")) {
                matchedList.add(item)
            }
        }
        return matchedList
    }

    override fun getItemsByTags(inventory: ICharacterInventory, vararg tags: String): List<IItem> {
        val matchedList = ArrayList<IItem>()
        /** No need for contains check since the matchedList is empty */
        try {
            matchedList.addAll(getItemsByType(inventory, tags.toString() as EItemType))
        }
        /** Not sure if this is ClassCastException or TypeCastException */
        catch(e : ClassCastException) {
            /** Do nothing, this is expected to happen quite a lot */
        }
        for(item in inventory.getAllItems()) {
            if(!matchedList.contains(item)) {
                /** Check for "Magical" tag */
                if (item.magical && tags.contains("Magical")) {
                    matchedList.add(item)
                }
                /**
                 * Check all item object fields and names for provided tags.
                 * Should probably filter out numbers out of tags.
                 */
                } else {
                for (string in tags) {
                    /** All object field names and values as string separated by space */
                    if(item.toString()
                                    .trim(',')
                                    .replace("="," ")
                                    .replace("(", " ")
                                    .replace(")", " ")
                                    .contains(string)) {
                        matchedList.add(item)
                    }
                }
            }
        }
        return matchedList
    }
}