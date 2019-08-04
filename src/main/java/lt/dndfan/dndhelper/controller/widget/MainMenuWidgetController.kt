package lt.dndfan.dndhelper.controller.widget

import javafx.fxml.FXML
import javafx.scene.control.Label
import lt.dndfan.dndhelper.util.gui.IController
import org.springframework.beans.factory.config.BeanDefinition
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
class MainMenuWidgetController : IController {
    @FXML
    private lateinit var label : Label

    override fun setParameters(parameters: Map<String, Any>) {
        label.text = parameters["name"] as String
    }
}