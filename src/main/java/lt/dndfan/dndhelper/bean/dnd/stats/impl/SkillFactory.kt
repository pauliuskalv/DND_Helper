package lt.dndfan.dndhelper.bean.dnd.stats.impl

import lt.dndfan.dndhelper.bean.dnd.stats.ISkillFactory

class SkillFactory : ISkillFactory {
    override fun createSkill(name: String, description: String, stat: String): Skill {
        return Skill(name,
                description,
                stat)
    }
}