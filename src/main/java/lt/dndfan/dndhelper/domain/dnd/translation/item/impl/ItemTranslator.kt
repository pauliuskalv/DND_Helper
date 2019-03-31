package lt.dndfan.dndhelper.domain.dnd.translation.item.impl

import lt.dndfan.dndhelper.bean.dnd.inventory.item.IItem
import lt.dndfan.dndhelper.domain.dnd.translation.item.IItemTranslator

/**
 * Use strings from json to return item
 * Return different item class based on given arguments
*/

class ItemTranslator : IItemTranslator {

    /** Not sure if Translators should be private */
    private val genericItemTranslator = GenericItemTranslator()
    private val equipableItemTranslator = EquipableItemTranslator()
    private val weaponTranslator = WeaponTranslator()
    private val throwableWeaponTranslator = ThrowableWeaponTranslator()

    override fun translate(args: Map<String, Any>): IItem {
        if(args["equipment_category"] == "Armor")
        {
            return equipableItemTranslator.translate(args)
        }
        else if(args["equipment_category"] == "Weapon" && !args.containsKey("ThrowRange"))
        {
            return weaponTranslator.translate(args)
        }
        else if(args["equipment_category"] == "Weapon" && args.containsKey("ThrowRange"))
        {
            return throwableWeaponTranslator.translate(args)
        }
        else
        {
            return genericItemTranslator.translate(args)
        }
    }
}