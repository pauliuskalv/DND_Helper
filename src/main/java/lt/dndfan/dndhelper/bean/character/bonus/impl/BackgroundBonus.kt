package lt.dndfan.dndhelper.bean.character.bonus.impl

import lt.dndfan.dndhelper.bean.character.IPlayableCharacter
import lt.dndfan.dndhelper.bean.character.constant.ELanguage
import lt.dndfan.dndhelper.bean.character.constant.ESkill
import lt.dndfan.dndhelper.bean.character.inventory.item.IItem

class BackgroundBonus(
    private val mName : String,
    private val mDescription : String,
    private val mSkills : List<ESkill>,
    private val mLanguages : List<ELanguage>,
    private val mItems : List<IItem>,
    private val mToolsProficiencies : List<String>
): AbstractBonus() {
    override val bonusName: String
        get() = mName
    override val description: String
        get() = mDescription
    override val origin: String
        get() = "Background"

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