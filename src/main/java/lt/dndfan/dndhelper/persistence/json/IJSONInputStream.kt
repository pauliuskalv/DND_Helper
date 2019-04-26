package lt.dndfan.dndhelper.persistence.json

interface IJSONInputStream {
    val filename : String
    val size: Int

    /**
     * Reads everything in a JSON file and converts
     * it to a map list
     */
    fun read() : List<Map<String, Any>>

    /**
     * Reads a JSON object at a specified index
     * and converts it to a map
     */
    fun readAt(index : Int) : Map<String, Any>
}