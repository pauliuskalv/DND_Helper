package lt.dndfan.dndhelper.bean.dnd.character

import lt.dndfan.dndhelper.bean.dnd.feature.ITrait

interface ICharacterSubclass {
    val name : String
    val description : String
    val characterClass: String
    val flavor: String          // e.g. divine domain; bard college;
    val traits: List<ITrait>
    // subclasses also may offer spells, but that should be handled in facade package
}