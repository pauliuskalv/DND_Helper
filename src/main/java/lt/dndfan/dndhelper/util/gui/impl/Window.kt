package lt.dndfan.dndhelper.util.gui.impl

import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage
import lt.dndfan.dndhelper.util.gui.IController
import lt.dndfan.dndhelper.util.gui.IWindow

class Window(mainLayout : Parent) : IWindow, Stage() {
    private lateinit var params : Map<String, Any>
    private lateinit var controller : IController

    init {
        scene = Scene(mainLayout)
    }

    override fun setParameters(parameters : Map<String, Any>) {
        params = parameters
    }

    override fun setController(controller: IController) {
        this.controller = controller
    }

    override fun getController() : IController = controller

    /**
     * Decorator method for Stage.show()
     */
    override fun render() {
        parseArguments()

        show()
    }

    /**
     * Decorator method for Stage.showAndWait()
     */
    override fun renderAndWait() {
        parseArguments()

        showAndWait()
    }

    override fun close() = super.close()

    private fun parseArguments() {
        if (params.containsKey("title"))
            this.title = params["title"].toString()

        if (params.containsKey("height"))
            this.height = params["height"].toString().toDouble()
        if (params.containsKey("width"))
            this.width = params["width"].toString().toDouble()

        if (params.containsKey("min_height"))
            this.minHeight = params["min_height"].toString().toDouble()
        if (params.containsKey("min_width"))
            this.minWidth = params["min_width"].toString().toDouble()

        // TODO: Parse more arguments
    }
}