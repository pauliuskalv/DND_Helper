package lt.dndfan.dndhelper.bean.character.inventory.item

interface IWeapon : IEquipableItem {
    val weaponRange : String

    val damageDiceCount : Int
    val damageDiceValue : Int
    val damageType : String
}