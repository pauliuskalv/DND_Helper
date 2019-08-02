package lt.dndfan.dndhelper.domain.dnd.translation.item.impl

import lt.dndfan.dndhelper.bean.dnd.constant.EItemType
import lt.dndfan.dndhelper.bean.dnd.inventory.item.IItem
import lt.dndfan.dndhelper.bean.dnd.inventory.item.impl.ItemFactory
import lt.dndfan.dndhelper.domain.dnd.translation.item.IItemTranslator


class GenericItemTranslator : IItemTranslator {
    private val itemFactory = ItemFactory()

    override fun translate(args: Map<String, Any>): IItem {
        return itemFactory.createItem(args["name"] as String,
                (args["desc"] as Array<String>).joinToString("\n"),
                args["weight"] as Double,
                false,
                /** TODO: Add Value and Item fields to item json. */
                // args["value"] as Int,
                0,
                //args["type"] as EItemType
                EItemType.ADVENTURING_GEAR)
    }
}