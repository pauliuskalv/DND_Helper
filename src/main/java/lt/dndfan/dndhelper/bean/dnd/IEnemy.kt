package lt.dndfan.dndhelper.bean.dnd


import lt.dndfan.dndhelper.bean.dnd.stats.impl.Skill


interface IEnemy : ICharacter {
    var size : String           // e.g. Huge
    val challenge_rating : Int

    val type : String           // e.g. Abberation
    val subtype : String

    var condition_immunities : List<String>
    var damage_immunities : List<String>

    val skills : List<Skill>   // Skills whose value is not calculated from stats
}





