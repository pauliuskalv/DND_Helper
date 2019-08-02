package lt.dndfan.dndhelper.bean.dnd.bonus.impl

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.bonus.IBonusFactory
import lt.dndfan.dndhelper.bean.dnd.stats.impl.Skill

class SkillProficiencyBonusFactory : IBonusFactory {
    override fun createBonus(): IBonus {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createBonus(args: Map<String, Any>): IBonus {
        return SkillProficiencyBonus(
                args["name"] as String,
                args["description"] as String,
                args["origin"] as String,
                args["proficiency"] as Skill
        )
    }
}