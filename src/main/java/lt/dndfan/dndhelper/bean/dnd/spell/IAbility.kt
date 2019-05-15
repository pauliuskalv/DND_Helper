package lt.dndfan.dndhelper.bean.dnd.spell

import lt.dndfan.dndhelper.bean.dnd.constant.ERestType

interface IAbility {
    /**
     * Ability is an active Action/Bonus Action/Reaction that the character is allowed to take, because of bonuses that the character has.
     * Usually comes from Race, Class, Feat, or Item.
     */

    val name : String
    val description : String

    /**
     * Amount of times the ability can be used without rest
     * If zero then it can be used without restriction
     */
    val count : Int
    /** Amount of times that the ability was already used */
    val used : Int

    /** Short or long rest to recover charges */
    val refresh : ERestType
}