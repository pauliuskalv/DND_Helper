package lt.dndfan.dndhelper.bean.character


import lt.dndfan.dndhelper.bean.character.constant.ESkill


interface IEnemy : ICharacter {
    var size : String           // e.g. Huge
    val challenge_rating : Int

    val type : String           // e.g. Abberation
    val subtype : String

    var condition_immunities : List<String>                 // TODO: Create EConditions?
    var damage_immunities : List<String>

    val skills : List<ESkill>   // Skills whose value is not calculated from stats
    val abilities : List<String>            // TODO: Create ability interface
}





