package lt.dndfan.dndhelper.domain.dnd.character.inventory.item.impl

import lt.dndfan.dndhelper.bean.dnd.constant.EItemType
import lt.dndfan.dndhelper.bean.dnd.inventory.item.IEquipableItem
import lt.dndfan.dndhelper.bean.dnd.inventory.item.IItem
import lt.dndfan.dndhelper.bean.dnd.inventory.item.IThrowableWeapon
import lt.dndfan.dndhelper.bean.dnd.inventory.item.IWeapon
import lt.dndfan.dndhelper.bean.dnd.inventory.item.impl.ItemFactory
import lt.dndfan.dndhelper.domain.dnd.character.inventory.item.IItemDomain

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
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createWeapon(args: Map<String, Any>): IWeapon {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createThrowableWeapon(args: Map<String, Any>): IThrowableWeapon {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}