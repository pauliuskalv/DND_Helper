package lt.dndfan.dndhelper.bean.dnd.impl

import lt.dndfan.dndhelper.bean.dnd.ICharacter
import lt.dndfan.dndhelper.bean.dnd.ICharacterFactory
import lt.dndfan.dndhelper.bean.dnd.IPlayableCharacter
import lt.dndfan.dndhelper.bean.dnd.ISpellcaster
import lt.dndfan.dndhelper.bean.dnd.constant.EAlignment
import lt.dndfan.dndhelper.bean.dnd.constant.ESpellSlot
import lt.dndfan.dndhelper.bean.dnd.feature.ITrait
import lt.dndfan.dndhelper.bean.dnd.inventory.ICharacterInventory
import lt.dndfan.dndhelper.bean.dnd.spell.IAbility
import lt.dndfan.dndhelper.bean.dnd.spell.ISpellPool
import lt.dndfan.dndhelper.bean.dnd.stats.IStat
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Stat
import lt.dndfan.dndhelper.util.collection.IPair
import lt.dndfan.dndhelper.util.collection.impl.Pair

class CharacterFactory : ICharacterFactory {
    override fun createCharacter(allStats: List<Stat>, statPairs: List<Pair<IStat,Int>>, level: Int, armorClass: Int, initiative: Int, speed: Int, swimmingSpeed: Int, flyingSpeed: Int, alignment: EAlignment, hitDiceCount: Int, currentHitDice: Int, name: String, description: String, traits: List<ITrait>, temporaryHitPoints: Int, maxHitPoints: Int, currentHitPoints: Int, inspiration: Boolean, inspirationDie: Int): ICharacter {
        return Character(allStats, statPairs, level, armorClass, initiative,
                speed, swimmingSpeed, flyingSpeed,
                alignment, hitDiceCount, currentHitDice,
                name, description, traits,
                temporaryHitPoints, maxHitPoints,
                currentHitPoints, inspiration, inspirationDie)
    }

    override fun createPlayableCharacter(allStats: List<Stat>, statPairs: List<Pair<IStat, Int>>, level: Int, armorClass: Int, initiative: Int, speed: Int, swimmingSpeed: Int, flyingSpeed: Int, alignment: EAlignment, hitDiceCount: Int, currentHitDice: Int, name: String, description: String, traits: List<ITrait>, abilities: List<IAbility>, spellModifier: Stat, statPoints: Int, temporaryHitPoints: Int, maxHitPoints: Int, currentHitPoints: Int, characterClass: String, characterSubclass: String, race: String, subrace: String, characterInventory: ICharacterInventory, inspiration: Boolean, inspirationDie: Int): IPlayableCharacter {
        return PlayableCharacter(allStats, statPairs, level, armorClass, initiative,
                speed, swimmingSpeed, flyingSpeed,
                alignment, hitDiceCount, currentHitDice,
                name, description, traits, abilities, spellModifier, statPoints,
                temporaryHitPoints, maxHitPoints, currentHitPoints,
                characterClass, characterSubclass, race, subrace,
                characterInventory, inspiration, inspirationDie)
    }

    override fun createSpellcaster(allStats: List<Stat>, statPairs: List<Pair<IStat, Int>>, level: Int, armorClass: Int, initiative: Int, speed: Int, swimmingSpeed: Int, flyingSpeed: Int, alignment: EAlignment, hitDiceCount: Int, currentHitDice: Int, name: String, description: String, traits: List<ITrait>, abilities: List<IAbility>, spellModifier: Stat, statPoints: Int, temporaryHitPoints: Int, maxHitPoints: Int, currentHitPoints: Int, characterClass: String, characterSubclass: String, race: String, subrace: String, personalityTraits: List<String>, ideals: List<String>, bonds: List<String>, flaws: List<String>, characterInventory: ICharacterInventory, spellsKnown: Int, cantripsKnown: Int, spellSlots: List<IPair<ESpellSlot, Int>>, spellPool: ISpellPool, inspiration: Boolean, inspirationDie: Int): ISpellcaster {
        return Spellcaster(allStats, statPairs, level, armorClass, initiative,
                speed, swimmingSpeed, flyingSpeed,
                alignment, hitDiceCount, currentHitDice,
                name, description, traits, abilities, spellModifier, statPoints,
                temporaryHitPoints, maxHitPoints, currentHitPoints,
                characterClass, characterSubclass, race, subrace,
                personalityTraits, ideals, bonds, flaws,
                characterInventory, spellsKnown, cantripsKnown,
                spellSlots, spellPool, inspiration, inspirationDie)
    }

}