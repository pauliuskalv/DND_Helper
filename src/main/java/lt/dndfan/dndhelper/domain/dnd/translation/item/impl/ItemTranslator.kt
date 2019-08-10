package lt.dndfan.dndhelper.domain.dnd.translation.item.impl

import lt.dndfan.dndhelper.bean.dnd.inventory.item.IItem
import lt.dndfan.dndhelper.domain.dnd.translation.item.IItemTranslator
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

/**
 * Use strings from json to return item
 * Return different item class based on given arguments
*/
@Component
class ItemTranslator : IItemTranslator {
    /** Not sure if Translators should be private */
    @Autowired
    @Qualifier("GenericItemTranslator")
    private lateinit var genericItemTranslator : IItemTranslator

    @Autowired
    @Qualifier("EquipableItemTranslator")
    private lateinit var equipableItemTranslator : IItemTranslator

    @Autowired
    @Qualifier("WeaponTranslator")
    private lateinit var weaponTranslator : IItemTranslator

    @Autowired
    @Qualifier("ThrowableWeaponTranslator")
    private lateinit var throwableWeaponTranslator : IItemTranslator

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