package lt.dndfan.dndhelper.facade.dnd.character.overview.impl

import lt.dndfan.dndhelper.bean.dnd.stats.IStat

/**
 * Should probably be responsible for encompassing everything from bean/impl/PlayableCharacter.kt
 * Stat points, hp, speed, weight(this one maybe in separate facade)
 */

interface IStats {
    val statList : List<IStat>
}