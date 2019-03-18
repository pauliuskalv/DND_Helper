package lt.dndfan.dndhelper.domain.dnd.stat.impl

import lt.dndfan.dndhelper.bean.dnd.constant.EArmorType
import lt.dndfan.dndhelper.domain.dnd.stat.IArmorClassCalculator

class ArmorClassCalculator () : IArmorClassCalculator {
    override fun calculateArmorClass(baseArmorValue: Int, armorType: EArmorType, dex: Int): Int {
        // TODO: Correct calculations with negative dex
        val ac : Int
        var dexBonus : Int = dex
        ac = baseArmorValue - 10
        if(armorType.value == "Heavy")
        {
            return ac-dex
        }
        else if(armorType.value == "Medium")
        {
            if(dex>2)
                dexBonus=2
            return ac-dex+dexBonus
        }
        else // "Light"
        {
            return ac
        }
    }
}