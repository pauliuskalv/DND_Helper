package lt.dndfan.dndhelper.bean.dnd


import lt.dndfan.dndhelper.bean.dnd.stats.impl.Skill


interface IEnemy : ICharacter {
    /** e.g. Huge */
    var size : String
    val challenge_rating : Int

    /** e.g. Abberation */
    val type : String
    val subtype : String

    var condition_immunities : List<String>
    var damage_immunities : List<String>

    /**
     * Override for skills that will not be calculated by using base stats
     * e. g. Perception 2 (Enemy might have Wisdom that is higher or lower than 2)
     */
    val skills : Pair<Skill,Int>
}





