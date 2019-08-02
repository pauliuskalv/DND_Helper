package lt.dndfan.dndhelper.domain.dnd.character.feature

import lt.dndfan.dndhelper.bean.dnd.IPlayableCharacter
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Stat
import lt.dndfan.dndhelper.bean.dnd.feature.IFeature
import lt.dndfan.dndhelper.bean.dnd.stats.IStat

interface IFeatureDomain {
    fun isValid(character : IPlayableCharacter, feature : IFeature) : Boolean

    fun getFeature(features : List<IFeature>, name: String) : IFeature

    /**
     * val validStats : List<IPair<Stat, Int>>
     * val validRace : String
     * val validClass : String
     * val validSubclass : String
     */

    fun getByName(features : List<IFeature>, name : String) : List<IFeature>
    fun getByDescription(features : List<IFeature>, description : String) : List<IFeature>
    /** Very doubtful that passing in stat interface is a good idea */
    fun getByStat(features : List<IFeature>, stat : IStat, value : Int) : List<IFeature>
    fun getByRace(features : List<IFeature>, race : String) : List<IFeature>
    fun getByClass(features : List<IFeature>, characterClass : String) : List<IFeature>
    fun getBySubclass(features : List<IFeature>, characterSubClass : String) : List<IFeature>
    fun getByLevel(features : List<IFeature>, level : Int) : List<IFeature>
}