package lt.dndfan.dndhelper.session.dnd.character.creation.impl

import lt.dndfan.dndhelper.session.dnd.character.creation.IDualTableChooser

/**
 * Every facet of character`s personality (flaw, bond, background...) should be split up into separate facades.
 * Facade providing the info required to choose a character`s personality when creating character.
 */

class PersonalityChooser(override val choiceTable: ArrayList<Any>,
                         override val chosenTable: ArrayList<Any>,
                         override val selectableObjects: Int) : IDualTableChooser() {
    override fun applyChanges() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}