package lt.dndfan.dndhelper.service.dnd.definition.impl

import lt.dndfan.dndhelper.bean.definition.BaseDefinition
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilder
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBundle
import org.json.JSONArray
import org.json.JSONObject
import java.util.*
import javax.annotation.PostConstruct

abstract class AbstractDefinitionBundle<T : BaseDefinition>(
        val filePath : String,
        val builder : DefinitionBuilder<T>
) : DefinitionBundle<T> {
    private var entities : LinkedList<T> = LinkedList()

    override fun getEntity(name : String) = entities.first { e -> e.name == name }
    override fun getMultipleEntities(name : String) = entities.filter { e -> e.name == name }

    @PostConstruct
    private fun postConstruct() {
        val data = JSONArray(String(javaClass.getResourceAsStream("/definitions/${filePath}").readAllBytes()))

        for (obj in data.iterator()) {
            entities.add(builder.build(obj as JSONObject))
        }
    }
}