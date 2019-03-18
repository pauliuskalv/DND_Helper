package lt.dndfan.dndhelper.bean.dnd.bonus

interface IBonusFactory {
    /**
     * Creates a dummy bonus
     */
    fun createBonus() : IBonus

    /**
     * Creates a specific bonus given the arguments.
     * For specific arguments, see implementing classes
     */
    fun createBonus(args : Map<String, Any>) : IBonus
}