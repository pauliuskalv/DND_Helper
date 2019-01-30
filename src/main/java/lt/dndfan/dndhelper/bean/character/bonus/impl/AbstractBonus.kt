package lt.dndfan.dndhelper.bean.character.bonus.impl

import lt.dndfan.dndhelper.bean.character.IPlayableCharacter
import lt.dndfan.dndhelper.bean.character.bonus.IBonus

abstract class AbstractBonus : IBonus {
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

    protected abstract fun applyBonus(character : IPlayableCharacter)
    protected abstract fun removeBonus(character : IPlayableCharacter)
}