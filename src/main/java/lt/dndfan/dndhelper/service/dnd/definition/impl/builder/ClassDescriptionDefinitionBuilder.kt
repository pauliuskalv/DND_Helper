package lt.dndfan.dndhelper.service.dnd.definition.impl.builder

import lt.dndfan.dndhelper.bean.definition.characterclass.ClassDescription
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilder
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilderService
import org.json.JSONObject
import org.springframework.stereotype.Service

@Service(DefinitionBuilderService.CLASS_DESCRIPTION)
class ClassDescriptionDefinitionBuilder : DefinitionBuilder<ClassDescription> {
    override fun build(obj: JSONObject): ClassDescription {
        val name = obj.getString("name")
        val desc = obj.getString("desc")

        return ClassDescription(
                name,
                desc
        )
    }
}