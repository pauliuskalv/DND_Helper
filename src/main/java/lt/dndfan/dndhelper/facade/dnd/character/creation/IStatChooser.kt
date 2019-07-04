package lt.dndfan.dndhelper.facade.dnd.character.creation

import lt.dndfan.dndhelper.bean.dnd.stats.IStat
import lt.dndfan.dndhelper.util.collection.impl.Pair

interface IStatChooser {
    /**
     * TODO: Find a way to generate starting stats.
     */
    val stats : List<Pair<IStat,Int>>
    /** list of stats that are being improved in this menu and the amount */
    val improvedStats: List<Pair<IStat,Int>>
    /** Stat improvement points */
    var statPoints : Int

    fun incrementStat(stat : IStat)
    fun decrementStat(stat : IStat)

    /** decrement or increment until the value is reached */
    fun setStat(stat: IStat, amount: Int)

    fun canApply()

    fun applyChanges()
}