package lt.dndfan.dndhelper.controller.widget

import javafx.fxml.FXML
import javafx.scene.control.Label
import javafx.scene.image.ImageView
import lt.dndfan.dndhelper.util.gui.IController
import lt.dndfan.dndhelper.util.gui.IPictureLoader
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.config.BeanDefinition
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
class MainMenuWidgetController : IController {
    @Autowired
    private lateinit var imageLoader : IPictureLoader

    @FXML
    private lateinit var image : ImageView

    @FXML
    private lateinit var characterNameLabel : Label
    @FXML
    private lateinit var classLabel : Label
    @FXML
    private lateinit var subclassLabel : Label

    override fun setParameters(parameters: Map<String, Any>) {
        characterNameLabel.text = parameters["name"] as String
        classLabel.text = parameters["class"] as String
        subclassLabel.text = parameters["subclass"] as String

        image.image = imageLoader.load(javaClass.getResource("/graphic/no_image.png"))
    }
}