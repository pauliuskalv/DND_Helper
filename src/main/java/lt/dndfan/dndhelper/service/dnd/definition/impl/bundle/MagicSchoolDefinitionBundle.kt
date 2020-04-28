package lt.dndfan.dndhelper.service.dnd.definition.impl.bundle

import lt.dndfan.dndhelper.bean.definition.information.MagicSchool
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilder
import lt.dndfan.dndhelper.service.dnd.definition.impl.AbstractInnerDefinitionBundle
import org.springframework.beans.factory.annotation.Autowired

class MagicSchoolDefinitionBundle(
        @Autowired builder : DefinitionBuilder<MagicSchool>
) : AbstractInnerDefinitionBundle<MagicSchool>(
        "MagicSchools.json",
        builder
)