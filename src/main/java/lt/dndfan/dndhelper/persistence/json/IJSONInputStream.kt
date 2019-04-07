package lt.dndfan.dndhelper.persistence.json

interface IJSONInputStream {
    val filename : String

    fun open()
    fun close()

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

    /**
     * Returns the count of JSON objects in the file
     */
    fun getCount() : Int

    fun getIterator() : Iterator<Map<String, Any>>
}