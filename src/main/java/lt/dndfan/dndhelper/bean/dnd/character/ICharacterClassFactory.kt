package lt.dndfan.dndhelper.bean.dnd.character

import lt.dndfan.dndhelper.bean.dnd.character.impl.CharacterClass
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Stat

interface ICharacterClassFactory {
    fun createCharacterClass( name : String,
                              description : String,
                              hitDice : Int,
                              savingThrows : List<Stat>
    ) : CharacterClass
}