package lt.dndfan.dndhelper.util.gui

interface IWindowLoader {
    fun getWindow(name : String) : AbstractWindow
    fun getWindow(name : String, parameters : Map<String, Any>) : AbstractWindow
}