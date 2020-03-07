package lt.dndfan.dndhelper.session.dnd.character.creation.impl

import lt.dndfan.dndhelper.session.dnd.character.creation.IDualTableChooser

/**
 * This should be facade used in character creation when choosing character class and subclass.
 */

class ClassChooser(override val choiceTable: ArrayList<Any>,
                   override val chosenTable: ArrayList<Any>,
                   override val selectableObjects: Int) : IDualTableChooser() {
    override fun applyChanges() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}