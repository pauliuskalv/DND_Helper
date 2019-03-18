package lt.dndfan.dndhelper.bean.dnd.feature.impl

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.constant.EStat
import lt.dndfan.dndhelper.bean.dnd.feature.IFeature
import lt.dndfan.dndhelper.bean.dnd.feature.IFeatureFactory
import lt.dndfan.dndhelper.util.collection.IPair

class BasicFeatureFactory : IFeatureFactory {
    override fun create(name: String,
                        description: String,
                        requiredLevel: Int,
                        bonusList: List<IBonus>,
                        validStats: List<IPair<EStat, Int>>,
                        validRace: String,
                        validClass: String,
                        validSubclass: String): IFeature {
        return BasicFeature(
                name,
                description,
                requiredLevel,
                bonusList,
                validStats,
                validRace,
                validClass,
                validSubclass
        )
    }
}