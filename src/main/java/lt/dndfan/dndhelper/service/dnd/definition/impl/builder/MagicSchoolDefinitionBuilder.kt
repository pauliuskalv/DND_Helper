package lt.dndfan.dndhelper.service.dnd.definition.impl.builder

import lt.dndfan.dndhelper.bean.definition.information.MagicSchool
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilder
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilderService
import org.json.JSONObject
import org.springframework.stereotype.Service

@Service(DefinitionBuilderService.MAGIC_SCHOOL)
class MagicSchoolDefinitionBuilder : DefinitionBuilder<MagicSchool> {
    override fun build(obj: JSONObject): MagicSchool {
        val name = obj.getString("name")
        val description = obj.getString("desc")

        return MagicSchool(
                name,
                description
        )
    }
}