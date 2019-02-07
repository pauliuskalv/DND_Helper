package lt.dndfan.dndhelper.bean.character.inventory.item.impl

import lt.dndfan.dndhelper.bean.character.bonus.IBonus
import lt.dndfan.dndhelper.bean.character.constant.EItemType
import lt.dndfan.dndhelper.bean.character.constant.EStat
import lt.dndfan.dndhelper.bean.character.inventory.item.*
import lt.dndfan.dndhelper.util.collection.IPair

class ItemFactory : IItemFactory {
    override fun createItem(name: String,
                            description: String,
                            weight: Double,
                            magical: Boolean): IItem {
        return Item(
                1,
                name,
                description,
                magical,
                weight
                )
    }

    override fun createEquipableItem(name: String,
                                     description: String,
                                     weight: Double,
                                     attunable: Boolean,
                                     bonusList: List<IBonus>,
                                     category: EItemType,
                                     requiredStats: List<IPair<EStat, Int>>,
                                     value: Int,
                                     plus: Int,
                                     magical: Boolean,
                                     tags: List<String>): IEquipableItem {
        return EquipableItem(

                attunable,
                bonusList,
                category,
                requiredStats,
                plus,
                value,
                tags,
                1,
                name,
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
                              category: EItemType,
                              requiredStats: List<IPair<EStat, Int>>,
                              value: Int,
                              tags: List<String>,
                              weaponRange: String,
                              damageDiceCount: Int,
                              damageDiceValue: Int,
                              plus: Int,
                              magical: Boolean,
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
                plus,
                magical,
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
                                       plus: Int,
                                       magical: Boolean,
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
                plus,
                magical,
                weight
        )
    }
}