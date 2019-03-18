package lt.dndfan.dndhelper.domain.dnd.translation.spell.impl

import lt.dndfan.dndhelper.bean.dnd.constant.EMagicSchool
import lt.dndfan.dndhelper.bean.dnd.constant.ESpellComponent
import lt.dndfan.dndhelper.bean.dnd.spell.ISpell
import lt.dndfan.dndhelper.bean.dnd.spell.impl.SpellFactory
import lt.dndfan.dndhelper.domain.dnd.translation.spell.ISpellTranslator

class SpellTranslator : ISpellTranslator {
    override fun translate(args: Map<String, Any>): ISpell {
        val spellFactory = SpellFactory()

        return spellFactory.createSpell( args["name"] as String,
                args["description"] as String,                  // in json description is probably an array or map
                args["level"] as Int,
                args["higher_level"] as String,
                args["school"] as EMagicSchool,
                args["ritual"] as Boolean,                      // booleans in json are yes or no
                args["concentration"] as Boolean,
                args["casting_time"] as String,
                args["range"] as String,
                args["material"] as String,
                args["components"] as List<ESpellComponent>,    // probably an array or map as well
                args["page"] as String,
                args["classes"] as List<String>,
                args["subclasses"] as List<String>              // could be null
        )
    }
}