package lt.dndfan.dndhelper.bean.dnd.character

import lt.dndfan.dndhelper.bean.dnd.constant.EStat

interface ICharacterClass {
    val name : String
    val description : String
    val hitDice : Int
    val savingThrows: List<EStat>
}