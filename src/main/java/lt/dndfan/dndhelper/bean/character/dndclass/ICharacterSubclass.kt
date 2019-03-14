package lt.dndfan.dndhelper.bean.character.dndclass

interface ICharacterSubclass {
    /*
        Not sure if this is a right way to do subclasses
    */
    val name : String
    val description : String
    val characterClass: String      // this could be CharacterClass object
    val flavor: String
}