package lt.dndfan.dndhelper.bean.dnd.feature

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Stat
import lt.dndfan.dndhelper.util.collection.IPair

interface IFeatureFactory {
    fun create(name : String,
               description : String,
               requiredLevel : Int,
               bonusList : List<IBonus>,
               validStats : List<IPair<Stat, Int>>,
               validRace : String,
               validClass : String,
               validSubclass : String) : IFeature
}