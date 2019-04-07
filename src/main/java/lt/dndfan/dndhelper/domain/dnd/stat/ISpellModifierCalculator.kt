package lt.dndfan.dndhelper.domain.dnd.stat

/**
 * +8 for spellSaveDC
 */

interface ISpellModifierCalculator {
    fun calculateSpellCastingModifier(spellCastStat: Int, proficiency: Int)
}