package lt.dndfan.dndhelper.bean.character.spell

import lt.dndfan.dndhelper.bean.character.constant.EMagicSchool
import lt.dndfan.dndhelper.bean.character.constant.ESpellComponent

interface ISpell {
    val spellName : String
    val spellDescription : String
    val higherLevel : String

    /**
     * If zero, its a cantrip
     * Else its a spell
     */
    val spellLevel : Int

    val magicSchool : EMagicSchool

    val ritual : Boolean
    val concentration : Boolean

    val castingTime : String
    val range : String
    val requiredMaterials : String
    val components : List<ESpellComponent>

    val bookReference : String

    val validClass : List<String>
    val validSubclass : List<String>
}