package lt.dndfan.dndhelper.bean.dnd.inventory.item.impl

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.constant.EItemType
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Stat
import lt.dndfan.dndhelper.bean.dnd.inventory.item.IWeapon
import lt.dndfan.dndhelper.util.collection.IPair

class Weapon(override val weaponRange: String,
             override val damageDiceCount: Int,
             override val damageDiceValue: Int,
             override val damageType: String,
             override val attunable: Boolean,
             override val bonusList: List<IBonus>,
             override val category: EItemType,
             override val requiredStats: List<IPair<Stat, Int>>,
             override val value: Int,
             override val tags: List<String>,
             override var count: Int,
             override val attributes: Map<String, Any>,
             override val name: String,
             override val description: String,
             override val magical: Boolean,
             override val weight: Double) : IWeapon