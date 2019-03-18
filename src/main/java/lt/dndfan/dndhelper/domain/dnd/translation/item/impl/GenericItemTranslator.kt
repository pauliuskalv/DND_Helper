package lt.dndfan.dndhelper.domain.dnd.translation.item.impl

import lt.dndfan.dndhelper.bean.dnd.inventory.item.IItem
import lt.dndfan.dndhelper.bean.dnd.inventory.item.impl.ItemFactory
import lt.dndfan.dndhelper.domain.dnd.translation.item.IItemTranslator


class GenericItemTranslator : IItemTranslator {
    private val itemFactory = ItemFactory()

    override fun translate(args: Map<String, Any>): IItem {
        return itemFactory.createItem(args["name"] as String,
                (args["desc"] as Array<String>).toString(),         // hopefully to string method is good
                args["weight"] as Double,
                false)
    }
}