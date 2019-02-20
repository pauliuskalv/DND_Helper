package lt.dndfan.dndhelper.domain.dnd.character.inventory.item

import lt.dndfan.dndhelper.bean.character.inventory.item.IEquipableItem
import lt.dndfan.dndhelper.bean.character.inventory.item.IItem
import lt.dndfan.dndhelper.bean.character.inventory.item.IThrowableWeapon
import lt.dndfan.dndhelper.bean.character.inventory.item.IWeapon

interface IItemDomain {
    fun createItem(args : Map<String, Any>) : IItem
    fun createEquipableItem(args : Map<String, Any>) : IEquipableItem
    fun createWeapon(args : Map<String, Any>) : IWeapon
    fun createThrowableWeapon(args : Map<String, Any>) : IThrowableWeapon
}