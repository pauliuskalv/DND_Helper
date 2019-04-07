package lt.dndfan.dndhelper.domain.dnd.translation

import lt.dndfan.dndhelper.bean.dnd.inventory.item.IItem

interface ITranslator {
    fun createItem(args : Map<String, Any>) : IItem
}