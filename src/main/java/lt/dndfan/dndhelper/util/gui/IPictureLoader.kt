package lt.dndfan.dndhelper.util.gui

import javafx.scene.image.Image
import java.net.URL

interface IPictureLoader {
    fun load(url : URL) : Image
}