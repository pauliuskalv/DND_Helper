package lt.dndfan.dndhelper.util.gui.impl

import lt.dndfan.dndhelper.util.gui.IWindowPathResolver
import org.json.JSONArray
import org.json.JSONObject
import org.springframework.stereotype.Component

@Component
class WindowPathResolver : IWindowPathResolver {
    private var windowDefinitions : JSONArray = JSONArray(javaClass.getResource("/gui/names.config"))

    override fun resolveToPath(name: String) : String {
        return (windowDefinitions.find {
            s -> (s as JSONObject).getString("qualifier") == name
        } as JSONObject)["path"] as String
    }

    override fun resolveToWindowName(name: String): String {
        return (windowDefinitions.find {
            s -> (s as JSONObject).getString("qualifier") == name
        } as JSONObject)["name"] as String
    }
}