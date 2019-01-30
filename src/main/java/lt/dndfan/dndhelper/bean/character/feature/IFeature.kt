package lt.dndfan.dndhelper.bean.character.feature

import lt.dndfan.dndhelper.bean.character.bonus.IBonus
import lt.dndfan.dndhelper.bean.character.constant.EStat
import lt.dndfan.dndhelper.util.collection.IPair

interface IFeature {
    val name : String
    val description : String

    val requiredLevel : Int

    val bonusList : List<IBonus>

    val validStats : List<IPair<EStat, Int>>
    val validRace : String
    val validClass : String
    val validSubclass : String
}