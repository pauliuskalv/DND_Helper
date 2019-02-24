package lt.dndfan.dndhelper.bean.character.bonus.impl

import lt.dndfan.dndhelper.bean.character.IPlayableCharacter
import lt.dndfan.dndhelper.bean.character.constant.ERestType
import lt.dndfan.dndhelper.bean.character.spell.impl.Spell

/*
    one time use spell per rest
*/

class SpellBonus(override val bonusName : String,
                 override val description : String,
                 override val origin : String,
                 private val spell : Pair<Spell,ERestType>
                 ) : AbstractBonus(bonusName, description, origin) {
    override fun applyBonus(character: IPlayableCharacter) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun removeBonus(character: IPlayableCharacter) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}