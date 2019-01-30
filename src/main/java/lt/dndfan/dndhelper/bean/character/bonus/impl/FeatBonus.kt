package lt.dndfan.dndhelper.bean.character.bonus.impl

import lt.dndfan.dndhelper.bean.character.IPlayableCharacter
import lt.dndfan.dndhelper.bean.character.feature.IFeature

class FeatBonus(override val bonusName: String,
                override val description: String,
                override val origin: String,
                private val feature : IFeature) : AbstractBonus() {
    override fun applyBonus(character: IPlayableCharacter) {
        character.addFeature(feature)
    }

    override fun removeBonus(character: IPlayableCharacter) {
        character.removeFeature(feature)
    }

}