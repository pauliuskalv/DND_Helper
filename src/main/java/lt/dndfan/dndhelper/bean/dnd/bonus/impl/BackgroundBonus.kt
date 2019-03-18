package lt.dndfan.dndhelper.bean.dnd.bonus.impl

import lt.dndfan.dndhelper.bean.dnd.IPlayableCharacter
import lt.dndfan.dndhelper.bean.dnd.constant.ELanguage
import lt.dndfan.dndhelper.bean.dnd.constant.ESkill
import lt.dndfan.dndhelper.bean.dnd.inventory.item.IItem

class BackgroundBonus(
        override val bonusName : String,
        override val description : String,
        override val origin : String,
        private val mSkills : List<ESkill>,
        private val mLanguages : List<ELanguage>,
        private val mItems : List<IItem>,
        private val mToolsProficiencies : List<String>
): AbstractBonus(bonusName, description, origin) {
    override fun applyBonus(character: IPlayableCharacter) {
        for (item in mSkills)
            character.addSkillProficiency(item)

        for (item in mLanguages)
            character.addLanguage(item)

        for (item in mToolsProficiencies)
            character.addItemProficiency(item)

        for (item in mItems)
            character.getInventory().addItem(item)
    }

    override fun removeBonus(character: IPlayableCharacter) {
        for (item in mSkills)
            character.removeSkillProficiency(item)

        for (item in mLanguages)
            character.removeLanguage(item)

        for (item in mToolsProficiencies)
            character.removeItemProficiency(item)

        for (item in mItems)
            character.getInventory().removeItem(item)
    }
}