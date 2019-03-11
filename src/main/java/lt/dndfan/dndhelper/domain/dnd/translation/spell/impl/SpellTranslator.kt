package lt.dndfan.dndhelper.domain.dnd.translation.spell.impl

import lt.dndfan.dndhelper.bean.character.spell.ISpell
import lt.dndfan.dndhelper.bean.character.spell.impl.SpellFactory
import lt.dndfan.dndhelper.domain.dnd.translation.spell.ISpellTranslator

class SpellTranslator : ISpellTranslator {
    override fun translate(args: Map<String, Any>): ISpell {
        val spellFactory = SpellFactory()
    }
}