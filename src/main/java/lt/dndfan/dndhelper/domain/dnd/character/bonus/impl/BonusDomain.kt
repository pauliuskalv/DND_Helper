package lt.dndfan.dndhelper.domain.dnd.character.bonus.impl

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.bonus.impl.*
import lt.dndfan.dndhelper.bean.dnd.stats.ISkill
import lt.dndfan.dndhelper.bean.dnd.stats.IStat
import lt.dndfan.dndhelper.domain.dnd.character.bonus.IBonusDomain

class BonusDomain : IBonusDomain {
    override fun createAbilityBonus(args: Map<String, Any>): IBonus {
        val bonusFactory = AbilityBonusFactory()
        return bonusFactory.createBonus(args)
    }

    override fun createArmorClassBonus(args: Map<String, Any>): IBonus {
        val bonusFactory = ArmorClassBonusFactory()
        return bonusFactory.createBonus(args)
    }

    override fun createBackgroundBonus(args: Map<String, Any>): IBonus {
        val bonusFactory = BackgroundBonusFactory()
        return bonusFactory.createBonus(args)
    }

    override fun createFeatBonus(args: Map<String, Any>): IBonus {
        val bonusFactory = FeatBonusFactory()
        return bonusFactory.createBonus(args)
    }

    override fun createInitiativeBonus(args: Map<String, Any>): IBonus {
        val bonusFactory = InitiativeBonusFactory()
        return bonusFactory.createBonus(args)
    }

    override fun createLanguageBonus(args: Map<String, Any>): IBonus {
        val bonusFactory = LanguageBonusFactory()
        return bonusFactory.createBonus(args)
    }

    override fun createMovementSpeedBonus(args: Map<String, Any>): IBonus {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createSkillProficiencyBonus(args: Map<String, Any>): IBonus {
        val bonusFactory = SkillProficiencyBonusFactory()
        return bonusFactory.createBonus(args)
    }

    override fun createStatBonus(args: Map<String, Any>): IBonus {
        val bonusFactory = StatBonusFactory()
        return bonusFactory.createBonus(args)
    }

    override fun getBonusByOrigin(bonusList: List<IBonus>, origin: String): List<IBonus> {
        val matchedList = ArrayList<IBonus>()
        for (bonus in bonusList) {
            if(bonus.origin == origin ||
                    bonus.origin.toLowerCase() == origin) {
                matchedList.add(bonus)
            }
        }
        return matchedList
    }

    override fun getBonusBySkill(bonusList: List<IBonus>, skill: ISkill): List<IBonus> {
        val matchedList = ArrayList<IBonus>()
        for (bonus in bonusList) {
            /** TODO: This may not work, find a better solution */
            if(bonus.javaClass.name == "SkillProficiencyBonus") {
                val castedBonus = bonus as SkillProficiencyBonus
                if(castedBonus.proficiency == skill) {
                    matchedList.add(bonus)
                }
            }
        }
        return matchedList
    }

    override fun getBonusByStat(bonusList: List<IBonus>, stat: IStat): List<IBonus> {
        val matchedList = ArrayList<IBonus>()
        for (bonus in bonusList) {
            if(bonus.javaClass.name == "StatBonus") {
                val castedBonus = bonus as StatBonus
                if(castedBonus.stat == stat) {
                    matchedList.add(bonus)
                }
            }
        }
        return matchedList
    }

    override fun getBonusByType(bonusList: List<IBonus>, type: IBonus): List<IBonus> {
        val matchedList = ArrayList<IBonus>()
        for(bonus in bonusList) {
            if(bonus.javaClass.name == type.javaClass.name) {
                matchedList.add(bonus)
            }
        }
        return matchedList
    }

    override fun getBonusByType(bonusList: List<IBonus>, type: String): List<IBonus> {
        val matchedList = ArrayList<IBonus>()
        for(bonus in bonusList) {
            if(bonus.javaClass.name == type ||
                    bonus.javaClass.name == type.substringBefore("Bonus")) {
                matchedList.add(bonus)
            }
        }
        return matchedList
    }
}