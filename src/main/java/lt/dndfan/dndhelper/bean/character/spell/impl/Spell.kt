package lt.dndfan.dndhelper.bean.character.spell.impl

import lt.dndfan.dndhelper.bean.character.constant.EMagicSchool
import lt.dndfan.dndhelper.bean.character.constant.ESpellComponent
import lt.dndfan.dndhelper.bean.character.spell.ISpell

class Spell(override val spellName: String,
            override val spellDescription: String,
            override val higherLevel: String,
            override val spellLevel: Int,
            override val magicSchool: EMagicSchool,
            override val ritual: Boolean,
            override val concentration: Boolean,
            override val castingTime: String,
            override val range: String,
            override val requiredMaterials: String,
            override val components: List<ESpellComponent>,
            override val bookReference: String,
            override val validClass: List<String>,
            override val validSubclass: List<String>) : ISpell