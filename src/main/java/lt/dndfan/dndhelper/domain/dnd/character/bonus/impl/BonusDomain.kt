package lt.dndfan.dndhelper.domain.dnd.character.bonus.impl

import lt.dndfan.dndhelper.bean.dnd.bonus.IBonus
import lt.dndfan.dndhelper.bean.dnd.bonus.IBonusFactory
import lt.dndfan.dndhelper.bean.dnd.bonus.impl.*
import lt.dndfan.dndhelper.bean.dnd.stats.ISkill
import lt.dndfan.dndhelper.bean.dnd.stats.IStat
import lt.dndfan.dndhelper.domain.dnd.character.bonus.IBonusDomain
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Component
class BonusDomain : IBonusDomain {
    @Autowired
    @Qualifier("AbilityBonusFactory")
    private lateinit var abilityBonusFactory : IBonusFactory

    @Autowired
    @Qualifier("ArmorClassBonusFactory")
    private lateinit var armorClassBonusFactory : IBonusFactory

    @Autowired
    @Qualifier("BackgroundBonusFactory")
    private lateinit var backgroundBonusFactory : IBonusFactory

    @Autowired
    @Qualifier("FeatBonusFactory")
    private lateinit var featBonusFactory : IBonusFactory

    @Autowired
    @Qualifier("InitiativeBonusFactory")
    private lateinit var initiativeBonusFactory : IBonusFactory

    @Autowired
    @Qualifier("LanguageBonusFactory")
    private lateinit var languageBonusFactory : IBonusFactory

    @Autowired
    @Qualifier("MovementSpeedBonusFactory")
    private lateinit var movementSpeedBonusFactory : IBonusFactory

    @Autowired
    @Qualifier("SkillProficiencyBonusFactory")
    private lateinit var skillProficiencyBonusFactory : IBonusFactory

    @Autowired
    @Qualifier("StatBonusFactory")
    private lateinit var statBonusFactory : IBonusFactory

    override fun createAbilityBonus(args: Map<String, Any>): IBonus = abilityBonusFactory.createBonus(args)

    override fun createArmorClassBonus(args: Map<String, Any>): IBonus = armorClassBonusFactory.createBonus(args)

    override fun createBackgroundBonus(args: Map<String, Any>): IBonus = backgroundBonusFactory.createBonus(args)

    override fun createFeatBonus(args: Map<String, Any>): IBonus = featBonusFactory.createBonus(args)

    override fun createInitiativeBonus(args: Map<String, Any>): IBonus = initiativeBonusFactory.createBonus(args)

    override fun createLanguageBonus(args: Map<String, Any>): IBonus = languageBonusFactory.createBonus(args)

    override fun createMovementSpeedBonus(args: Map<String, Any>): IBonus = movementSpeedBonusFactory.createBonus(args)

    override fun createSkillProficiencyBonus(args: Map<String, Any>): IBonus = skillProficiencyBonusFactory.createBonus(args)

    override fun createStatBonus(args: Map<String, Any>): IBonus = statBonusFactory.createBonus(args)

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
            if (bonus is SkillProficiencyBonus) {
                if(bonus.proficiency == skill) {
                    matchedList.add(bonus)
                }
            }
        }
        return matchedList
    }

    override fun getBonusByStat(bonusList: List<IBonus>, stat: IStat): List<IBonus> {
        val matchedList = ArrayList<IBonus>()
        for (bonus in bonusList) {
            if(bonus is StatBonus) {
                if(bonus.stat == stat) {
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