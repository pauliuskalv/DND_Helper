package lt.dndfan.dndhelper.domain.dnd.translation.spell.impl

import lt.dndfan.dndhelper.bean.dnd.spell.impl.MagicSchool
import lt.dndfan.dndhelper.bean.dnd.spell.impl.MagicSchoolFactory
import lt.dndfan.dndhelper.domain.dnd.translation.spell.IMagicSchoolTranslator

class MagicSchoolTranslator : IMagicSchoolTranslator {
    private val magicSchoolFactory = MagicSchoolFactory()

    override fun translate(args: Map<String, Any>): MagicSchool {
        return magicSchoolFactory.createMagicSchool(
                args["name"] as String,
                args["desc"] as String
        )
    }
}