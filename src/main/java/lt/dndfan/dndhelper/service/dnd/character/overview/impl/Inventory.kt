package lt.dndfan.dndhelper.service.dnd.character.overview.impl

import lt.dndfan.dndhelper.bean.dnd.inventory.item.IItem
import lt.dndfan.dndhelper.service.dnd.character.overview.ISingleListFacade

/**
 * The playable character`s inventory display in the character overview.
 * Probably should contain item list with their quantity
 */

class Inventory (
        /** Not quite sure if IItem list is needed, itemNames might be enough */
    val itemList : List<IItem>,
        /**
     * Value pair of item category and an item name list of items in that category
     * Maybe categorisedItemNames should have it`s own separate facade?
     */
    val categorisedItemNames : Map<String, List<String>>,
        /** Basic item name list */
    override val list : List<String>,
        /**
     * Not sure if this is a good way to do item count
     * This should be name and count value pair
     */
    val itemCount : Map<String, Int>,
    override val title: String
) : ISingleListFacade
{}