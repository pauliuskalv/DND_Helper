package lt.dndfan.dndhelper.service.dnd.character.overview.impl

import lt.dndfan.dndhelper.service.dnd.character.overview.ISingleListFacade

/**
 * Should provide list of equipped items with their respective categories.
 */

class Equipment (
        override val list : List<String>, override val title: String
) : ISingleListFacade
{}