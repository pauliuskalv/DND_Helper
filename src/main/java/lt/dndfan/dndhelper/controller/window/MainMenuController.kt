package lt.dndfan.dndhelper.controller.window

import javafx.application.Platform
import javafx.fxml.FXML
import javafx.scene.layout.TilePane
import lt.dndfan.dndhelper.util.gui.IController
import lt.dndfan.dndhelper.util.gui.IWidgetFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class MainMenuController : IController {
    @FXML
    private lateinit var listLayout : TilePane

    @Autowired
    private lateinit var listMenuItemFactory : IWidgetFactory

    init {
        Platform.runLater {
            for (i in 1 .. 8) {
                val args = HashMap<String, Any>()

                args["name"] = "test $i"
                args["class"] = "Cleric"
                args["subclass"] = "Life"

                val widget = listMenuItemFactory.construct("main_menu_widget", args)
                listLayout.children.add(widget)
            }
        }
    }

    override fun setParameters(parameters: Map<String, Any>) {
        // TODO: If exists, parse existing characters
    }
}