package lt.dndfan.dndhelper.bean.dnd.stats

import lt.dndfan.dndhelper.bean.dnd.constant.ELanguageType
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Language


interface ILanguageFactory {
    fun createLanguage(name : String,
                       type : ELanguageType,
                       script : String) : Language
}