package lt.dndfan.dndhelper.session.dnd.subfacade

import lt.dndfan.dndhelper.domain.dnd.character.ICharacterDomain

/**
 * Consider changing the name of this interface.
 * Should be used for submenu dialogs that provide more info on certain item.
 */

interface ISubWindow {
    /** Window name */
    val name : String
    /** Text in the text box. Should be object info or description. */
    val description : String
}