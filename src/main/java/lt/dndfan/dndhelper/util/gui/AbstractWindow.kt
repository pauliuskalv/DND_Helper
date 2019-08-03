package lt.dndfan.dndhelper.util.gui

import javafx.stage.Stage

abstract class AbstractWindow : Stage() {
    private var params : Map<String, Any> =  HashMap()

    fun setParameters(parameters : Map<String, Any>) {
        params = parameters
    }
}