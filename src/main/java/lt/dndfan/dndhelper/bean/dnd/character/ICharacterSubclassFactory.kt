package lt.dndfan.dndhelper.bean.dnd.character

import lt.dndfan.dndhelper.bean.dnd.character.impl.CharacterSubclass
import lt.dndfan.dndhelper.bean.dnd.feature.ITrait
import lt.dndfan.dndhelper.bean.dnd.feature.impl.Trait

interface ICharacterSubclassFactory {
    fun createCharacterSubclass  ( name : String,
                                   description : String,
                                   characterClass : String,
                                   flavor : String,
                                   traits : List<ITrait>
    ) : ICharacterSubclass
}