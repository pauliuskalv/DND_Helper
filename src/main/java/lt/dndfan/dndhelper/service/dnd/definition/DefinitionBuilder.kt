package lt.dndfan.dndhelper.service.dnd.definition

import lt.dndfan.dndhelper.bean.definition.BaseDefinition
import org.json.JSONObject

interface DefinitionBuilder<T : BaseDefinition> {
    fun build(obj : JSONObject) : T
}