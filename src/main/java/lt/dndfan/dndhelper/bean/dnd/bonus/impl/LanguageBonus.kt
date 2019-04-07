package lt.dndfan.dndhelper.bean.dnd.bonus.impl

import lt.dndfan.dndhelper.bean.dnd.IPlayableCharacter
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Language

class LanguageBonus (
        override val bonusName : String,
        override val description : String,
        override val origin : String,
        private val language : Language
        ) : AbstractBonus (bonusName, description, origin) {
    override fun applyBonus(character: IPlayableCharacter) {
        character.addLanguage(language)
    }

    override fun removeBonus(character : IPlayableCharacter) {
        character.removeLanguage(language)
    }

}