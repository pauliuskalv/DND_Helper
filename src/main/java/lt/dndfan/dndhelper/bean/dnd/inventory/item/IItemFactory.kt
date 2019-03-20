package lt.dndfan.dndhelper.bean.dnd.inventory.item

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.constant.EItemType
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Stat
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
                            requiredStats : ArrayList<Pair<Stat, Int>>,
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
                     requiredStats : List<Pair<Stat, Int>>,
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
                              requiredStats : List<IPair<Stat, Int>>,
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