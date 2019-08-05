package lt.dndfan.dndhelper.util.gui.impl

import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.util.Callback
import lt.dndfan.dndhelper.util.gui.IController
import lt.dndfan.dndhelper.util.gui.IWidgetFactory
import lt.dndfan.dndhelper.util.gui.IWidgetPathResolver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.support.GenericApplicationContext
import org.springframework.stereotype.Component

@Component
class BaseWidgetFactory : IWidgetFactory {
    /**
     * Used for binding JavaFX to Spring
     */
    @Autowired
    private lateinit var context : GenericApplicationContext
    @Autowired
    private lateinit var resolver : IWidgetPathResolver

    override fun construct(widgetName : String, parameters: Map<String, Any>): Parent {
        val loader = getFXMLLoader(resolver.resolveByName(widgetName))
        val root = loader.load<Parent>()

        // Pass arguments to widget
        val controller = loader.getController<IController>()
        controller.setParameters(parameters)

        return root
    }

    private fun getFXMLLoader(path : String) : FXMLLoader {
        val loader = FXMLLoader(javaClass.getResource(path))
        loader.controllerFactory = Callback<Class<*>, Any> { context.getBean(it) }

        return loader
    }
}