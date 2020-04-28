package lt.dndfan.dndhelper.service.dnd.definition

interface DefinitionBundle<T> {
    fun getEntity(name : String) : T
    fun getMultipleEntities(name : String) : Collection<T>
}