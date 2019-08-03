package lt.dndfan.dndhelper.util.gui

import javafx.scene.Parent

interface IWidgetFactory {
    fun constructWidget(parameters : Map<String, Any>) : Parent
}