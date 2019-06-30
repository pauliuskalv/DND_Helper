package lt.dndfan.dndhelper.domain.dnd.character.feature.impl

import lt.dndfan.dndhelper.bean.dnd.IPlayableCharacter
import lt.dndfan.dndhelper.bean.dnd.feature.IFeature
import lt.dndfan.dndhelper.bean.dnd.stats.IStat
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Stat
import lt.dndfan.dndhelper.domain.dnd.character.feature.IFeatureDomain
import lt.dndfan.dndhelper.util.collection.IPair
import lt.dndfan.dndhelper.util.collection.impl.Pair

class FeatureDomain : IFeatureDomain {
    override fun getByClass(features: List<IFeature>, characterClass: String): List<IFeature> {
        val matchedList = ArrayList<IFeature>()
        for (feature in features) {
            if(feature.validClass == characterClass) {
                matchedList.add(feature)
            }
        }
        return matchedList
    }

    override fun getByDescription(features: List<IFeature>, description: String): List<IFeature> {
        val matchedList = ArrayList<IFeature>()
        for (feature in features) {
            if(feature.description.contains("""*$description*""")) {
                matchedList.add(feature)
            }
        }
        return matchedList
    }

    override fun getByLevel(features: List<IFeature>, level : Int): List<IFeature> {
        val matchedList = ArrayList<IFeature>()
        for (feature in features) {
            /** Is it a certain level or usable from certain level? */
            if(feature.requiredLevel == level) {
                matchedList.add(feature)
            }
        }
        return matchedList
    }

    override fun getByName(features: List<IFeature>, name: String): List<IFeature> {
        val matchedList = ArrayList<IFeature>()
        for (feature in features) {
            if(feature.name.contains("""*$name*""")) {
                matchedList.add(feature)
            }
        }
        return matchedList
    }

    override fun getByRace(features: List<IFeature>, race: String): List<IFeature> {
        val matchedList = ArrayList<IFeature>()
        for (feature in features) {
            if(feature.validRace == race) {
                matchedList.add(feature)
            }
        }
        return matchedList
    }

    override fun getByStat(features: List<IFeature>, stat: IStat, value: Int): List<IFeature> {
        val matchedList = ArrayList<IFeature>()
        val requiredStat = Pair(stat, Int)
        for (feature in features) {
            for (validStat in feature.validStats) {
                if (validStat == requiredStat) {
                    matchedList.add(feature)
                }
            }
        }
        return matchedList
    }

    override fun getBySubclass(features: List<IFeature>, characterSubClass: String): List<IFeature> {
        val matchedList = ArrayList<IFeature>()
        for (feature in features) {
            if(feature.validSubclass == characterSubClass) {
                matchedList.add(feature)
            }
        }
        return matchedList
    }

    override fun getFeature(features: List<IFeature>, name: String): IFeature {
        for(feature in features) {
            if(feature.name == name) {
                return feature
            }
        }
        /** TODO: Exception */
        return features[0]
    }

    override fun isValid(character: IPlayableCharacter, feature: IFeature): Boolean {
        if(character.characterClass == feature.validClass &&
                feature.requiredLevel >= character.level &&
                feature.validRace == character.race &&
                feature.validSubclass == character.characterSubclass) {
                /** TODO: Bad cast, Find a different solution */
                if(feature.validStats.containsAll(character.allStats as List<IPair<IStat, Int>>)) {
                    return true
                }
        }
        return false
    }
}