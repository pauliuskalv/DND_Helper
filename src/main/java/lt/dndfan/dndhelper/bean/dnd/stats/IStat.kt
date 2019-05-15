package lt.dndfan.dndhelper.bean.dnd.stats

interface IStat {
    /** e.g. "DEX" */
    val name : String
    /** e. g. "Dexterity" */
    val fullName: String
    val description: String
    /** Skills that get benefits from this stat */
    val skills : List<String>
}