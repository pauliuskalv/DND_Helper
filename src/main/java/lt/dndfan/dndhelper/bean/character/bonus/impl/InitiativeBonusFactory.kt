package lt.dndfan.dndhelper.bean.character.bonus.impl

import lt.dndfan.dndhelper.bean.character.bonus.IBonus
import lt.dndfan.dndhelper.bean.character.bonus.IBonusFactory

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

    /**
     *
     */
    override fun createBonus(args: Map<String, Any>) : IBonus {
        return InitiativeBonus(
                args["name"] as String,
                args["description"] as String,
                args["origin"] as String,
                args["value"] as Int
        )
    }
}

