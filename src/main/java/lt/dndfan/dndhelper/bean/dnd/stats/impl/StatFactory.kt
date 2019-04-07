package lt.dndfan.dndhelper.bean.dnd.stats.impl

import lt.dndfan.dndhelper.bean.dnd.stats.IStatFactory

class StatFactory : IStatFactory {
    override fun createStat(name: String, fullname: String, description: String, skills: List<Skill>): Stat {
        return Stat(name,
                fullname,
                description,
                skills)
    }
}