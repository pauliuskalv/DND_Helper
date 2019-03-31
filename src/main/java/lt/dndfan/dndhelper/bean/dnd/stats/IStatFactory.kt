package lt.dndfan.dndhelper.bean.dnd.stats

import lt.dndfan.dndhelper.bean.dnd.stats.impl.Skill


interface IStatFactory {
    fun createStat(name : String,
                   fullname : String,
                   description : String,
                   skills : List<Skill>) : IStat
}