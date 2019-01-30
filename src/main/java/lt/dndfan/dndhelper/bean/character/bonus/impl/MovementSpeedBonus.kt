package lt.dndfan.dndhelper.bean.character.bonus.impl

import lt.dndfan.dndhelper.bean.character.IPlayableCharacter

class MovementSpeedBonus(
    override val bonusName: String,
    override val description: String,
    override val origin: String) : AbstractBonus() {
    override fun applyBonus(character: IPlayableCharacter) {

    }

    override fun removeBonus(character: IPlayableCharacter) {

    }
}