package lt.dndfan.dndhelper.domain.dnd.translation.character.impl

import lt.dndfan.dndhelper.bean.dnd.character.ICharacterClass
import lt.dndfan.dndhelper.bean.dnd.character.ICharacterClassFactory
import lt.dndfan.dndhelper.bean.dnd.character.impl.CharacterClass
import lt.dndfan.dndhelper.bean.dnd.character.impl.CharacterClassFactory
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Stat
import lt.dndfan.dndhelper.domain.dnd.translation.character.IClassTranslator
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class ClassTranslator : IClassTranslator {
    @Autowired
    private lateinit var characterClassFactory : ICharacterClassFactory

    override fun translate(args: Map<String, Any>): ICharacterClass {
        val savingThrows = ArrayList<String>()

        for (map in (args["saving_throws"] as List<Map<String, Any>>)) {
            savingThrows.add(map["name"] as String)
        }

        return characterClassFactory.createCharacterClass(args["name"] as String,
                args["description"] as String,
                args["hit_die"] as Int,
                savingThrows
        )
    }
}