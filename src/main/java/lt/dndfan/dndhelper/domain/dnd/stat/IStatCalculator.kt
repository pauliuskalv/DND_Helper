package lt.dndfan.dndhelper.domain.dnd.stat

interface ISaveCalculator {
    fun calculateBonus(value : Int) : Int
    fun calculateWithProficiency(value : Int, proficiency : Int) : Int
}