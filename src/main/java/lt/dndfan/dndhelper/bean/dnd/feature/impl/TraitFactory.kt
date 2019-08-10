package lt.dndfan.dndhelper.bean.dnd.feature.impl

import lt.dndfan.dndhelper.bean.dnd.feature.ITraitFactory
import org.springframework.stereotype.Component

@Component
class TraitFactory() : ITraitFactory
{
    override fun createTrait(name: String, description: String): Trait {
        return Trait(name,description)
    }
}