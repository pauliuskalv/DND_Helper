package lt.dndfan.dndhelper.bean.definition.background

import lt.dndfan.dndhelper.bean.definition.BaseDefinition
import lt.dndfan.dndhelper.bean.definition.equipment.Equipment
import lt.dndfan.dndhelper.bean.definition.information.Skill

public class Background(
        name: String,
        val description : String,
        val skills : List<Skill>,
        val languageCount : Int,
        val toolProficiencies : List<Any>, // TODO
        val items : List<Equipment>, // TODO
        val gold : Int,
        val features : List<BackgroundFeature>,
        val personalityTraits : List<String>,
        val ideals : List<BackgroundIdeal>,
        val bonds : List<String>,
        val flaws : List<String>
) : BaseDefinition(name)