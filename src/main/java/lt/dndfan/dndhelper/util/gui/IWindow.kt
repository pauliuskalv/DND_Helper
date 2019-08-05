package lt.dndfan.dndhelper.util.gui

interface IWindow {
    fun setParameters(parameters : Map<String, Any>)

    fun setController(controller : IController)
    fun getController() : IController

    fun render()
    fun renderAndWait()

    fun close()
}