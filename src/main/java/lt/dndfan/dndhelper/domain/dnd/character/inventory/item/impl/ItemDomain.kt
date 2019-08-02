package lt.dndfan.dndhelper.domain.dnd.character.inventory.item.impl

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.constant.EItemType
import lt.dndfan.dndhelper.bean.dnd.inventory.item.IEquipableItem
import lt.dndfan.dndhelper.bean.dnd.inventory.item.IItem
import lt.dndfan.dndhelper.bean.dnd.inventory.item.IThrowableWeapon
import lt.dndfan.dndhelper.bean.dnd.inventory.item.IWeapon
import lt.dndfan.dndhelper.bean.dnd.inventory.item.impl.ItemFactory
import lt.dndfan.dndhelper.bean.dnd.stats.IStat
import lt.dndfan.dndhelper.domain.dnd.character.inventory.item.IItemDomain
import lt.dndfan.dndhelper.util.collection.IPair

class ItemDomain : IItemDomain {
    override fun createItem(args: Map<String, Any>): IItem {
        val itemFactory = ItemFactory()
        return itemFactory.createItem(
                args["name"] as String,
                args["description"] as String,
                args["weight"] as Double,
                args["magical"] as Boolean,
                args["value"] as Int,
                args["type"] as EItemType
        )
    }

    override fun createEquipableItem(args: Map<String, Any>): IEquipableItem {
        val itemFactory = ItemFactory()
        return itemFactory.createEquipableItem(
                args["name"] as String,
                args["description"] as String,
                args["weight"] as Double,
                args["magical"] as Boolean,
                args["bonusList"] as List<IBonus>,
                args["requiredStats"] as List<IPair<IStat, Int>>,
                args["value"] as Int,
                args["type"] as EItemType,
                args["magical"] as Boolean,
                args["attributes"] as Map<String, Any>,
                args["tags"] as List<String>
        )
    }

    override fun createWeapon(args: Map<String, Any>): IWeapon {
        val itemFactory = ItemFactory()
        return itemFactory.createWeapon(
                args["name"] as String,
                args["description"] as String,
                args["weight"] as Double,
                args["magical"] as Boolean,
                args["bonusList"] as List<IBonus>,
                args["requiredStats"] as List<IPair<IStat, Int>>,
                args["value"] as Int,
                args["tags"] as List<String>,
                args["weaponRange"] as String,
                args["damageDiceCount"] as Int,
                args["damageDiceValue"] as Int,
                args["magical"] as Boolean,
                args["attributes"] as Map<String, Any>,
                args["damageType"] as String
        )
    }

    override fun createThrowableWeapon(args: Map<String, Any>): IThrowableWeapon {
        val itemFactory = ItemFactory()
        return itemFactory.createThrowableWeapon(
                args["name"] as String,
                args["description"] as String,
                args["weight"] as Double,
                args["magical"] as Boolean,
                args["bonusList"] as List<IBonus>,
                args["requiredStats"] as List<IPair<IStat, Int>>,
                args["value"] as Int,
                args["tags"] as List<String>,
                args["weaponRange"] as String,
                args["damageDiceCount"] as Int,
                args["damageDiceValue"] as Int,
                args["damageType"] as String,
                args["throwRange"] as String,
                args["magical"] as Boolean,
                args["attributes"] as Map<String, Any>,
                args["throwRangeLong"] as String
        )
    }
}
