package lt.dndfan.dndhelper.bean.dnd.inventory.impl

import lt.dndfan.dndhelper.bean.dnd.inventory.ICharacterInventory
import lt.dndfan.dndhelper.bean.dnd.inventory.ICharacterInventoryFactory
import org.springframework.stereotype.Component

@Component
class CharacterInventoryFactory : ICharacterInventoryFactory {
    override fun createInventory(): ICharacterInventory {
        return CharacterInventory()
    }
}