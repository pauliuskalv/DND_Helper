package lt.dndfan.dndhelper.util.gui

interface IWindowPathResolver {
    fun resolveToPath(name : String) : String
    fun resolveToWindowName(name : String) : String
    fun resolveToWindowWidth(name : String) : Double
    fun resolveToWindowHeight(name : String) : Double
}