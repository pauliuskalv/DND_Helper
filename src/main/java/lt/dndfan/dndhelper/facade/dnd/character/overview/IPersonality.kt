package lt.dndfan.dndhelper.facade.dnd.character.overview

import lt.dndfan.dndhelper.bean.dnd.constant.EAlignment

/**
 * TODO: Change this to class or figure out how to implement personality facade.
 * Should provide character alignment, character traits and character background.
 */

interface IPersonality {
    val alignment : EAlignment
    val personalityTraits : List<String>
    val ideals : List<String>
    val bonds : List<String>
    val flaws : List<String>
}