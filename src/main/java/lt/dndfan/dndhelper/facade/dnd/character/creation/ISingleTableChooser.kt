package lt.dndfan.dndhelper.facade.dnd.character.creation

/**
 * Standard chooser of a single item from a list.
 */

interface ISingleTableChooser {

    /** List that is going to be used to populate the table */
    val choiceTable : List<Any>
    /** The selected item */
    var selectedObject : Any

    /**
     * Consider finding a better name for "selected".
     * Can not be object, toBeSelected is too verbose.
     */
    fun selectObject(selected: Any) {
        if(choiceTable.contains(selected)) {
            selectedObject = selected
        }
    }

    /** Check if any object is selected */
    fun canApply() : Boolean {
        if(choiceTable.contains(selectedObject)) {
            return true
        }
        return false
    }

    /** Override */
    fun applyChanges()
}