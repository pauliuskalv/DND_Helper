package lt.dndfan.dndhelper.domain.dnd.translation.character.impl

import lt.dndfan.dndhelper.bean.dnd.character.impl.CharacterClass
import lt.dndfan.dndhelper.bean.dnd.character.impl.CharacterClassFactory
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Stat
import lt.dndfan.dndhelper.domain.dnd.translation.character.IClassTranslator

class ClassTranslator : IClassTranslator {

    private val characterClassFactory = CharacterClassFactory()

    override fun translate(args: Map<String, Any>): CharacterClass {
        val savingThrows = ArrayList<String>()

        for(map in (args["saving_throws"] as List<Map<String,Any>>))
        {
            savingThrows.add(map["name"] as String)
        }

        return characterClassFactory.createCharacterClass(args["name"] as String,
                args["description"] as String,
                args["hit_die"] as Int,
                savingThrows
        )
    }
}