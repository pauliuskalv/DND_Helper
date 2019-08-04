package lt.dndfan.dndhelper.controller.window

import javafx.application.Platform
import javafx.fxml.FXML
import javafx.scene.layout.Priority
import javafx.scene.layout.VBox
import lt.dndfan.dndhelper.util.gui.IController
import lt.dndfan.dndhelper.util.gui.IWidgetFactory
import lt.dndfan.dndhelper.util.gui.impl.BaseWidgetFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class MainMenuController : IController {
    @FXML
    private lateinit var listLayout : VBox

    @Autowired
    private lateinit var listMenuItemFactory : IWidgetFactory

    init {
        Platform.runLater {
            for (i in 1 .. 5) {
                val args = HashMap<String, Any>()

                args["name"] = "test $i"

                val widget = listMenuItemFactory.construct("main_menu_widget", args)
                listLayout.children.add(widget)
            }
        }
    }

    override fun setParameters(parameters: Map<String, Any>) {
        // TODO: If exists, parse existing characters
    }
}