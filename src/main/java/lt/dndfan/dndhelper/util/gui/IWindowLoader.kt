package lt.dndfan.dndhelper.util.gui

import lt.dndfan.dndhelper.util.gui.impl.Window

interface IWindowLoader {
    fun getWindow(name : String) : Window
    fun getWindow(name : String, parameters : Map<String, Any>) : Window
}