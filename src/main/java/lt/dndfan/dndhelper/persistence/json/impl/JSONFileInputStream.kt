package lt.dndfan.dndhelper.persistence.json.impl

import lt.dndfan.dndhelper.persistence.json.IJSONInputStream
import java.io.FileInputStream

class JSONFileInputStream(
        override val filename: String
) : IJSONInputStream {
    fun JSONFileInputStream(fileName : String) {

    }

    override fun open() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun close() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun read(): List<Map<String, Any>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun readAt(index: Int): Map<String, Any> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getIterator(): Iterator<Map<String, Any>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}