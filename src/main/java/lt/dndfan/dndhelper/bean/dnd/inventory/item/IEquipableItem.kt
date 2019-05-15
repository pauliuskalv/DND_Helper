package lt.dndfan.dndhelper.bean.dnd.inventory.item

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.constant.EItemType
import lt.dndfan.dndhelper.bean.dnd.stats.IStat
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Stat
import lt.dndfan.dndhelper.util.collection.IPair

interface IEquipableItem : IItem {
    val attunable : Boolean
    val bonusList : List<IBonus>
    val category : EItemType

    /** TODO: Change Pair List into Map. */
    val requiredStats : List<IPair<IStat,Int>>

    /** TODO: Remove this. Everything should be done with bonuses. */
    val attributes : Map<String, Any>

    /**
     * Value in copper
     */
    val value : Int

    val tags : List<String>
}