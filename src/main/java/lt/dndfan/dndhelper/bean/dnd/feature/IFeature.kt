package lt.dndfan.dndhelper.bean.dnd.feature

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Stat
import lt.dndfan.dndhelper.util.collection.IPair

interface IFeature {
    /*
        A dnd property that can be selected instead of increasing ability scores.
     */
    val name : String
    val description : String

    val requiredLevel : Int

    val bonusList : List<IBonus>

    val validStats : List<IPair<Stat, Int>>    // There is no such field in feats json, instead there are prerequisites
    val validRace : String
    val validClass : String
    val validSubclass : String
}