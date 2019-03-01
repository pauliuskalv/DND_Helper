package lt.dndfan.dndhelper.domain.dnd.stat

import lt.dndfan.dndhelper.bean.character.constant.EArmorType

interface IArmorClassCalculator {
    fun calculateArmorClass(baseArmorValue : Int, armorType : EArmorType, dex : Int) : Int
}