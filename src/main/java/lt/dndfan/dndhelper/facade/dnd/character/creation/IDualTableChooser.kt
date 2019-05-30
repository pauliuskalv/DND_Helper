package lt.dndfan.dndhelper.facade.dnd.character.creation

/**
 * Used for spell or, maybe, starting items choosers.
 */

interface IDualTableChooser {

    /** Table of possible object choices */
    val choiceTable : List<Any>
    /** Table of chosen objects */
    val chosenTable : List<Any>
    /** Number of items that can be added to the chosenTable */
    val selectableObjects : Int

    /**
     * Transfer the seleceted object to the other table.
     * That means remove from one table and add it to the other one.
     */
    fun transfer(transferee : Any)
    /**
     * Check if the transfer is allowed .
     * Can not transfer when selectable object limit is reached
     */
    fun canTransfer(transferee : Any) : Boolean

    /**
     * Function that is called to apply the objects from the chosenTable to the playableCharacter.
     * Not sure if this is the best way to do that.
     */
    fun applyChanges()

    /**
     * Is it possible to continue?
     */
    fun canApply() : Boolean
}