package lt.dndfan.dndhelper.bean.dnd.bonus.impl

import lt.dndfan.dndhelper.bean.dnd.IPlayableCharacter

class ArmorClassBonus(override val bonusName: String,
                      override val description: String,
                      override val origin: String,
                      private val value : Int) : AbstractBonus(bonusName, description, origin) {
    /**
     * This bonus should be used for all Armor Class modifications to the base AC value (10).
     */

    override fun applyBonus(character : IPlayableCharacter) {
        character.armorClass = character.armorClass + value
    }

    override fun removeBonus(character : IPlayableCharacter) {
        character.armorClass = character.armorClass - value
    }
}