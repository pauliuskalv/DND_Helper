package lt.dndfan.dndhelper.domain.dnd.stat

interface IWeaponDamageCalculator {
    fun calculate_damage(diceCount: Int, diceValue: Int, plus: Int, stat: Int) : String
}