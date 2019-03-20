package lt.dndfan.dndhelper.bean.dnd.inventory.item.impl

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.constant.EItemType
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Stat
import lt.dndfan.dndhelper.bean.dnd.inventory.item.IEquipableItem
import lt.dndfan.dndhelper.util.collection.IPair

class EquipableItem(override val attunable: Boolean,
                    override val bonusList: List<IBonus>,
                    override val category: EItemType,
                    override val requiredStats: List<IPair<Stat, Int>>,
                    override val value: Int,
                    override val tags: List<String>,
                    override var count: Int,
                    override val name: String,
                    override val attributes: Map<String, Any>,
                    override val description: String,
                    override val magical: Boolean,
                    override val weight: Double) : IEquipableItem {
}