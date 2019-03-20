package lt.dndfan.dndhelper.bean.dnd.character.impl

import lt.dndfan.dndhelper.bean.dnd.character.ICharacterClassFactory
import lt.dndfan.dndhelper.bean.dnd.constant.EStat

class CharacterClassFactory : ICharacterClassFactory {
    override fun createCharacterClass(name : String,
                                      description: String,
                                      hitDice : Int,
                                      savingThrows : List<EStat>
                                      ): CharacterClass {
        return CharacterClass( name, description, hitDice, savingThrows)
    }
}