package lt.dndfan.dndhelper.bean.character.inventory.item.impl

import lt.dndfan.dndhelper.bean.character.bonus.IBonus
import lt.dndfan.dndhelper.bean.character.constant.EItemType
import lt.dndfan.dndhelper.bean.character.constant.EStat
import lt.dndfan.dndhelper.bean.character.inventory.item.IEquipableItem
import lt.dndfan.dndhelper.util.collection.IPair

class EquipableItem(override val attunable: Boolean,
                    override val bonusList: List<IBonus>,
                    override val category: EItemType,
                    override val requiredStats: List<IPair<EStat, Int>>,
                    override val value: Int,
                    override val tags: List<String>,
                    override var count: Int,
                    override val name: String,
                    override val attributes: Map<String, Any>,
                    override val description: String,
                    override val magical: Boolean,
                    override val weight: Double) : IEquipableItem {
}