package lt.dndfan.dndhelper.bean.dnd.bonus.impl

import lt.dndfan.dndhelper.bean.dnd.IPlayableCharacter

class MovementSpeedBonus(
    override val bonusName: String,
    override val description: String,
    override val origin: String,
    private val value : Int
) : AbstractBonus(bonusName, description, origin) {
    override fun applyBonus(character: IPlayableCharacter) {
        character.speed = character.speed + value
    }

    override fun removeBonus(character: IPlayableCharacter) {
        character.speed = character.speed - value
    }
}