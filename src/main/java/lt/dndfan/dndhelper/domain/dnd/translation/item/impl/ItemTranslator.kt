package lt.dndfan.dndhelper.domain.dnd.translation.item.impl

import lt.dndfan.dndhelper.bean.character.bonus.IBonus
import lt.dndfan.dndhelper.bean.character.bonus.impl.ArmorClassBonus
import lt.dndfan.dndhelper.bean.character.constant.EArmorType
import lt.dndfan.dndhelper.bean.character.constant.EItemType
import lt.dndfan.dndhelper.bean.character.constant.EStat
import lt.dndfan.dndhelper.bean.character.inventory.item.IItem
import lt.dndfan.dndhelper.bean.character.inventory.item.impl.ItemFactory
import lt.dndfan.dndhelper.domain.dnd.stat.impl.ArmorClassCalculator
import lt.dndfan.dndhelper.domain.dnd.translation.item.IItemTranslator
import lt.dndfan.dndhelper.util.collection.impl.Pair

/*
Use strings from json to return item
Return different item class based on given arguments
*/

class ItemTranslator : IItemTranslator {
    override fun translate(args: Map<String, Any>): IItem {
        val itemFactory = ItemFactory()
        val armorClassCalculator = ArmorClassCalculator()

        if(args.getValue("equipment_category") == "Armor")
        {
            val bonusList : ArrayList<IBonus> = ArrayList()
            val minimumStatList : ArrayList<Pair<EStat,Int>> = ArrayList()
            val attributes : Map<String,Any> = mapOf("stealth_disadvantage" to true)
            val tags : ArrayList<String> = ArrayList()

            bonusList.add(ArmorClassBonus("Armor",
                    "AC bonus from item",
                    args["name"].toString(),
                    armorClassCalculator.calculateArmorClass(
                            args["armor_class"] as Int,
                            args["armor_category"] as EArmorType,
                            0))                                 // TODO:How to calculate item ac
            )
            minimumStatList.add(Pair(EStat.STRENGTH,args["str.minimum"] as Int))
            tags.add(args["equipment_category"] as String)
            tags.add(args["armor_category"] as String)

            return itemFactory.createEquipableItem(args["name"].toString(),
                    args["description"].toString(),
                    args["weight"].toString().toDouble(),
                    false,
                    bonusList,
                    args["equipment_category"] as EItemType,
                    minimumStatList,
                    args["cost"] as Int,
                    false,
                    attributes,
                    tags
                    )
        }
        else if(args.getValue("equipment_category") == "Weapon" && !args.containsKey("ThrowRange"))
        {
            val bonusList : ArrayList<IBonus> = ArrayList()
            val minimumStatList : ArrayList<Pair<EStat,Int>> = ArrayList()
            val attributes : Map<String,Any> = mapOf()
            val tags : ArrayList<String> = ArrayList()

            tags.add(args["equipment_category"] as String)
            tags.add(args["weapon_category"] as String)
            tags.add("Not throwable")
            tags.add(args["properties"] as String)

            return itemFactory.createWeapon(args["name"].toString(),
                    args["description"] as String,
                    args["weight"] as Double,
                    false,
                    bonusList,
                    args["equipment_category"] as EItemType,
                    minimumStatList,
                    args["cost"] as Int,
                    tags,
                    args["weapon_range"] as String,
                    args["dice_count"] as Int,
                    args["dice_value"] as Int,
                    false,
                    attributes,
                    args["damage_type"] as String
            )
        }

        else if(args.getValue("equipment_category") == "Weapon" && args.containsKey("ThrowRange"))
        {
            val bonusList : ArrayList<IBonus> = ArrayList()
            val minimumStatList : ArrayList<Pair<EStat,Int>> = ArrayList()
            val attributes : Map<String,Any> = mapOf()
            val tags : ArrayList<String> = ArrayList()

            tags.add(args["equipment_category"] as String)
            tags.add(args["weapon_category"] as String)
            tags.add("Not throwable")
            tags.add(args["properties"] as String)

            return itemFactory.createThrowableWeapon(args["name"].toString(),
                    args["description"] as String,
                    args["weight"] as Double,
                    false,
                    bonusList,
                    args["equipment_category"] as EItemType,
                    minimumStatList,
                    args["cost"] as Int,
                    tags,
                    args["weapon_range"] as String,
                    args["dice_count"] as Int,
                    args["dice_value"] as Int,
                    args["damage_type"] as String,
                    (args["throw_range"] as Map<String,String>)["normal"] as String,
                    false,
                    attributes,
                    (args["throw_range"] as Map<String,String>)["long"] as String
            )
        }
        else
        {
            return itemFactory.createItem(args["name"] as String,
                    args["description"] as String,
                    args["weight"] as Double,
                    false
                    )
        }

    }
}