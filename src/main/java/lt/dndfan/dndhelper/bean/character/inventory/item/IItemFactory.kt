package lt.dndfan.dndhelper.bean.character.inventory.item

import lt.dndfan.dndhelper.bean.character.bonus.IBonus
import lt.dndfan.dndhelper.bean.character.constant.EItemType
import lt.dndfan.dndhelper.bean.character.constant.EStat
import lt.dndfan.dndhelper.util.collection.IPair
import lt.dndfan.dndhelper.util.collection.impl.Pair

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
                            requiredStats : ArrayList<Pair<EStat, Int>>,
                            value : Int,
                            magical: Boolean,
                            attributes : Map<String, Any>,
                            tags : List<String>) : IEquipableItem

    fun createWeapon(name: String,
                     description : String,
                     weight : Double,
                     attunable : Boolean,
                     bonusList : List<IBonus>,
                     category : EItemType,
                     requiredStats : List<Pair<EStat, Int>>,
                     value : Int,
                     tags : List<String>,
                     weaponRange : String,
                     damageDiceCount : Int,
                     damageDiceValue : Int,
                     magical: Boolean,
                     attributes : Map<String, Any>,
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
                              magical: Boolean,
                              attributes : Map<String, Any>,
                              throwRangeLong : String) : IThrowableWeapon
}