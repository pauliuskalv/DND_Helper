package lt.dndfan.dndhelper.bean.dnd.stats

import lt.dndfan.dndhelper.bean.dnd.stats.impl.Skill

interface ISkillFactory {
    fun createSkill(name : String,
                    description : String,
                    stat : String) : Skill
}