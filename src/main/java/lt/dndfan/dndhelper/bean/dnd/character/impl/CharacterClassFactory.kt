package lt.dndfan.dndhelper.bean.dnd.character.impl

import lt.dndfan.dndhelper.bean.dnd.character.ICharacterClassFactory

class CharacterClassFactory : ICharacterClassFactory {
    override fun createCharacterClass(name : String,
                                      description: String,
                                      hitDice : Int
                                      ): CharacterClass {
        return CharacterClass( name, description, hitDice)
    }
}