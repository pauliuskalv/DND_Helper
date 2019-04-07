package lt.dndfan.dndhelper.bean.dnd.stats.impl

import lt.dndfan.dndhelper.bean.dnd.constant.ELanguageType
import lt.dndfan.dndhelper.bean.dnd.stats.ILanguage

class Language(override val name: String,
               override val type: ELanguageType,
               override val script: String
) : ILanguage