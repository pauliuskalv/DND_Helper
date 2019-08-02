package lt.dndfan.dndhelper.domain.dnd.translation.item.impl

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.constant.EItemType
import lt.dndfan.dndhelper.bean.dnd.stats.IStat
import lt.dndfan.dndhelper.bean.dnd.inventory.item.IItem
import lt.dndfan.dndhelper.bean.dnd.inventory.item.impl.ItemFactory
import lt.dndfan.dndhelper.domain.dnd.translation.item.IItemTranslator
import lt.dndfan.dndhelper.util.collection.impl.Pair

class WeaponTranslator : IItemTranslator {
    private val itemFactory = ItemFactory()

    val bonusList: ArrayList<IBonus> = ArrayList()
    val minimumStatList: ArrayList<Pair<IStat, Int>> = ArrayList()
    /** Consider not using MutableMap. */
    val attributes: MutableMap<String, Any> = mutableMapOf()
    val tags: ArrayList<String> = ArrayList()

    override fun translate(args: Map<String, Any>): IItem {

        tags.add(args["equipment_category"] as String)
        tags.add(args["weapon_category"] as String)

        for (attribute in (args["properties"] as Array<Map<String, Any>>)) {
            tags.add(attribute["name"] as String)
            attributes.putAll(attribute)
        }

        return itemFactory.createWeapon(
                args["name"] as String,
                (args["desc"] as Array<String>).joinToString("\n"),
                args["weight"] as Double,
                false,
                bonusList,
                minimumStatList,
                (args["cost"] as Map<String, Any>)["quantity"] as Int,
                tags,
                args["weapon_range"] as String,
                (args["damage"] as Map<String, Any>)["dice_count"] as Int,
                (args["damage"] as Map<String, Any>)["dice_value"] as Int,
                false,
                attributes,
                ((args["damage"] as Map<String, Any>)["damage_type"] as Map<String, Any>)["name"] as String
        )
    }
}