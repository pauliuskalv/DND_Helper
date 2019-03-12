package lt.dndfan.dndhelper.bean.character.dndclass

import lt.dndfan.dndhelper.bean.character.dndclass.impl.CharacterClass

interface ICharacterClassFactory {
    fun createCharacterClass( name : String,
                              description : String,
                              hitDice : Int
    ) : CharacterClass
}