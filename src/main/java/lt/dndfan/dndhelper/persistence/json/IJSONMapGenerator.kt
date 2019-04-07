package lt.dndfan.dndhelper.persistence.json

import org.json.JSONObject

interface IJSONMapGenerator {
    fun convert(obj : JSONObject) : Map<String, Any>
}