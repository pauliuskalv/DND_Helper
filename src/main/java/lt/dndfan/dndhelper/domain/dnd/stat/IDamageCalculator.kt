package lt.dndfan.dndhelper.domain.dnd.stat

interface IDamageCalculator {
    /**
     * Should be used for returning damage string with all the bonuses taken into account.
     * TODO: Change dice* variables into a single damage description string that will be modified.
     */
    fun calculateDamage(diceCount: Int, diceValue: Int, stat: Int, plus: Int) : String
}