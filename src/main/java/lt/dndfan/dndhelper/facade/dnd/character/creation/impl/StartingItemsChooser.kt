package lt.dndfan.dndhelper.facade.dnd.character.creation.impl

import lt.dndfan.dndhelper.bean.dnd.IPlayableCharacter
import lt.dndfan.dndhelper.bean.dnd.inventory.ICharacterInventory
import lt.dndfan.dndhelper.bean.dnd.inventory.item.IItem
import lt.dndfan.dndhelper.facade.dnd.character.creation.IDualTableChooser

/**
 * Facade for picking starting items for a new character.
 */
class StartingItemsChooser (override val choiceTable: ArrayList<Any>,
                            override val selectableObjects: Int,
                            val inventory: ICharacterInventory) : IDualTableChooser() {
    override val chosenTable = ArrayList<Any>()

    override fun applyChanges() {
        if(canApply()) {
            for(item in choiceTable as List<IItem>) {
                inventory.addItem(item)
            }
        }
    }
}