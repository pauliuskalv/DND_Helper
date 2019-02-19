package lt.dndfan.dndhelper.domain.dnd.stat

interface IWeaponDamageCalculator {
    fun calculateDamage(diceCount: Int, diceValue: Int, plus: Int, stat: Int) : String
}