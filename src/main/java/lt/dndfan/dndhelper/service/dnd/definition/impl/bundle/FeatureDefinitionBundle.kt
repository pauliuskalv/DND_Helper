package lt.dndfan.dndhelper.service.dnd.definition.impl.bundle

import lt.dndfan.dndhelper.bean.definition.characterclass.Feature
import lt.dndfan.dndhelper.service.dnd.definition.DefinitionBuilder
import lt.dndfan.dndhelper.service.dnd.definition.impl.AbstractInnerDefinitionBundle
import org.springframework.beans.factory.annotation.Autowired

class FeatureDefinitionBundle(
        @Autowired builder : DefinitionBuilder<Feature>
) : AbstractInnerDefinitionBundle<Feature>(
        "Features.json",
        builder
)