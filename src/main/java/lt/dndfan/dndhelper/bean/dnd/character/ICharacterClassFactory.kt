package lt.dndfan.dndhelper.bean.dnd.character

interface ICharacterClassFactory {
    fun createCharacterClass( name : String,
                              description : String,
                              hitDice : Int,
                              savingThrows : List<String>
    ) : ICharacterClass
}