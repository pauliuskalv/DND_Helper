package lt.dndfan.dndhelper.domain.dnd.translation.item.impl

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.bonus.impl.ArmorClassBonus
import lt.dndfan.dndhelper.bean.dnd.constant.EArmorType
import lt.dndfan.dndhelper.bean.dnd.constant.EItemType
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Stat
import lt.dndfan.dndhelper.bean.dnd.inventory.item.IItem
import lt.dndfan.dndhelper.bean.dnd.inventory.item.IItemFactory
import lt.dndfan.dndhelper.bean.dnd.stats.IStat
import lt.dndfan.dndhelper.domain.dnd.stat.IArmorClassCalculator
import lt.dndfan.dndhelper.domain.dnd.translation.item.IItemTranslator
import lt.dndfan.dndhelper.util.collection.IPair
import lt.dndfan.dndhelper.util.collection.impl.Pair
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component("EquipableItemTranslator")
class EquipableItemTranslator : IItemTranslator {
    /**
     *  ALL_STATS is a global stat list that is passed in to a map
     */
    @Autowired
    private lateinit var itemFactory : IItemFactory
    @Autowired
    private lateinit var armorClassCalculator : IArmorClassCalculator

    override fun translate(args: Map<String, Any>): IItem {
        val bonusList: ArrayList<IBonus> = ArrayList()
        val requiredStats: ArrayList<IPair<IStat, Int>> = ArrayList()
        /** Consider making a more elegant solution than MutableMap. */
        val attributes: MutableMap<String, Any> = mutableMapOf()
        val tags: ArrayList<String> = ArrayList()

        for(stat in args["ALL_STATS"] as List<Stat>) {
            if(stat.name == "STR") {
                requiredStats.add(Pair(stat, args["str.minimum"] as Int))
                break
            }
        }

        attributes["Stealth disadvantage"] = args["stealth_disadvantage"] as String

        bonusList.add(ArmorClassBonus("Armor",
                "AC bonus from item",
                args["name"] as String,
                armorClassCalculator.calculateArmorClass(
                        (args["armor_class"] as Map<String, Any>)["base"] as Int,
                        args["armor_category"] as EArmorType,
                        0))
        )

        tags.add(args["equipment_category"] as String)
        tags.add(args["armor_category"] as String)

        return itemFactory.createEquipableItem(args["name"] as String,
                (args["desc"] as Array<String>).joinToString("\n"),
                args["weight"] as Double,
                /** TODO: Add a Atunable field to item json. */
                false,
                bonusList,
                requiredStats,
                (args["cost"] as Map<String, Any>)["quantity"] as Int,
                args["equipment_category"] as EItemType,
                /** TODO: Add a Magic field to item json. */
                false,
                attributes,
                tags
        )
    }
}