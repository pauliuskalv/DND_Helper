package lt.dndfan.dndhelper.domain.dnd.translation.character.impl

import lt.dndfan.dndhelper.bean.dnd.character.ICharacterClass
import lt.dndfan.dndhelper.bean.dnd.character.impl.CharacterClass
import lt.dndfan.dndhelper.bean.dnd.character.impl.CharacterClassFactory
import lt.dndfan.dndhelper.domain.dnd.translation.character.IClassTranslator

class ClassTranslator : IClassTranslator {
    override fun translate(args: Map<String, Any>): ICharacterClass {
        val classFactory = CharacterClassFactory()

        return CharacterClass(args["name"] as String,
                args["description"] as String,
                args["hit_die"] as Int
        )
    }
}