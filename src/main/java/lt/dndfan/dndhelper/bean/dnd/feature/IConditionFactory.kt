package lt.dndfan.dndhelper.bean.dnd.feature

interface IConditionFactory {
    fun createCondition(name : String,
                        description : String) : ICondition
}