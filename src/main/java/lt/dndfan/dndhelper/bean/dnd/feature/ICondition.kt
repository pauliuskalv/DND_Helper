package lt.dndfan.dndhelper.bean.dnd.feature

interface ICondition {
    /**
     * Condition may be for example "Charmed", "Grappled", "Poisoned"...
     */
    val name : String
    val description : String
}