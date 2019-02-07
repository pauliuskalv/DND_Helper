package lt.dndfan.dndhelper.domain.dnd.stat

interface IStatCalculator {
    fun calculateBonus(value : Int) : Int
    fun calculateWithProficiency(value : Int, proficiency : Int) : Int
}