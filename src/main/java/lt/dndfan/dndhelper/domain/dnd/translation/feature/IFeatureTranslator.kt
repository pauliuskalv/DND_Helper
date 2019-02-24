package lt.dndfan.dndhelper.domain.dnd.translation.feature

import lt.dndfan.dndhelper.bean.character.feature.IFeature

interface IFeatureTranslator  {
    fun translate(args: Map<String, Any>) : IFeature
}