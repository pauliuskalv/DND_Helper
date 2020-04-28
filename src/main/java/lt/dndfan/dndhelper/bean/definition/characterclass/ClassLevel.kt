package lt.dndfan.dndhelper.bean.definition.characterclass

import lt.dndfan.dndhelper.bean.definition.BaseDefinition
import java.util.*

public class ClassLevel(
        name : String, // Corresponding class name
        val level : Int,
        val abilityScoreBonuses : Int,
        val proficiencyBonus : Int,
        // TODO: val featureChoices : List<FeatureChoice>
        val features : List<Feature>,
        val levelClass : Class,
        val levelSubclass : Optional<Subclass>
) : BaseDefinition(name)