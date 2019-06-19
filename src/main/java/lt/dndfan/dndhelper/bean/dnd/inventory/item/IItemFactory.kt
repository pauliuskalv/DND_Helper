package lt.dndfan.dndhelper.bean.dnd.inventory.item

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.constant.EItemType
import lt.dndfan.dndhelper.bean.dnd.stats.IStat
import lt.dndfan.dndhelper.util.collection.IPair

interface IItemFactory {
    fun createItem(name: String,
                   description : String,
                   weight : Double,
                   magical : Boolean,
                   value : Int,
                   type : EItemType): IItem

    fun createEquipableItem(name: String,
                            description : String,
                            weight : Double,
                            attunable : Boolean,
                            bonusList : List<IBonus>,
                            requiredStats : List<IPair<IStat, Int>>,
                            value : Int,
                            type : EItemType,
                            magical: Boolean,
                            attributes : Map<String, Any>,
                            tags : List<String>) : IEquipableItem

    fun createWeapon(name: String,
                     description : String,
                     weight : Double,
                     attunable : Boolean,
                     bonusList : List<IBonus>,
                     requiredStats : List<IPair<IStat, Int>>,
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
                              requiredStats : List<IPair<IStat, Int>>,
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