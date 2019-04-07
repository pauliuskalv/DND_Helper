package lt.dndfan.dndhelper.domain.dnd.character.feature

import lt.dndfan.dndhelper.bean.dnd.IPlayableCharacter
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Stat
import lt.dndfan.dndhelper.bean.dnd.feature.IFeature

interface IFeatureDomain {
    fun isValid(character : IPlayableCharacter, feature : IFeature) : Boolean

    /**
     * val validStats : List<IPair<Stat, Int>>
     * val validRace : String
     * val validClass : String
     * val validSubclass : String
     */

    fun getByName(features : List<IFeature>, name : String) : List<IFeature>
    fun getByStat(features : List<IFeature>, stat : Stat) : List<IFeature>
    fun getByRace(features : List<IFeature>, race : String) : List<IFeature>
    fun getByClass(features : List<IFeature>, characterClass : String) : List<IFeature>
    fun getBySubclass(features : List<IFeature>, characterClass : String) : List<IFeature>
    fun getByLevel(features : List<IFeature>, characterClass : String) : List<IFeature>
}