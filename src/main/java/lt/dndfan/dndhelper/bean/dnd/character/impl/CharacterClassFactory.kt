package lt.dndfan.dndhelper.bean.dnd.character.impl

import lt.dndfan.dndhelper.bean.dnd.character.ICharacterClassFactory
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Stat

class CharacterClassFactory : ICharacterClassFactory {
    override fun createCharacterClass(name : String,
                                      description: String,
                                      hitDice : Int,
                                      savingThrows : List<String>
                                      ): CharacterClass {
        return CharacterClass( name, description, hitDice, savingThrows)
    }
}