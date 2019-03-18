package lt.dndfan.dndhelper.bean.dnd.character.impl

import lt.dndfan.dndhelper.bean.dnd.character.ICharacterClass

class CharacterClass(override val name : String,
                     override val description: String,
                     override val hitDice: Int
) : ICharacterClass