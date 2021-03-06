package lt.dndfan.dndhelper.bean.dnd.inventory.item.impl

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.constant.EItemType
import lt.dndfan.dndhelper.bean.dnd.inventory.item.IThrowableWeapon
import lt.dndfan.dndhelper.bean.dnd.stats.IStat
import lt.dndfan.dndhelper.util.collection.IPair

class ThrowableWeapon(override val throwRange: String,
                      override val throwRangeLong: String,
                      override val weaponRange: String,
                      override val damageDiceCount: Int,
                      override val damageDiceValue: Int,
                      override val damageType: String,
                      override val attunable: Boolean,
                      override val bonusList: List<IBonus>,
                      override val requiredStats: List<IPair<IStat, Int>>,
                      override val value: Int,
                      override val tags: List<String>,
                      override var count: Int,
                      override val attributes: Map<String, Any>,
                      override val name: String,
                      override val description: String,
                      override val magical: Boolean,
                      override val weight: Double) : IThrowableWeapon
{
    override val type = EItemType.WEAPON
}