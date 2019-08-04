package lt.dndfan.dndhelper

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.stage.Stage
import javafx.scene.Scene
import javafx.util.Callback
import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main(args: Array<String>) {
    Application.launch(*args)
}

class MainWindow : Application() {
    @Throws(Exception::class)
    override fun start(primaryStage: Stage) {
        val context = AnnotationConfigApplicationContext()
        context.register(AppConfig::class.java)
        context.refresh()

        // Hook OpenJFX to Spring and load main window
        val loader = FXMLLoader(context.javaClass.getResource("/gui/MainMenu.fxml"))
        loader.controllerFactory = Callback<Class<*>, Any> { context.getBean(it) }

        primaryStage.scene = Scene(loader.load<Parent>())

        primaryStage.width = 600.toDouble()
        primaryStage.height = 400.toDouble()

        primaryStage.show()
    }
}