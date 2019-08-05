package lt.dndfan.dndhelper.util.gui.impl

import javafx.scene.image.Image
import lt.dndfan.dndhelper.util.gui.IPictureLoader
import org.springframework.stereotype.Component
import java.io.File
import java.net.URL

@Component
class PictureLoader : IPictureLoader {
    private val defaultImagePath : String = "/graphic/no_image.png"

    override fun load(url: URL): Image {
        // If image does not exist, load up a default image instead
        if (!File(url.toURI()).exists())
            return Image(javaClass.getResource(defaultImagePath).openStream())

        return Image(url.openStream())
    }
}