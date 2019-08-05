package lt.dndfan.dndhelper.util.gui

import javafx.scene.Parent

interface IWidgetFactory {
    /**
     * Constructs the widget using the passed parameters
     * and returns it as Parent
     */
    fun construct(widgetName : String, parameters : Map<String, Any>) : Parent
}