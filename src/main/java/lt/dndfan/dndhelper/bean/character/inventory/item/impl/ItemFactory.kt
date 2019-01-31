package lt.dndfan.dndhelper.bean.character.inventory.item.impl

import lt.dndfan.dndhelper.bean.character.bonus.IBonus
import lt.dndfan.dndhelper.bean.character.constant.EItemType
import lt.dndfan.dndhelper.bean.character.constant.EStat
import lt.dndfan.dndhelper.bean.character.inventory.item.*
import lt.dndfan.dndhelper.util.collection.IPair

class ItemFactory : IItemFactory {
    override fun createItem(name: String,
                            description: String,
                            weight: Double): IItem {
        return Item(
                1,
                name,
                description,
                weight)
    }

    override fun createEquipableItem(name: String,
                                     description: String,
                                     weight: Double,
                                     attunable: Boolean,
                                     bonusList: List<IBonus>,
                                     category: EItemType,
                                     requiredStats: List<IPair<EStat, Int>>,
                                     value: Int,
                                     tags: List<String>): IEquipableItem {
        return EquipableItem(
                attunable,
                bonusList,
                category,
                requiredStats,
                value,
                tags,
                1,
                name,
                description,
                weight
        )
    }

    override fun createWeapon(name: String,
                              description: String,
                              weight: Double,
                              attunable: Boolean,
                              bonusList: List<IBonus>,
                              category: EItemType,
                              requiredStats: List<IPair<EStat, Int>>,
                              value: Int,
                              tags: List<String>,
                              weaponRange: String,
                              damageDiceCount: Int,
                              damageDiceValue: Int,
                              damageType: String): IWeapon {
        return Weapon(
                weaponRange,
                damageDiceCount,
                damageDiceValue,
                damageType,
                attunable,
                bonusList,
                category,
                requiredStats,
                value,
                tags,
                1,
                name,
                description,
                weight
        )
    }

    override fun createThrowableWeapon(name: String,
                                       description: String,
                                       weight: Double,
                                       attunable: Boolean,
                                       bonusList: List<IBonus>,
                                       category: EItemType,
                                       requiredStats: List<IPair<EStat, Int>>,
                                       value: Int,
                                       tags: List<String>,
                                       weaponRange: String,
                                       damageDiceCount: Int,
                                       damageDiceValue: Int,
                                       damageType: String,
                                       throwRange: String,
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
                category,
                requiredStats,
                value,
                tags,
                1,
                name,
                description,
                weight
        )
    }
}