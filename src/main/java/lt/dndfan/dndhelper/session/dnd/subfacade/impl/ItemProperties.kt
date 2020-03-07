package lt.dndfan.dndhelper.facade.dnd.subfacade.impl

import lt.dndfan.dndhelper.facade.dnd.subfacade.ISubWindow

/**
 * Probably responsible for dialog that opens when user needs more information about an item
 */

class ItemProperties(override val name: String,
                     override val description: String) : ISubWindow {
}