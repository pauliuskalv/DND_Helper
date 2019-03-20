package lt.dndfan.dndhelper.bean.dnd.character.impl

import lt.dndfan.dndhelper.bean.dnd.character.ICharacterClass
import lt.dndfan.dndhelper.bean.dnd.constant.EStat

class CharacterClass(override val name : String,
                     override val description: String,
                     override val hitDice: Int,
                     override val savingThrows: List<EStat>
) : ICharacterClass