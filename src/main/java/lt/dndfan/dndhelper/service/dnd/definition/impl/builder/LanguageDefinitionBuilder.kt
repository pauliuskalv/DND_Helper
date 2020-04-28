package lt.dndfan.dndhelper.service.dnd.definition.impl.builder

import lt.dndfan.dndhelper.bean.definition.information.Language
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilder
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilderService
import org.json.JSONObject
import org.springframework.stereotype.Service
import java.util.*

@Service(DefinitionBuilderService.LANGUAGE)
class LanguageDefinitionBuilder : DefinitionBuilder<Language> {
    override fun build(obj: JSONObject): Language {
        val name = obj.getString("name")
        val type = obj.getString("type")
        val script = obj.getString("script")

        val speakers = LinkedList<String>()
        val speakerDefinition = obj.getJSONArray("typical_speakers")
        for (speaker in speakerDefinition.iterator()) {
            speakers.add(speaker as String)
        }

        return Language(
                name,
                type,
                speakers,
                script
        )
    }
}