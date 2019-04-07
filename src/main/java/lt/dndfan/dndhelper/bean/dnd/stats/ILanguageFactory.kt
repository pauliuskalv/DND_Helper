package lt.dndfan.dndhelper.bean.dnd.stats

import lt.dndfan.dndhelper.bean.dnd.constant.ELanguageType


interface ILanguageFactory {
    fun createLanguage(name : String,
                       type : ELanguageType,
                       script : String) : ILanguage
}