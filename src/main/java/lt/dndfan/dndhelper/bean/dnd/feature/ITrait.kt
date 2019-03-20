package lt.dndfan.dndhelper.bean.dnd.feature

interface ITrait {
    /*
        Character property that is not a feature.
        Currently json does not differentiate between the two.
     */
    val name : String
    val description: String
}