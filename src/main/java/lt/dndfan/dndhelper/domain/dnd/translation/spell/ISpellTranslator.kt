package lt.dndfan.dndhelper.domain.dnd.translation.spell

import lt.dndfan.dndhelper.bean.character.spell.ISpell

interface ISpellTranslator {
    fun translate(args : Map<String, Any>) : ISpell
}