package lt.dndfan.dndhelper.domain.dnd.translation.item.impl

import lt.dndfan.dndhelper.bean.character.bonus.IBonus
import lt.dndfan.dndhelper.bean.character.bonus.impl.ArmorClassBonus
import lt.dndfan.dndhelper.bean.character.constant.EArmorType
import lt.dndfan.dndhelper.bean.character.inventory.item.IItem
import lt.dndfan.dndhelper.bean.character.inventory.item.impl.ItemFactory
import lt.dndfan.dndhelper.domain.dnd.stat.impl.ArmorClassCalculator
import lt.dndfan.dndhelper.domain.dnd.translation.item.IItemTranslator

/*
Use strings from json to return item
Return different item class based on given arguments
*/

class ItemTranslator : IItemTranslator {
    override fun translate(args: Map<String, Any>): IItem {
        // TODO: Implement
        val itemFactory = ItemFactory()
        val armorClassCalculator = ArmorClassCalculator()
        if(args.getValue("equipment_category") == "Armor")
        {
            val bonusList : ArrayList<IBonus> = ArrayList()

            bonusList.add(ArmorClassBonus("Armor",
                    "AC bonus from item",
                    args["name"].toString(),
                    armorClassCalculator.calculateArmorClass(
                            args["armor_class"].to(Map<String, Any>).get("base"),
                            args["armor_category"].to(EArmorType)))      // should return a map
            )

            return itemFactory.createEquipableItem(args["name"].toString(),
                    args["description"].toString(),
                    args["weight"].toString().toDouble(),
                    false,                          // TODO: add attunable field to json
                    bonusList,

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