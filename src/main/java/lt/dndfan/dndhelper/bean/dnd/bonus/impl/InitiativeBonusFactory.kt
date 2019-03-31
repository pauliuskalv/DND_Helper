package lt.dndfan.dndhelper.bean.dnd.bonus.impl

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.bonus.IBonusFactory

class InitiativeBonusFactory : IBonusFactory {
    val dummyBonus : IBonus = InitiativeBonus(
            "Dummy bonus",
            "Dummy bonus description",
            this.javaClass.name,
            0
            )

    override fun createBonus(): IBonus {
        return dummyBonus
    }

    override fun createBonus(args: Map<String, Any>) : IBonus {
        return InitiativeBonus(
                args["name"] as String,
                args["description"] as String,
                args["origin"] as String,
                args["value"] as Int
        )
    }
}

