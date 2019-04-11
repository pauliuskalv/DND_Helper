package lt.dndfan.dndhelper.persistence.json.impl

import lt.dndfan.dndhelper.persistence.json.IJSONInputStream
import org.json.JSONArray
import org.json.JSONObject
import java.io.FileInputStream


class JSONFileInputStream(
        override val filename: String
) : IJSONInputStream {

    var fileInputStream = FileInputStream("")
    var opened = false

    fun JSONFileInputStream(fileName : String) {

    }

    override fun open() {
        if(!opened)
            fileInputStream = FileInputStream(filename)
            opened = true
        // exception
    }

    override fun close() {
        if(opened)
            fileInputStream.close()
            opened = false
        // exception
    }

    override fun read(): List<Map<String, Any>> {
        if(opened) {
            val mapList: MutableList<Map<String, Any>> = ArrayList()
            val jsonArray = (fileInputStream.read() as JSONArray)

            mapList.addAll(jsonArray as List<Map<String,Any>>)

            return mapList
        }
        else
        return emptyList()
    }

    override fun readAt(index: Int): Map<String, Any> {
        if(opened) {
            val map : MutableMap<String,Any>
            val jsonArray = (fileInputStream.read() as JSONArray)
            val jsonObject = jsonArray.get(index)

            return jsonObject as Map<String,Any>
        }
        else
            return emptyMap()
    }

    override fun getCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getIterator(): Iterator<Map<String, Any>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}