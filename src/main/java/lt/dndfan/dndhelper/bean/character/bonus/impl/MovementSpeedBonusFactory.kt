package lt.dndfan.dndhelper.bean.character.bonus.impl

import lt.dndfan.dndhelper.bean.character.bonus.IBonus
import lt.dndfan.dndhelper.bean.character.bonus.IBonusFactory

class MovementSpeedBonusFactory : IBonusFactory {
    override fun createBonus(): IBonus {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createBonus(args: Map<String, Any>): IBonus {
        return MovementSpeedBonus(
                args["name"] as String,
                args["description"] as String,
                args["origin"] as String,
                args["value"] as Int
        )
    }
}