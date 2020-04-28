package lt.dndfan.dndhelper.service.dnd.character.creation

/**
 * Used for spell or, maybe, starting items choosers.
 * Not sure if implementing the transfer functions here is a good idea.
 */

abstract class IDualTableChooser {

    /** Table of possible object choices */
    abstract val choiceTable : ArrayList<Any>
    /** Table of chosen objects */
    abstract val chosenTable : ArrayList<Any>
    /** Number of items that can be added to the chosenTable */
    abstract val selectableObjects : Int

    /**
     * Transfer the selected object from choices to the desired choices table.
     * That means remove from one table and add it to the other one.
     */
    private fun transferToChosen(transferee : Any) {
        if(canTransferToChosen(transferee)) {
            chosenTable.add(transferee)
            choiceTable.remove(transferee)
        }
    }

    private fun transferToChoices(transferee : Any)  {
        if(canTransferFromChoices(transferee)) {
            choiceTable.add(transferee)
            chosenTable.remove(transferee)
        }
    }

    /**
     * Check if the transfer is allowed.
     * Can not transfer when selectable object limit is reached.
     */
    private fun canTransferToChosen(transferee : Any) : Boolean {
        if(choiceTable.contains(transferee) &&
                !chosenTable.contains(transferee) &&
                 chosenTable.size < selectableObjects) {
                return true
        }
        return false
    }

    /** There is no limit of objects in the choice list */
    private fun canTransferFromChoices(transferee: Any) : Boolean {
        if(chosenTable.contains(transferee) &&
                !choiceTable.contains(transferee)) {
                return true
        }
        return false
    }

    /**
     * Is the correct number of objects selected?
     * It is needed in cases where to few objects are selected
     */
    fun canApply() : Boolean {
        if(chosenTable.size == selectableObjects)
            return true
        return false
    }

    fun transfer(transferee : Any) {
        /** The object is in choices */
        if(canTransferToChosen(transferee)) {
            transferToChosen(transferee)
        }
        /** Technically this check should not be needed */
        if(canTransferFromChoices(transferee)) {
            transferToChoices(transferee)
        }
    }

    /**
     * Function that is called to apply the objects from the chosenTable to the playableCharacter.
     * Should call canApply().
     * Should call addSpell from domain package for example.
     */
    abstract fun applyChanges()
}