package lt.dndfan.dndhelper.util.gui.impl

import lt.dndfan.dndhelper.util.gui.IWidgetPathResolver
import org.json.JSONArray
import org.json.JSONObject
import org.springframework.stereotype.Component

@Component
class WidgetPathResolver : IWidgetPathResolver {
    private var windowDefinitions : JSONArray = JSONArray(javaClass.getResource("/gui/widgets.config").readText())

    override fun resolveByName(name: String): String {
        return (windowDefinitions.find {
            s -> (s as JSONObject).getString("qualifier") == name
        } as JSONObject)["path"] as String
    }
}