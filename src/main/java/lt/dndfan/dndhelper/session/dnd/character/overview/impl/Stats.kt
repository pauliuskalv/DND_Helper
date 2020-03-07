package lt.dndfan.dndhelper.facade.dnd.character.overview.impl

import lt.dndfan.dndhelper.bean.dnd.stats.IStat
import lt.dndfan.dndhelper.facade.dnd.character.overview.ISingleListFacade

/**
 * Should probably be responsible for encompassing everything from bean/impl/PlayableCharacter.kt
 * Stat points, hp, speed, weight(this one maybe in separate facade)
 */

class Stats (
        override val list : List<String>,
        override val title: String
) : ISingleListFacade