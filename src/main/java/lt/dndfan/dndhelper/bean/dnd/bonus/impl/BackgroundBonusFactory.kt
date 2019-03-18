package lt.dndfan.dndhelper.bean.dnd.bonus.impl

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.bonus.IBonusFactory
import lt.dndfan.dndhelper.bean.dnd.constant.ELanguage
import lt.dndfan.dndhelper.bean.dnd.constant.ESkill
import lt.dndfan.dndhelper.bean.dnd.inventory.item.IItem

class BackgroundBonusFactory : IBonusFactory {
    private val dummyBonus : IBonus = BackgroundBonus(
            "Dummy background bonus",
            "Dummy background bonus description",
            this.javaClass.name,
            ArrayList<ESkill>(),
            ArrayList<ELanguage>(),
            ArrayList<IItem>(),
            ArrayList<String>()
    )

    override fun createBonus(): IBonus {
        return dummyBonus
    }

    override fun createBonus(args: Map<String, Any>): IBonus {
        return BackgroundBonus(
                args["name"] as String,
                args["description"] as String,
                args["origin"] as String,
                args["skills"] as List<ESkill>,
                args["languages"] as List<ELanguage>,
                args["items"] as List<IItem>,
                args["tool_proficiencies"] as List<String>
        )
    }
}