package lt.dndfan.dndhelper.domain.dnd.translation.feature.impl

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Stat
import lt.dndfan.dndhelper.bean.dnd.feature.IFeature
import lt.dndfan.dndhelper.bean.dnd.feature.impl.BasicFeatureFactory
import lt.dndfan.dndhelper.domain.dnd.translation.feature.IFeatureTranslator
import lt.dndfan.dndhelper.util.collection.IPair

class FeatureTranslator : IFeatureTranslator {
    override fun translate(args: Map<String, Any>): IFeature {
        val featureFactory = BasicFeatureFactory()
        val bonusList = ArrayList<IBonus>()
        val validStats = ArrayList<IPair<Stat,Int>>()

        /**
         *  Assuming same syntax as Features.json
         *  This will possibly be simplified in Feats.json
         */
        return featureFactory.create( args["name"] as String,
                (args["description"] as List<String>).joinToString("\n"),
                args["level"] as Int,
                bonusList,
                validStats,
                "",
                (args["class"] as Map<String, Any>)["name"] as String,
                (args["subclass"] as Map<String,Any>)["name"] as String
        )
    }
}