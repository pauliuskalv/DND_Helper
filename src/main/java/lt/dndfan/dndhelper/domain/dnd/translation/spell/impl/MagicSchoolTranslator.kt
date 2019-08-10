package lt.dndfan.dndhelper.domain.dnd.translation.spell.impl

import lt.dndfan.dndhelper.bean.dnd.spell.IMagicSchool
import lt.dndfan.dndhelper.bean.dnd.spell.IMagicSchoolFactory
import lt.dndfan.dndhelper.domain.dnd.translation.spell.IMagicSchoolTranslator
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class MagicSchoolTranslator : IMagicSchoolTranslator {
    @Autowired
    private lateinit var magicSchoolFactory : IMagicSchoolFactory

    override fun translate(args: Map<String, Any>): IMagicSchool {
        return magicSchoolFactory.createMagicSchool(
                args["name"] as String,
                args["desc"] as String
        )
    }
}