package lt.dndfan.dndhelper.domain.dnd.translation.item.impl

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.bonus.impl.ArmorClassBonus
import lt.dndfan.dndhelper.bean.dnd.constant.EArmorType
import lt.dndfan.dndhelper.bean.dnd.constant.EItemType
import lt.dndfan.dndhelper.bean.dnd.constant.EStat
import lt.dndfan.dndhelper.bean.dnd.inventory.item.IItem
import lt.dndfan.dndhelper.bean.dnd.inventory.item.impl.ItemFactory
import lt.dndfan.dndhelper.domain.dnd.stat.impl.ArmorClassCalculator
import lt.dndfan.dndhelper.domain.dnd.translation.item.IItemTranslator
import lt.dndfan.dndhelper.util.collection.impl.Pair

class EquipableItemTranslator : IItemTranslator {
    private val itemFactory = ItemFactory()
    private val armorClassCalculator = ArmorClassCalculator()

    val bonusList: ArrayList<IBonus> = ArrayList()
    val minimumStatList: ArrayList<Pair<EStat, Int>> = ArrayList()
    val attributes: MutableMap<String, Any> = mutableMapOf()
    val tags: ArrayList<String> = ArrayList()

    override fun translate(args: Map<String, Any>): IItem {

        attributes["Stealth disadvantage"] = args["stealth_disadvantage"] as String

        bonusList.add(ArmorClassBonus("Armor",
                "AC bonus from item",
                args["name"] as String,
                armorClassCalculator.calculateArmorClass(
                        (args["armor_class"] as Map<String, Any>)["base"] as Int,
                        args["armor_category"] as EArmorType,
                        0))
        )
        minimumStatList.add(Pair(EStat.STRENGTH, args["str.minimum"] as Int))
        tags.add(args["equipment_category"] as String)
        tags.add(args["armor_category"] as String)

        return itemFactory.createEquipableItem(args["name"] as String,
                (args["desc"] as Array<String>).toString(),
                args["weight"] as Double,
                false,
                bonusList,
                args["equipment_category"] as EItemType,
                minimumStatList,
                (args["cost"] as Map<String, Any>)["quantity"] as Int,
                false,
                attributes,
                tags
        )
    }
}