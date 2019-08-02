package lt.dndfan.dndhelper.bean.dnd.inventory.item.impl

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.constant.EItemType
import lt.dndfan.dndhelper.bean.dnd.inventory.item.*
import lt.dndfan.dndhelper.bean.dnd.stats.IStat
import lt.dndfan.dndhelper.util.collection.IPair

class ItemFactory : IItemFactory {
    override fun createItem(name: String,
                            description: String,
                            weight: Double,
                            magical: Boolean,
                            value: Int,
                            type : EItemType): IItem {
        return Item(
                1,
                name,
                description,
                magical,
                weight,
                value,
                type
                )
    }

    override fun createEquipableItem(name: String,
                                     description: String,
                                     weight: Double,
                                     attunable: Boolean,
                                     bonusList: List<IBonus>,
                                     requiredStats: List<IPair<IStat, Int>>,
                                     value: Int,
                                     type : EItemType,
                                     magical: Boolean,
                                     attributes: Map<String, Any>,
                                     tags: List<String>): EquipableItem {
        return EquipableItem(
                attunable,
                bonusList,
                requiredStats,
                value,
                type,
                tags,
                1,
                name,
                attributes,
                description,
                magical,
                weight
        )
    }

    override fun createWeapon(name: String,
                              description: String,
                              weight: Double,
                              attunable: Boolean,
                              bonusList: List<IBonus>,
                              requiredStats: List<IPair<IStat, Int>>,
                              value: Int,
                              tags: List<String>,
                              weaponRange: String,
                              damageDiceCount: Int,
                              damageDiceValue: Int,
                              magical: Boolean,
                              attributes: Map<String, Any>,
                              damageType: String): IWeapon {
        return Weapon(
                weaponRange,
                damageDiceCount,
                damageDiceValue,
                damageType,
                attunable,
                bonusList,
                requiredStats,
                value,
                tags,
                1,
                attributes,
                name,
                description,
                magical,
                weight

        )
    }

    override fun createThrowableWeapon(name: String,
                                       description: String,
                                       weight: Double,
                                       attunable: Boolean,
                                       bonusList: List<IBonus>,
                                       requiredStats: List<IPair<IStat, Int>>,
                                       value: Int,
                                       tags: List<String>,
                                       weaponRange: String,
                                       damageDiceCount: Int,
                                       damageDiceValue: Int,
                                       damageType: String,
                                       throwRange: String,
                                       magical: Boolean,
                                       attributes: Map<String, Any>,
                                       throwRangeLong: String): IThrowableWeapon {
        return ThrowableWeapon(
                throwRange,
                throwRangeLong,
                weaponRange,
                damageDiceCount,
                damageDiceValue,
                damageType,
                attunable,
                bonusList,
                requiredStats,
                value,
                tags,
                1,
                attributes,
                name,
                description,
                magical,
                weight
        )
    }
}