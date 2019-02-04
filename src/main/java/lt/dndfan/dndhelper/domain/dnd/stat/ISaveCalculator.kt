package lt.dndfan.dndhelper.domain.dnd.stat

interface ISaveCalculator {
    fun calculateBonus(value : Int) : Int
    fun calculateSavingThrowBonus(value : Int, proficiency : Int, proficient : Boolean) : Int
    fun calculateSkillBonus(value : Int, proficiency: Boolean, doubleProficiency : Boolean) : Int
}