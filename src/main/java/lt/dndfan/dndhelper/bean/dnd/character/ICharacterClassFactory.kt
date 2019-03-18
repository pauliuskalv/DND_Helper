package lt.dndfan.dndhelper.bean.dnd.character

import lt.dndfan.dndhelper.bean.dnd.character.impl.CharacterClass

interface ICharacterClassFactory {
    fun createCharacterClass( name : String,
                              description : String,
                              hitDice : Int
    ) : CharacterClass
}