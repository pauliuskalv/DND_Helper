package lt.dndfan.dndhelper.bean.dnd.feature.impl

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.constant.EStat
import lt.dndfan.dndhelper.bean.dnd.feature.IFeature
import lt.dndfan.dndhelper.util.collection.IPair

class BasicFeature(
    override val name: String,
    override val description: String,
    override val requiredLevel: Int,
    override val bonusList: List<IBonus>,
    override val validStats: List<IPair<EStat, Int>>,
    override val validRace: String,
    override val validClass: String,
    override val validSubclass: String
) : IFeature {
}