package lt.dndfan.dndhelper.domain.dnd.translation.spell

import lt.dndfan.dndhelper.bean.dnd.spell.IMagicSchool

interface IMagicSchoolTranslator {
    fun translate (args : Map<String,Any>) : IMagicSchool
}