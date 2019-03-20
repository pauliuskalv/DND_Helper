package lt.dndfan.dndhelper.bean.dnd.stats

import lt.dndfan.dndhelper.bean.dnd.stats.impl.Skill

interface IStat {
    val name : String               // e.g. DEX
    val fullName: String            // Dexterity
    val description: String
    val skills : List<Skill>        // skills that get benefits from this stat
}