package lt.dndfan.dndhelper.bean.dnd.feature.impl

import lt.dndfan.dndhelper.bean.dnd.feature.ITraitFactory

class TraitFactory() : ITraitFactory
{
    override fun createTrait(name: String, description: String): Trait {
        return Trait(name,description)
    }
}