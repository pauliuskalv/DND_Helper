package lt.dndfan.dndhelper.bean.character.feature

import lt.dndfan.dndhelper.bean.character.bonus.IBonus
import lt.dndfan.dndhelper.bean.character.constant.EStat
import lt.dndfan.dndhelper.util.collection.IPair

interface IFeatureFactory {
    fun create(name : String,
               description : String,
               requiredLevel : Int,
               bonusList : List<IBonus>,
               validStats : List<IPair<EStat, Int>>,
               validRace : String,
               validClass : String,
               validSubclass : String) : IFeature
}