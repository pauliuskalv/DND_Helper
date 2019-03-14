package lt.dndfan.dndhelper.bean.character.impl

import lt.dndfan.dndhelper.bean.character.ISpellcaster
import lt.dndfan.dndhelper.bean.character.constant.EAlignment
import lt.dndfan.dndhelper.bean.character.constant.ESpellSlot
import lt.dndfan.dndhelper.bean.character.constant.EStat
import lt.dndfan.dndhelper.bean.character.inventory.ICharacterInventory
import lt.dndfan.dndhelper.bean.character.spell.IAbility
import lt.dndfan.dndhelper.bean.character.spell.ISpell
import lt.dndfan.dndhelper.bean.character.spell.ISpellPool
import lt.dndfan.dndhelper.util.collection.IPair
import lt.dndfan.dndhelper.util.collection.impl.Pair

class Spellcaster(
        override var armorClass: Int,
        override var initiative: Int,
        override var speed: Int,
        override var swimmingSpeed: Int,
        override var flyingSpeed: Int,
        override var alignment: EAlignment,
        override var hitDiceCount: Int,
        override var currentHitDice: Int,
        override val name: String,
        override val description: String,
        override val traits: List<String>,
        override val abilities: List<IAbility>,
        override val spellModifier: EStat,

        override var temporaryHitPoints: Int,
        override var maxHitPoints: Int,
        override var currentHitPoints: Int,

        override val characterClass: String,
        override val characterSubclass: String,

        override val race: String,
        override val subrace: String,

        override val personalityTraits: List<String>,
        override val ideals: List<String>,
        override val bonds: List<String>,
        override val flaws: List<String>,

        characterInventory : ICharacterInventory,

        override var spellsKnown: Int,
        override var cantripsKnown: Int,
        override val spellSlots: List<IPair<ESpellSlot, Int>>,
        override val spellPool: ISpellPool
) : PlayableCharacter(
        armorClass,
        initiative,
        speed,
        swimmingSpeed,
        flyingSpeed,
        alignment,
        hitDiceCount,
        currentHitDice,
        name,
        description,
        traits,
        abilities,
        spellModifier,

        temporaryHitPoints,
        maxHitPoints,
        currentHitPoints,

        characterClass,
        characterSubclass,

        race,
        subrace,

        characterInventory
), ISpellcaster {
    private val expendedSpellSlots : List<IPair<ESpellSlot, Int>> = arrayListOf(
            Pair(ESpellSlot.LEVEL_1, 0),
            Pair(ESpellSlot.LEVEL_2, 0),
            Pair(ESpellSlot.LEVEL_3, 0),
            Pair(ESpellSlot.LEVEL_4, 0),
            Pair(ESpellSlot.LEVEL_5, 0),
            Pair(ESpellSlot.LEVEL_6, 0),
            Pair(ESpellSlot.LEVEL_7, 0),
            Pair(ESpellSlot.LEVEL_8, 0),
            Pair(ESpellSlot.LEVEL_9, 0)
    )

    override fun castSpell(spell: ISpell): Boolean {
        if (spell.spellLevel == ESpellSlot.CANTRIP.value)
            return true

        for (spellSlot in spellSlots) {
            if (spellSlot.key.value == spell.spellLevel && spellSlot.value > 0) {
                spellSlot.value -= 1
            }
        }

        return false
    }

    override fun resetSlots() {
        for (spellSlot in expendedSpellSlots)
            spellSlot.value = 0
    }
}