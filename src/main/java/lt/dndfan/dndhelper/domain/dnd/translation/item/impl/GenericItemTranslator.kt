package lt.dndfan.dndhelper.domain.dnd.translation.item.impl

import lt.dndfan.dndhelper.bean.dnd.constant.EItemType
import lt.dndfan.dndhelper.bean.dnd.inventory.item.IItem
import lt.dndfan.dndhelper.bean.dnd.inventory.item.IItemFactory
import lt.dndfan.dndhelper.bean.dnd.inventory.item.impl.ItemFactory
import lt.dndfan.dndhelper.domain.dnd.translation.item.IItemTranslator
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component


@Component("GenericItemTranslator")
class GenericItemTranslator : IItemTranslator {
    @Autowired
    private lateinit var itemFactory : IItemFactory

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