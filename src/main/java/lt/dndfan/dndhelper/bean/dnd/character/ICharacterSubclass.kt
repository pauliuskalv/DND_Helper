package lt.dndfan.dndhelper.bean.dnd.character

import lt.dndfan.dndhelper.bean.dnd.feature.ITrait

interface ICharacterSubclass {
    /**
     *  Subclasses also may offer spells, but that should be handled in facade package?
     */
    val name : String
    val description : String
    val characterClass: String
    /** e.g. divine domain, bard college... */
    val flavor: String
    val traits: List<ITrait>
}