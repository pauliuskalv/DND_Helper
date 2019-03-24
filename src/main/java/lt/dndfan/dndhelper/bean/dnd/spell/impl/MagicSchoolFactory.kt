package lt.dndfan.dndhelper.bean.dnd.spell.impl

import lt.dndfan.dndhelper.bean.dnd.spell.IMagicSchoolFactory

class MagicSchoolFactory : IMagicSchoolFactory {
    override fun createMagicSchool(name : String,
                           description : String): MagicSchool {
        return MagicSchool(name, description)
    }
}