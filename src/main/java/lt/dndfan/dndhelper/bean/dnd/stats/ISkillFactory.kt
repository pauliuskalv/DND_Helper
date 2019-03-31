package lt.dndfan.dndhelper.bean.dnd.stats

interface ISkillFactory {
    fun createSkill(name : String,
                    description : String,
                    stat : String) : ISkill
}