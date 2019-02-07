package lt.dndfan.dndhelper.bean.character.inventory.item

interface IItem {
    var count : Int

    val name : String
    val description : String
    val weight : Double
    val magical : Boolean
}