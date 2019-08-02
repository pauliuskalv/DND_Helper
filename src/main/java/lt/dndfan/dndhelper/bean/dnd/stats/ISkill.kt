package lt.dndfan.dndhelper.bean.dnd.stats

interface ISkill {
    val name : String
    val description : String
    /** Stat that improves the skill. */
    val stat: String
}