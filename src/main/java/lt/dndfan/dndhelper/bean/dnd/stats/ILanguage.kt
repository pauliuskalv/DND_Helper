package lt.dndfan.dndhelper.bean.dnd.stats

import lt.dndfan.dndhelper.bean.dnd.constant.ELanguageType

interface ILanguage {
    val name : String
    val type : ELanguageType
    val script : String
}