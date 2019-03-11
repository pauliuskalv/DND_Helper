package lt.dndfan.dndhelper.bean.character.spell.impl

import lt.dndfan.dndhelper.bean.character.constant.EMagicSchool
import lt.dndfan.dndhelper.bean.character.constant.ERestType
import lt.dndfan.dndhelper.bean.character.constant.ESpellComponent
import lt.dndfan.dndhelper.bean.character.spell.ISpellFactory

class SpellFactory : ISpellFactory {
    override fun createSpell(name: String,
                             description: String,
                             spellLevel: Int,
                             higherLevel: String,
                             magicSchool: EMagicSchool,
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
                               once: Boolean,
                               refresh: ERestType
    ): Ability {
        return Ability( name,
                description,
                once,
                refresh
        )
    }
}