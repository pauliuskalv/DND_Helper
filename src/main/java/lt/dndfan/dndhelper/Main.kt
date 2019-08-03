package lt.dndfan.dndhelper

import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage
import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main() {
    val context = AnnotationConfigApplicationContext()
    context.register(AppConfig::class.java)
    context.refresh()

    // Hook OpenJFX to Spring and load main window
    // TODO: Input primary window path
    val loader = FXMLLoader(context.javaClass.getResource(""))
    loader.setControllerFactory(context::getBean)
    val root = loader.load<Parent>()

    val stage = Stage()
    stage.scene = Scene(root)

    stage.width = 1280.toDouble()
    stage.height = 720.toDouble()

    stage.showAndWait()
}