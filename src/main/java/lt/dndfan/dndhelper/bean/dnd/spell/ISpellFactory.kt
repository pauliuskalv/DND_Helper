package lt.dndfan.dndhelper.bean.dnd.spell

import lt.dndfan.dndhelper.bean.dnd.spell.impl.MagicSchool
import lt.dndfan.dndhelper.bean.dnd.constant.ERestType
import lt.dndfan.dndhelper.bean.dnd.constant.ESpellComponent

interface ISpellFactory {
    fun createSpell(name : String,
                    description : String,
                    spellLevel : Int,
                    higherLevel: String,
                    magicSchool: MagicSchool,
                    ritual: Boolean,
                    concentration: Boolean,
                    castingTime : String,
                    range : String,
                    requiredMaterials : String,
                    components : List<ESpellComponent>,
                    bookReference : String,
                    validClass : List<String>,
                    validSubclass : List<String>
    ) : ISpell
    /** Consider splitting ISpellFactory and IAbilityFactory to maintain single responsibility */
    fun createAbility( name : String,
                       description: String,
                       count: Int,
                       used : Int,
                       refresh : ERestType
    ) : IAbility
}