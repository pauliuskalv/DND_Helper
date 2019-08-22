package lt.dndfan.dndhelper

import javafx.application.Application
import javafx.stage.Stage
import lt.dndfan.dndhelper.util.gui.IWindowLoader
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

fun main(args: Array<String>) {
    Application.launch(MainWindow().javaClass, *args)
}

@Component
class MainWindow : Application() {
    @Autowired
    private lateinit var windowLoader : IWindowLoader

    @Throws(Exception::class)
    override fun start(primaryStage: Stage) {
        val context = AnnotationConfigApplicationContext()
        context.register(AppConfig::class.java)
        context.refresh()
    }

    @PostConstruct
    private fun postConstructApplication() {
        windowLoader.getWindow("main_menu").render()
    }
}