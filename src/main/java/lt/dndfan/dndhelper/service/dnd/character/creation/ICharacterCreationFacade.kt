package lt.dndfan.dndhelper.service.dnd.character.creation

import lt.dndfan.dndhelper.bean.dnd.ICharacter
import lt.dndfan.dndhelper.bean.dnd.IPlayableCharacter

interface ICharacterCreationFacade {
    fun getNewCharacter() : ICharacter
    fun getNewPlayableCharacter() : IPlayableCharacter
}