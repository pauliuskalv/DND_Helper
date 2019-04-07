package lt.dndfan.dndhelper.bean.dnd.inventory.item

interface IItem {
    var count : Int

    val name : String
    val description : String
    val weight : Double
    val magical : Boolean
}