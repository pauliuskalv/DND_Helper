package lt.dndfan.dndhelper.util.gui.impl

import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.stage.Stage
import javafx.util.Callback
import lt.dndfan.dndhelper.util.gui.IController
import lt.dndfan.dndhelper.util.gui.IWindow
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

    override fun getWindow(name: String): IWindow {
        val window = createWindowFromPath(resolver.resolveToPath(name))

        // Get default parameters for window from resolver
        val args = HashMap<String, Any>()

        args["title"] = resolver.resolveToWindowTitle(name)
        args["width"] = resolver.resolveToWindowWidth(name)
        args["height"] = resolver.resolveToMinWindowHeight(name)
        args["min_width"] = resolver.resolveToMinWindowWidth(name)
        args["min_height"] = resolver.resolveToMinWindowHeight(name)

        window.setParameters(args)

        return window
    }

    override fun getWindow(name: String, parameters: Map<String, Any>): IWindow {
        val window = createWindowFromPath(resolver.resolveToPath(name))
        window.setParameters(parameters)

        return window
    }

    private fun createWindowFromPath(path : String) : Window {
        val loader = createFXMLLoader(path)
        val layout = loader.load<Parent>(javaClass.getResource(path).openStream())
        val window = Window(layout)

        window.setController(loader.getController() as IController)

        return window
    }

    private fun createFXMLLoader(path : String) : FXMLLoader {
        val loader = FXMLLoader(javaClass.getResource(path))
        loader.controllerFactory = Callback<Class<*>, Any> { context.getBean(it) }

        return loader
    }
}