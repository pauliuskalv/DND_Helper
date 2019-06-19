package lt.dndfan.dndhelper.bean.dnd.inventory.item

import lt.dndfan.dndhelper.bean.dnd.constant.EItemType

interface IItem {
    var count : Int

    val name : String
    val description : String
    val weight : Double
    val magical : Boolean
    /** Value in copper */
    val value : Int
    val type : EItemType
}