package lt.dndfan.dndhelper.facade.dnd.character.overview

/**
 * A facade used to display text in a main single list format with possible additions.
 * Consider adding facadeName field.
 */

interface ISingleListFacade {
    val title : String
    val list : List<String>
}