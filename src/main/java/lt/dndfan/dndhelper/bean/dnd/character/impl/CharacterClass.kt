package lt.dndfan.dndhelper.bean.dnd.character.impl

import lt.dndfan.dndhelper.bean.dnd.character.ICharacterClass
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Stat

class CharacterClass(override val name : String,
                     override val description: String,
                     override val hitDice: Int,
                     override val savingThrows: List<String>
) : ICharacterClass