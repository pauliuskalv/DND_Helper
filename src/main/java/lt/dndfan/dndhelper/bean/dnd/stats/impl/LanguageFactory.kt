package lt.dndfan.dndhelper.bean.dnd.stats.impl

import lt.dndfan.dndhelper.bean.dnd.constant.ELanguageType
import lt.dndfan.dndhelper.bean.dnd.stats.ILanguageFactory

class LanguageFactory() : ILanguageFactory {
    override fun createLanguage(name: String, type: ELanguageType, script: String): Language {
        return Language(name,
                type,
                script)
    }
}