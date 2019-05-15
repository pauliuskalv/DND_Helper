package lt.dndfan.dndhelper.bean.dnd.stats

import lt.dndfan.dndhelper.bean.dnd.stats.impl.Skill


interface IStatFactory {
    fun createStat(name : String,
                   fullName : String,
                   description : String,
                   skills : List<String>) : IStat
}