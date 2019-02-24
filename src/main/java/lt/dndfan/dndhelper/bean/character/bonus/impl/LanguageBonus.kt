package lt.dndfan.dndhelper.bean.character.bonus.impl

import lt.dndfan.dndhelper.bean.character.IPlayableCharacter
import lt.dndfan.dndhelper.bean.character.constant.ELanguage

class LanguageBonus (
        override val bonusName : String,
        override val description : String,
        override val origin : String,
        private val language : ELanguage
        ) : AbstractBonus (bonusName, description, origin) {
    override fun applyBonus(character: IPlayableCharacter) {
        character.addLanguage(language)
    }

    override fun removeBonus(character : IPlayableCharacter) {
        character.removeLanguage(language)
    }

}