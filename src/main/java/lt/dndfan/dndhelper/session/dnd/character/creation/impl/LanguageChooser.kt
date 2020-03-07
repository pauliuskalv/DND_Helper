package lt.dndfan.dndhelper.facade.dnd.character.creation.impl

import lt.dndfan.dndhelper.facade.dnd.character.creation.IDualTableChooser

/**
 * Language chooser should probably be dual table one since in most cases characters know more than one language.
 */

class LanguageChooser(override val choiceTable: ArrayList<Any>,
                      override val chosenTable: ArrayList<Any>,
                      override val selectableObjects: Int) : IDualTableChooser() {
    override fun applyChanges() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}