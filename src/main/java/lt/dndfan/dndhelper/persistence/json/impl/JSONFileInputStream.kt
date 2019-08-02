package lt.dndfan.dndhelper.persistence.json.impl


import lt.dndfan.dndhelper.persistence.json.IJSONInputStream
import org.json.JSONArray
import org.json.JSONObject
import com.google.common.io.Resources
import java.nio.charset.Charset


class JSONFileInputStream(
        override val filename: String
) : IJSONInputStream {
    lateinit var jsonData: JSONArray

    override val size: Int
        get() = jsonData.length()

    fun JSONFileInputStream(fileName : String) {
        jsonData = JSONArray(
                Resources.toString(
                        Resources.getResource(fileName), Charset.defaultCharset()
                )
        )
    }

    override fun read(): List<Map<String, Any>> {
        val args = ArrayList<Map<String, Any>>()
        for (i in 0..jsonData.length()) {
            args[i] = parseObject(jsonData[i] as Any, jsonData.optString(i))
        }

        return args
    }

    override fun readAt(index: Int): Map<String, Any> {
        return parseObject(jsonData[index], jsonData.optString(index))
    }

    private fun parseObject(obj: Any, key: String): Map<String, Any> {
        val map = HashMap<String, Any>()

        if (obj is JSONArray) {
            val propertyMap = ArrayList<Any>()

            parseJSON(propertyMap, obj)

            map[key] = propertyMap
        }

        if (obj is JSONObject) {
            val propertyMap = HashMap<String, Any>()

            parseJSON(propertyMap, obj)

            map[key] = propertyMap
        }

        return map
    }

    private fun parseJSON(list: ArrayList<Any>, obj: JSONArray) {
        for (i in 0..obj.length()) {
            list.add(parseObject(obj[i] as Any, obj.optString(i)))
        }
    }

    private fun parseJSON(map: HashMap<String, Any>, obj: JSONObject) {
        for (key in obj.keys()) {
            if (obj[key] is JSONArray) {
                val newList = ArrayList<Any>()

                parseJSON(newList, obj[key] as JSONArray)

                map[key] = newList
            } else
                map[key] = obj[key].toString()
        }
    }
}
