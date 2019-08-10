package lt.dndfan.dndhelper.bean.dnd.spell.impl

import lt.dndfan.dndhelper.bean.dnd.constant.ERestType
import lt.dndfan.dndhelper.bean.dnd.constant.ESpellComponent
import lt.dndfan.dndhelper.bean.dnd.spell.ISpellFactory
import org.springframework.stereotype.Component

@Component
class SpellFactory : ISpellFactory {
    override fun createSpell(name: String,
                             description: String,
                             spellLevel: Int,
                             higherLevel: String,
                             magicSchool: MagicSchool,
                             ritual: Boolean,
                             concentration: Boolean,
                             castingTime: String,
                             range: String,
                             requiredMaterials: String,
                             components: List<ESpellComponent>,
                             bookReference: String,
                             validClass: List<String>,
                             validSubclass: List<String>
    ): Spell {
        return Spell( name,
                description,
                higherLevel,
                spellLevel,
                magicSchool,
                ritual,
                concentration,
                castingTime,
                range,
                requiredMaterials,
                components,
                bookReference,
                validClass,
                validSubclass)
    }


    override fun createAbility(name: String,
                               description: String,
                               count: Int,
                               used: Int,
                               restType : ERestType
    ): Ability {
        return Ability( name,
                description,
                count,
                used,
                restType
        )
    }
}