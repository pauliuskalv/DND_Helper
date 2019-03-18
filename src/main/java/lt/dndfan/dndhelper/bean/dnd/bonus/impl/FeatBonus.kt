package lt.dndfan.dndhelper.bean.dnd.bonus.impl

import lt.dndfan.dndhelper.bean.dnd.IPlayableCharacter
import lt.dndfan.dndhelper.bean.dnd.feature.IFeature

class FeatBonus(override val bonusName: String,
                override val description: String,
                override val origin: String,
                private val feature : IFeature) : AbstractBonus(bonusName, description, origin) {
    override fun applyBonus(character: IPlayableCharacter) {
        character.addFeature(feature)
    }

    override fun removeBonus(character: IPlayableCharacter) {
        character.removeFeature(feature)
    }
}