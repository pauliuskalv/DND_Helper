package lt.dndfan.dndhelper.bean.dnd.spell.impl

import lt.dndfan.dndhelper.bean.dnd.spell.IMagicSchoolFactory
import org.springframework.stereotype.Component

@Component
class MagicSchoolFactory : IMagicSchoolFactory {
    override fun createMagicSchool(name : String,
                           description : String): MagicSchool {
        return MagicSchool(name, description)
    }
}