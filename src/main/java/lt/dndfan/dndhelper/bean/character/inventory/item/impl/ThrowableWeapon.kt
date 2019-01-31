package lt.dndfan.dndhelper.bean.character.inventory.item.impl

import lt.dndfan.dndhelper.bean.character.bonus.IBonus
import lt.dndfan.dndhelper.bean.character.constant.EItemType
import lt.dndfan.dndhelper.bean.character.constant.EStat
import lt.dndfan.dndhelper.bean.character.inventory.item.IThrowableWeapon
import lt.dndfan.dndhelper.util.collection.IPair

class ThrowableWeapon(override val throwRange: String,
                      override val throwRangeLong: String,
                      override val weaponRange: String,
                      override val damageDiceCount: Int,
                      override val damageDiceValue: Int,
                      override val damageType: String,
                      override val attunable: Boolean,
                      override val bonusList: List<IBonus>,
                      override val category: EItemType,
                      override val requiredStats: List<IPair<EStat, Int>>,
                      override val value: Int,
                      override val tags: List<String>,
                      override var count: Int,
                      override val name: String,
                      override val description: String,
                      override val weight: Double) : IThrowableWeapon