package lt.dndfan.dndhelper.domain.dnd.translation.spell

import lt.dndfan.dndhelper.bean.dnd.spell.ISpell

interface ISpellTranslator {
    fun translate(args : Map<String, Any>) : ISpell
}