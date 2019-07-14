package lt.dndfan.dndhelper.facade.dnd.character.creation

import lt.dndfan.dndhelper.bean.dnd.stats.IStat
import lt.dndfan.dndhelper.util.collection.impl.Pair

interface IStatChooser {
    /**
     * TODO: Find a way to generate starting stats.
     */
    val stats : List<Pair<IStat,Int>>
    /** list of stats that are being improved in this menu and the amount */
    val improvedStats : ArrayList<Pair<IStat,Int>>
    /** Stat improvement points */
    var statPoints : Int

    fun incrementStat(stat: IStat) {
        if(statPoints > 0) {
            /** First iterate through already improved stats */
            for(improvedPair in improvedStats) {
                if(improvedPair.key == stat) {
                    improvedPair.value++
                    statPoints--
                    return
                }
            }
            /** Iterate through character stat pairs */
            for (pair in stats) {
                if (pair.key == stat) {
                    /** Add a new pair to improvedStats */
                    improvedStats.add(Pair(pair.key, pair.value + 1))
                    statPoints--
                    return
                }
            }
        } else {
            /** TODO: Let the user know that they do not have enough stat points */
        }
    }
    fun decrementStat(stat : IStat) {
        /** Probably not needed, but better safe than sorry */
        if(statPoints < 0) {
            for(improvedPair in improvedStats) {
                if(improvedPair.key == stat) {
                    improvedPair.value--
                    /** Check if the stat is back to the original value */
                    for (pair in stats) {
                        if(pair.key == stat) {
                            /** Is the improved stat value the same as it was originally? */
                            if(improvedPair.value == pair.value) {
                                /** Remove the pair from the improved stat list */
                                improvedStats.remove(improvedPair)
                                break
                            }
                        }
                    }
                    statPoints++
                    return
                }
            }
        } else {
            /** Could notify user that the stat was not improved */
        }
    }

    /**
     * decrement or increment until the value is reached.
     */
    fun setStat(stat: IStat, value: Int) {
        /** Iterate through improvedStats */
        for (improvedPair in improvedStats) {
            if(improvedPair.key == stat) {
                /** The stat is to be improved */
                if(value > improvedPair.value) {
                    /** Run incrementStat until the $value is reached */
                    for (i in value..value + improvedPair.value) {
                        incrementStat(stat)
                    }
                } else if(value < improvedPair.value) {
                    /** Technically this iterates in reverse order, but it does not matter */
                    for(i in value - improvedPair.value..value) {
                        decrementStat(stat)
                    }
                }
                return
            }
        }
        for (pair in stats) {
            if(pair.key == stat) {
                /** The stat is to be improved */
                if(value > pair.value) {
                    /** Run incrementStat until the $value is reached */
                    for (i in value..value + pair.value) {
                        incrementStat(stat)
                    }
                } else if(value < pair.value) {
                    /** Technically this iterates in reverse order, but it does not matter */
                    for(i in value - pair.value..value) {
                        decrementStat(stat)
                    }
                }
                return
            }
        }
    }

    /** Override */
    fun applyChanges()
}