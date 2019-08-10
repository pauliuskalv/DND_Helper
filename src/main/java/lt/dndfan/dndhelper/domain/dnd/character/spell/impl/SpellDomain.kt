package lt.dndfan.dndhelper.domain.dnd.character.spell.impl

import lt.dndfan.dndhelper.bean.dnd.ISpellcaster
import lt.dndfan.dndhelper.bean.dnd.constant.ESpellComponent
import lt.dndfan.dndhelper.bean.dnd.spell.ISpell
import lt.dndfan.dndhelper.domain.dnd.character.spell.ISpellDomain
import org.springframework.stereotype.Component

@Component
class SpellDomain : ISpellDomain {
    override fun addSpell(character: ISpellcaster, spell: ISpell): Boolean {
        return if(!character.spellPool.getAllSpells().contains(spell)) {
            character.spellPool.addSpell(spell)
            true
        }
        else {
            /** Exception here */
            false
        }
    }

    override fun removeSpell(character: ISpellcaster, spell: ISpell): Boolean {
        return if(character.spellPool.getAllSpells().contains(spell)) {
            character.spellPool.removeSpell(spell)
            true
        }
        else {
            /** Exception here */
            false
        }
    }

    override fun getSpellByName(spells: List<ISpell>, name: String): ISpell {
        for(spell in spells) {
            if(spell.spellName == name) {
                return spell
            }
        }
        /** Throw an exception here */
        return spells[0]
    }

    override fun getCharacterSpells(character: ISpellcaster): List<ISpell> {
        return character.spellPool.getAllSpells()
    }

    override fun getCharacterSpellNames(character: ISpellcaster): List<String> {
        return character.spellPool.getAllSpellNames()
    }

    override fun getPreparedSpells(character: ISpellcaster): List<ISpell> {
        return character.spellPool.getPreparedSpells()
    }

    override fun getKnownSpells(character: ISpellcaster): List<ISpell> {
        return character.spellPool.getAllSpells()
    }

    override fun getSpellsByName(spells: List<ISpell>, name: String): List<ISpell> {
        val matchedSpells = ArrayList<ISpell>()
        for (spell in spells) {
            /** Not sure about regex syntax */
            if(spell.spellName.contains("""*$name*""") ||
               spell.spellName.toLowerCase().contains("""*$name*""")) {
                matchedSpells.add(spell)
            }
        }
        return matchedSpells
    }

    override fun getSpellsBySpellLevel(spells: List<ISpell>, level: Int): List<ISpell> {
        val matchedSpells = ArrayList<ISpell>()
        for (spell in spells) {
            if(spell.spellLevel == level) {
                matchedSpells.add(spell)
            }
        }
        return matchedSpells
    }

    override fun getSpellsByDescription(spells: List<ISpell>, desc: String): List<ISpell> {
        val matchedSpells = ArrayList<ISpell>()
        for(spell in spells) {
            if(spell.spellName.contains("""*$desc*""") ||
                    spell.spellName.toLowerCase().contains("""*$desc*""")) {
                matchedSpells.add(spell)
            }
        }
        return matchedSpells
    }

    override fun getSpellsByComponent(spells: List<ISpell>, components: List<ESpellComponent>): List<ISpell> {
        val matchedSpells = ArrayList<ISpell>()
        for (spell in spells) {
            /** until == components.size - 1 */
            for (i in 0 until components.size) {
                if(spell.components.contains(components[i]) &&
                        !matchedSpells.contains(spell)) {
                    matchedSpells.add(spell)
                }
            }
        }
        return matchedSpells
    }

    override fun isValid(character: ISpellcaster, spell: ISpell): Boolean {
        if(spell.validClass.contains(character.characterClass) ||
                spell.validSubclass.contains(character.characterSubclass)) {
            return true
        }
        return false
    }
}