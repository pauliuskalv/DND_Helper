package lt.dndfan.dndhelper.bean.dnd.spell


interface IMagicSchoolFactory {
    fun createMagicSchool(name : String,
                  description : String) : IMagicSchool
}