package lt.dndfan.dndhelper.bean.character.feature

import lt.dndfan.dndhelper.bean.character.bonus.IBonus
import lt.dndfan.dndhelper.bean.character.constant.EStat
import lt.dndfan.dndhelper.util.collection.IPair

interface IFeature {
    /*
        A character property that can be selected instead of increasing ability scores.
     */
    val name : String
    val description : String

    val requiredLevel : Int

    val bonusList : List<IBonus>

    val validStats : List<IPair<EStat, Int>>    // There is no such field in feats json, instead there are prerequisites
    val validRace : String
    val validClass : String
    val validSubclass : String
}