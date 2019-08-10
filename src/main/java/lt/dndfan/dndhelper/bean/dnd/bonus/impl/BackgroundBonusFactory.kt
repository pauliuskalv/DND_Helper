package lt.dndfan.dndhelper.bean.dnd.bonus.impl

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.bonus.IBonusFactory
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Language
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Skill
import lt.dndfan.dndhelper.bean.dnd.inventory.item.IItem
import org.springframework.stereotype.Component

@Component("BackgroundBonusFactory")
class BackgroundBonusFactory : IBonusFactory {
    private val dummyBonus : IBonus = BackgroundBonus(
            "Dummy background bonus",
            "Dummy background bonus description",
            this.javaClass.name,
            ArrayList<Skill>(),
            ArrayList<Language>(),
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
                args["skills"] as List<Skill>,
                args["languages"] as List<Language>,
                args["items"] as List<IItem>,
                args["tool_proficiencies"] as List<String>
        )
    }
}