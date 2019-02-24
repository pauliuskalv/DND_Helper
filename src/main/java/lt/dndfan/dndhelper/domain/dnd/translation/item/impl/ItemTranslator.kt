package lt.dndfan.dndhelper.domain.dnd.translation.item.impl

import lt.dndfan.dndhelper.bean.character.inventory.item.IItem
import lt.dndfan.dndhelper.bean.character.inventory.item.impl.ItemFactory
import lt.dndfan.dndhelper.domain.dnd.translation.item.IItemTranslator

/*
Use strings from json to return item
Return different item class based on given arguments
*/

class ItemTranslator : IItemTranslator {
    override fun translate(args: Map<String, Any>): IItem {
        // TODO: Implement
        val itemFactory = ItemFactory()
        if(args.getValue("equipment_category") == "Armor")
        {
            return itemFactory.createEquipableItem(args.get("name").toString(),
                    args["description"].toString(),
                    args["weight"].toString().toDouble(),
                    false,                          // TODO: add attunable field to json

                    )
        }
        else if(args.getValue("equipment_category") == "Weapon" && !args.containsKey("ThrowRange"))
        {
            return itemFactory.createWeapon(//TODO)
        }
        else if(args.getValue("equipment_category") == "Weapon" && args.containsKey("ThrowRange"))
        {
            return itemFactory.createThrowableWeapon(//TODO)
        }
        else
        {
            return itemFactory.createItem(//TODO)
        }
    }
}