package lt.dndfan.dndhelper.bean.character.inventory.item

import lt.dndfan.dndhelper.bean.character.bonus.IBonus
import lt.dndfan.dndhelper.bean.character.constant.EItemType
import lt.dndfan.dndhelper.bean.character.constant.EStat
import lt.dndfan.dndhelper.util.collection.IPair

interface IItemFactory {
    fun createItem(name: String,
                   description : String,
                   weight : Double,
                   magical : Boolean) : IItem

    fun createEquipableItem(name: String,
                            description : String,
                            weight : Double,
                            attunable : Boolean,
                            bonusList : List<IBonus>,
                            category : EItemType,
                            requiredStats : List<IPair<EStat, Int>>,
                            value : Int,
                            plus: Int,
                            magical: Boolean,
                            tags : List<String>) : IEquipableItem

    fun createWeapon(name: String,
                     description : String,
                     weight : Double,
                     attunable : Boolean,
                     bonusList : List<IBonus>,
                     category : EItemType,
                     requiredStats : List<IPair<EStat, Int>>,
                     value : Int,
                     tags : List<String>,
                     weaponRange : String,
                     damageDiceCount : Int,
                     damageDiceValue : Int,
                     plus: Int,
                     magical: Boolean,
                     damageType : String) : IWeapon

    fun createThrowableWeapon(name: String,
                              description : String,
                              weight : Double,
                              attunable : Boolean,
                              bonusList : List<IBonus>,
                              category : EItemType,
                              requiredStats : List<IPair<EStat, Int>>,
                              value : Int,
                              tags : List<String>,
                              weaponRange : String,
                              damageDiceCount : Int,
                              damageDiceValue : Int,
                              damageType : String,
                              throwRange : String,
                              plus: Int,
                              magical: Boolean,
                              throwRangeLong : String) : IThrowableWeapon
}