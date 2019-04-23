package lt.dndfan.dndhelper.persistence.json.impl

import jdk.nashorn.internal.parser.JSONParser
import jdk.nashorn.internal.runtime.Context
import lt.dndfan.dndhelper.persistence.json.IJSONInputStream
import org.json.JSONArray
import org.json.JSONObject
import java.io.FileInputStream


class JSONFileInputStream(
        override val filename: String
) : IJSONInputStream {

    var opened = false
    val jsonParser = JSONParser(filename, Context.getGlobal(), false)

    fun JSONFileInputStream(fileName : String) {

    }

    override fun open() {
        if(!opened)
            // should probably change name from open to available
            // since json parser opens the file in constructor
            if(FileInputStream(filename).available() > 0)
                opened = true
        // exception?
    }

    override fun close() {
        if(opened)
            opened = false
    }

    override fun read(): List<Map<String, Any>> {
        if(opened) {
            val jsonArray : JSONArray
            // unsure if cast is going to work
            jsonArray = jsonParser.parse() as JSONArray

            // very unsure if this cast is going to work
            // consider separating JSONArray into JSONObjects and then casting them
            return jsonArray as List<Map<String,Any>>
        }
        else
        return emptyList()
    }

    override fun readAt(index: Int): Map<String, Any> {
        if(opened) {
            val map : MutableMap<String,Any>
            val jsonArray : JSONArray
            jsonArray = jsonParser.parse() as JSONArray

            val jsonObject = jsonArray.get(index)

            return jsonObject as Map<String,Any>
        }
        else
            return emptyMap()
    }

    override fun getCount(): Int {
        // return the remaining bytes in the stream
        // there should be a better way to implement this
        if(opened)
            return FileInputStream(filename).available()
        return 0
    }

    override fun getIterator(): Iterator<Map<String, Any>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
