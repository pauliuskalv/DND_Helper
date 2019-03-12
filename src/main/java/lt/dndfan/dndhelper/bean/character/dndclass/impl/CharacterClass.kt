package lt.dndfan.dndhelper.bean.character.dndclass.impl

import lt.dndfan.dndhelper.bean.character.dndclass.ICharacterClass

class CharacterClass(override val name : String,
                     override val description: String,
                     override val hitDice: Int
) : ICharacterClass