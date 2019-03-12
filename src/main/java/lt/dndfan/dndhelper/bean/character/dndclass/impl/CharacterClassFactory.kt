package lt.dndfan.dndhelper.bean.character.dndclass.impl

import lt.dndfan.dndhelper.bean.character.dndclass.ICharacterClassFactory

class CharacterClassFactory : ICharacterClassFactory {
    override fun createCharacterClass(name : String,
                                      description: String,
                                      hitDice : Int
                                      ): CharacterClass {
        return CharacterClass( name, description, hitDice)
    }
}