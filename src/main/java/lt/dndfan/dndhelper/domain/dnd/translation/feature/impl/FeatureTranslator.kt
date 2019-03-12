package lt.dndfan.dndhelper.domain.dnd.translation.feature.impl

import lt.dndfan.dndhelper.bean.character.bonus.IBonus
import lt.dndfan.dndhelper.bean.character.constant.EStat
import lt.dndfan.dndhelper.bean.character.feature.IFeature
import lt.dndfan.dndhelper.bean.character.feature.impl.BasicFeatureFactory
import lt.dndfan.dndhelper.domain.dnd.translation.feature.IFeatureTranslator
import lt.dndfan.dndhelper.util.collection.IPair

class FeatureTranslator : IFeatureTranslator {
    override fun translate(args: Map<String, Any>): IFeature {
        val featureFactory = BasicFeatureFactory()
        val bonusList = ArrayList<IBonus>()
        val validStats = ArrayList<IPair<EStat,Int>>()

        return featureFactory.create( args["name"] as String,
                args["description"] as String,
                args["level"] as Int,
                bonusList,
                validStats,                                     // should be replaced by prerequisites
                "",                                    // no field in json
                args["class"] as String,                        // something like array in json
                args["subclass"] as String
        )
    }
}