package lt.dndfan.dndhelper.bean.dnd.feature

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.stats.IStat
import lt.dndfan.dndhelper.util.collection.IPair

interface IFeature {
    /**
     *  A dnd property that can be selected instead of increasing ability scores.
     *  TODO: Create json for feats
     */
    val name : String
    val description : String

    val requiredLevel : Int

    val bonusList : List<IBonus>

    val validStats : List<IPair<IStat, Int>>
    val validRace : String
    val validClass : String
    val validSubclass : String
}