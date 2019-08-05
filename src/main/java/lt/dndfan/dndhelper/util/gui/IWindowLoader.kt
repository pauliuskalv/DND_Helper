package lt.dndfan.dndhelper.util.gui

interface IWindowLoader {
    fun getWindow(name : String) : IWindow
    fun getWindow(name : String, parameters : Map<String, Any>) : IWindow
}