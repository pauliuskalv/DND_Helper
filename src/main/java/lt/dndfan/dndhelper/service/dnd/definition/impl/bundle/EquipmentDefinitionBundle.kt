package lt.dndfan.dndhelper.service.dnd.definition.impl.bundle

import lt.dndfan.dndhelper.bean.definition.equipment.Equipment
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilder
import lt.dndfan.dndhelper.service.dnd.definition.impl.AbstractInnerDefinitionBundle
import org.springframework.beans.factory.annotation.Autowired

class EquipmentDefinitionBundle(
        @Autowired builder : DefinitionBuilder<Equipment>
) : AbstractInnerDefinitionBundle<Equipment>(
        "Equipment.json",
        builder
)