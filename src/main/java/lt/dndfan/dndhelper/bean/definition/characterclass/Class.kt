package lt.dndfan.dndhelper.bean.definition.characterclass

import lt.dndfan.dndhelper.bean.definition.BaseDefinition
import lt.dndfan.dndhelper.bean.definition.information.AbilityScore
import lt.dndfan.dndhelper.bean.definition.information.Proficiency

public class Class(
        name : String,
        val hitDie : Int,
        val proficiencyChoices : ProficiencyChoices,
        val proficiencies : List<Proficiency>,
        val savingThrows : List<AbilityScore>,
        // val startingEquipment : StartingEquipment, TODO
        val classLevels : List<ClassLevel>
) : BaseDefinition(name)