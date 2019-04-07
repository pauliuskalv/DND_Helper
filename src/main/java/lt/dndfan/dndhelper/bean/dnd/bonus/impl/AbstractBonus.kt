package lt.dndfan.dndhelper.bean.dnd.bonus.impl

import lt.dndfan.dndhelper.bean.dnd.IPlayableCharacter
import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus

abstract class AbstractBonus(override val bonusName: String,
                             override val description: String,
                             override val origin: String) : IBonus {
    private var mApplied : Boolean = false

    override fun apply(character : IPlayableCharacter) {
        if (mApplied)
            return

        applyBonus(character)
    }

    override fun remove(character : IPlayableCharacter) {
        if (!mApplied)
            return

        removeBonus(character)
    }

    override fun isApplied(): Boolean {
        return mApplied
    }

    protected abstract fun applyBonus(character : IPlayableCharacter)
    protected abstract fun removeBonus(character : IPlayableCharacter)
}