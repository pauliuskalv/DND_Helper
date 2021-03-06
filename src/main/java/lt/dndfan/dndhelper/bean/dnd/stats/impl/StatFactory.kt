package lt.dndfan.dndhelper.bean.dnd.stats.impl

import lt.dndfan.dndhelper.bean.dnd.stats.IStatFactory
import org.springframework.stereotype.Component

@Component
class StatFactory : IStatFactory {
    override fun createStat(name: String, fullName: String, description: String, skills: List<String>): Stat {
        return Stat(name,
                fullName,
                description,
                skills)
    }
}