package lt.dndfan.dndhelper.bean.dnd.inventory.item

interface IWeapon : IEquipableItem {
    val weaponRange : String

    val damageDiceCount : Int
    val damageDiceValue : Int
    val damageType : String
}