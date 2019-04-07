package lt.dndfan.dndhelper.domain.dnd.stat

interface IDamageCalculator {
    fun calculateDamage(diceCount: Int, diceValue: Int, stat: Int, plus: Int) : String
}