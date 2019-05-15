package lt.dndfan.dndhelper.bean.dnd.character

interface ICharacterClass {
    val name : String
    val description : String
    /**
     * A size of the character`s hit die (12, 10, 8, 6...)
     */
    val hitDice : Int
    /**
     * Saving throws that the character will be proficient in.
     */
    val savingThrows: List<String>
}