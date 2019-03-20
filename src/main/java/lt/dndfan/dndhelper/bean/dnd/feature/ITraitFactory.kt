package lt.dndfan.dndhelper.bean.dnd.feature

import lt.dndfan.dndhelper.bean.dnd.feature.impl.Trait

interface ITraitFactory {
    fun createTrait(name: String,
                    description: String) : Trait
}