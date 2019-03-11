package lt.dndfan.dndhelper.bean.character.spell

import lt.dndfan.dndhelper.bean.character.constant.EMagicSchool
import lt.dndfan.dndhelper.bean.character.constant.ERestType
import lt.dndfan.dndhelper.bean.character.constant.ESpellComponent
import lt.dndfan.dndhelper.bean.character.spell.impl.Ability
import lt.dndfan.dndhelper.bean.character.spell.impl.Spell

interface ISpellFactory {
    fun createSpell( name : String,
                     description : String,
                     spellLevel : Int,
                     higherLevel: String,
                     magicSchool: EMagicSchool,
                     ritual: Boolean,
                     concentration: Boolean,
                     castingTime : String,
                     range : String,
                     requiredMaterials : String,
                     components : List<ESpellComponent>,
                     bookReference : String,
                     validClass : List<String>,
                     validSubclass : List<String>
    ) : Spell
    fun createAbility( name : String,
                       description: String,
                       once: Boolean,
                       refresh : ERestType
    ) : Ability
}