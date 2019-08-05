package lt.dndfan.dndhelper.facade.dnd.character.creation.impl

import lt.dndfan.dndhelper.facade.dnd.character.creation.IDualTableChooser

/**
 * This should be responsible for providing the skills that the character will choose to be proficient in.
 * This should be dual table chooser, because characters learn more than a single skill at a time in most cases.
 */

class SkillChooser(override val choiceTable: ArrayList<Any>,
                   override val chosenTable: ArrayList<Any>,
                   override val selectableObjects: Int) : IDualTableChooser() {
    override fun applyChanges() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}