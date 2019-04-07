package lt.dndfan.dndhelper.domain.dnd.stat

import lt.dndfan.dndhelper.bean.dnd.constant.EArmorType

interface IArmorClassCalculator {
    fun calculateArmorClass(baseArmorValue : Int, armorType : EArmorType, dex : Int) : Int
}