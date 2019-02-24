package lt.dndfan.dndhelper.bean.character.bonus.impl

import lt.dndfan.dndhelper.bean.character.bonus.IBonus
import lt.dndfan.dndhelper.bean.character.bonus.IBonusFactory
import lt.dndfan.dndhelper.bean.character.constant.ELanguage

class LanguageBonusFactory : IBonusFactory {
    override fun createBonus(): IBonus {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createBonus(args: Map<String, Any>): IBonus {
        return LanguageBonus(
                args["name"] as String,
                args["descrpiton"] as String,
                args["origin"] as String,
                args["language"] as ELanguage
        )
    }
}