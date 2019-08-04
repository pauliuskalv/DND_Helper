package lt.dndfan.dndhelper.util.gui.impl

import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import lt.dndfan.dndhelper.util.gui.IController
import lt.dndfan.dndhelper.util.gui.IWindowLoader
import lt.dndfan.dndhelper.util.gui.IWindowPathResolver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.support.GenericApplicationContext
import org.springframework.stereotype.Component

@Component
class WindowLoader : IWindowLoader {
    @Autowired
    private lateinit var context : GenericApplicationContext
    @Autowired
    private lateinit var resolver : IWindowPathResolver

    private val loader : FXMLLoader = FXMLLoader()

    init {
        loader.setControllerFactory { context }
    }

    override fun getWindow(name: String): Window {
        return createWindowFromPath(resolver.resolveToPath(name))
    }

    override fun getWindow(name: String, parameters: Map<String, Any>): Window {
        val window = createWindowFromPath(resolver.resolveToPath(name))
        window.setParameters(parameters)

        return window
    }

    private fun createWindowFromPath(path : String) : Window {
        val layout = loader.load<Parent>(javaClass.getResource(path).openStream())
        val window = Window(layout)

        window.setController(loader.getController() as IController)

        return window
    }
}