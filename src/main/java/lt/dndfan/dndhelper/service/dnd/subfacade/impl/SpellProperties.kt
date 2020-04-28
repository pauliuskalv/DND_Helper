package lt.dndfan.dndhelper.service.dnd.subfacade.impl

import lt.dndfan.dndhelper.service.dnd.subfacade.ISubWindow

/**
 * Should be responsible for dialog that opens when user needs more information about a spell.
 * Not sure if it should contain a spell object or just some strings from spell object.
 */

class SpellProperties(override val name: String,
                      override val description: String) : ISubWindow {
}