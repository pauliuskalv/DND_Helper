package lt.dndfan.dndhelper.domain.dnd.translation.item

import lt.dndfan.dndhelper.bean.dnd.inventory.item.IItem

interface IItemTranslator {
    fun translate(args : Map<String, Any>) : IItem
}