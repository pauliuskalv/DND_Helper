package lt.dndfan.dndhelper.bean.character.bonus.impl

import lt.dndfan.dndhelper.bean.character.ICharacter
import lt.dndfan.dndhelper.bean.character.bonus.IBonus

class FeatBonus(override val bonusName: String,
                override val description: String,
                override val origin: String) : IBonus {
    override fun apply(character: ICharacter) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun remove(character: ICharacter) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}