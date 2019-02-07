package lt.dndfan.dndhelper.bean.character.inventory.item

import lt.dndfan.dndhelper.bean.character.bonus.IBonus
import lt.dndfan.dndhelper.bean.character.constant.EItemType
import lt.dndfan.dndhelper.bean.character.constant.EStat
import lt.dndfan.dndhelper.util.collection.IPair

interface IEquipableItem : IItem {
    val attunable : Boolean
    val bonusList : List<IBonus>
    val category : EItemType
    val plus : Int

    val requiredStats : List<IPair<EStat,Int>>

    /**
     * Value in copper
     */
    val value : Int

    val tags : List<String>
}