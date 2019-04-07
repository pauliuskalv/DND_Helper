package lt.dndfan.dndhelper.bean.dnd.bonus.impl

import lt.dndfan.dndhelper.bean.dnd.IPlayableCharacter

class ArmorClassBonus(override val bonusName: String,
                      override val description: String,
                      override val origin: String,
                      private val value : Int) : AbstractBonus(bonusName, description, origin) {
    override fun applyBonus(character : IPlayableCharacter) {
        character.armorClass = character.armorClass + value
    }

    override fun removeBonus(character : IPlayableCharacter) {
        character.armorClass = character.armorClass - value
    }
}