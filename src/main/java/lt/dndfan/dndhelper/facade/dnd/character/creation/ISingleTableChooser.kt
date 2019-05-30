package lt.dndfan.dndhelper.facade.dnd.character.creation

/**
 * Standard chooser of a single item from a list.
 */

interface ISingleTableChooser {

    /** List that is going to be used to populate the table */
    val choiceTable : List<Any>
    /** The selected item */
    val selectedObject : Any

    /** Not sure if this is the best way to apply the changes */
    fun applyChanges()
    /** Check if any object is selected */
    fun canApply() : Boolean
}