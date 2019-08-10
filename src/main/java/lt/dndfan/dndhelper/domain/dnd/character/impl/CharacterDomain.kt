package lt.dndfan.dndhelper.domain.dnd.character.impl

import lt.dndfan.dndhelper.bean.dnd.ICharacter
import lt.dndfan.dndhelper.bean.dnd.ICharacterFactory
import lt.dndfan.dndhelper.bean.dnd.IPlayableCharacter
import lt.dndfan.dndhelper.bean.dnd.ISpellcaster
import lt.dndfan.dndhelper.bean.dnd.constant.EAlignment
import lt.dndfan.dndhelper.bean.dnd.constant.ESpellSlot
import lt.dndfan.dndhelper.bean.dnd.feature.ITrait
import lt.dndfan.dndhelper.bean.dnd.impl.CharacterFactory
import lt.dndfan.dndhelper.bean.dnd.inventory.ICharacterInventory
import lt.dndfan.dndhelper.bean.dnd.spell.IAbility
import lt.dndfan.dndhelper.bean.dnd.spell.ISpellPool
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Stat
import lt.dndfan.dndhelper.domain.dnd.character.ICharacterDomain
import lt.dndfan.dndhelper.util.collection.IPair
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class CharacterDomain : ICharacterDomain {
    @Autowired
    private lateinit var characterFactory : ICharacterFactory

    override fun createCharacter(args : Map<String, Any>): ICharacter {
        return characterFactory.createCharacter(
                args["AllStats"] as List<Stat>,
                args["level "] as Int,
                args["armorClass"] as Int,
                args["initiative"] as Int,
                args["speed"] as Int,
                args["swimmingSpeed"] as Int,
                args["flyingSpeed"] as Int,
                args["alignment"] as EAlignment,
                args["hitDiceCount"] as Int,
                args["currentHitDice"] as Int,
                args["name"] as String,
                args["description"] as String,
                args["traits"] as List<ITrait>,
                args["temporaryHitPoints"] as Int,
                args["maxHitPoints"] as Int,
                args["currentHitPoints"] as Int,
                args["inspiration"] as Boolean,
                args["inspirationDie"] as Int)
    }

    override fun createPlayableCharacter(args : Map<String, Any>): IPlayableCharacter {
        return characterFactory.createPlayableCharacter(args["allStats"] as List<Stat>,
                args["level"] as Int,
                args["armorClass"] as Int,
                args["initiative"] as Int,
                args["speed"] as Int,
                args["swimmingSpeed"] as Int,
                args["flyingSpeed"] as Int,
                args["alignment"] as EAlignment,
                args["hitDiceCount"] as Int,
                args["currentHitDice"] as Int,
                args["name"] as String,
                args["description"] as String,
                args["traits"] as List<ITrait>,
                args["abilities"] as List<IAbility>,
                args["spellModifier"] as Stat,
                args["temporaryHitPoints"] as Int,
                args["maxHitPoints"] as Int,
                args["currentHitPoints"] as Int,
                args["characterClass"] as String,
                args["characterSubclass"] as String,
                args["race"] as String,
                args["subrace"] as String,
                args["characterInventory "] as ICharacterInventory,
                args["inspiration"] as Boolean,
                args["inspirationDie"] as Int)
    }

    override fun createSpellCaster(args:  Map<String, Any>): ISpellcaster {
        return characterFactory.createSpellcaster(
                args["allStats"] as List<Stat>,
                args["level "] as Int,
                args["armorClass"] as Int,
                args["initiative"] as Int,
                args["speed"] as Int,
                args["swimmingSpeed"] as Int,
                args["flyingSpeed"] as Int,
                args["alignment"] as EAlignment,
                args["hitDiceCount"] as Int,
                args["currentHitDice"] as Int,
                args["name"] as String,
                args["description"] as String,
                args["traits"] as List<ITrait>,
                args["abilities"] as List<IAbility>,
                args["spellModifier"] as Stat,

                args["temporaryHitPoints"] as Int,
                args["maxHitPoints"] as Int,
                args["currentHitPoints"] as Int,

                args["characterClass"] as String,
                args["characterSubclass"] as String,

                args["race"] as String,
                args["subrace"] as String,

                args["personalityTraits"] as List<String>,
                args["ideals"] as List<String>,
                args["bonds"] as List<String>,
                args["flaws"] as List<String>,

                args["characterInventory "] as ICharacterInventory,

                args["spellsKnown"] as Int,
                args["cantripsKnown"] as Int,
                args["spellSlots"] as List<IPair<ESpellSlot, Int>>,
                args["spellPool"] as ISpellPool,
                args["inspiration"] as Boolean,
                args["inspirationDie"] as Int
        )
    }

    override fun getCharacterByName(characterList: List<ICharacter>, name: String): ICharacter {
        for (character in characterList) {
            if(character.name == name) {
                return character
            }
        }
        /** TODO: Exception */
        return characterList[0]
    }
}