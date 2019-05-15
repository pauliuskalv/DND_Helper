package lt.dndfan.dndhelper.bean.dnd.bonus

import lt.dndfan.dndhelper.bean.dnd.IPlayableCharacter

interface IBonus {
    /**
     * Bonuses should be used to add any modifications to character that happen after the initial 0 level character creation.
     * For example initial character stats should not be considered a bonus, but "Ability Score Improvement" should be.
     * Also characters know common language, but all other languages are bonuses (usually from race or background).
     * Character hp is basic character property (that is usually rolled), but the amount that gets increased by constitution stat should come as a bonus.
     * Character`s Armor Class is 10 and all modifications to it should come as a bonus.
     * Character`s Movement Speed is 30ft and all modifications to it should come as a bonus.
     */
    val bonusName : String
    /**
     * Description should describe reason or explanation for the bonus.
     * For example, "Leather Armor provides some protection." or "Thieves need to be sneaky to survive".
     */
    val description : String
    /**
     * Origin should display the name of specific object that the bonus comes from.
     * For example it could be "Nine Lives Stealer" and may be appended with "(Longsword, Right hand)".
     * Or "Tiefling (Infernal Legacy)".
     */
    val origin : String

    fun apply(character : IPlayableCharacter)
    fun remove(character : IPlayableCharacter)
    fun isApplied() : Boolean
}