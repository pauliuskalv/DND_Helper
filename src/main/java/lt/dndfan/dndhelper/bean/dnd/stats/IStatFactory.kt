package lt.dndfan.dndhelper.bean.dnd.stats

import lt.dndfan.dndhelper.bean.dnd.stats.impl.Skill
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Stat

interface IStatFactory {
    fun createStat(name : String,
                   fullname : String,
                   description : String,
                   skills : List<Skill>) : Stat
}