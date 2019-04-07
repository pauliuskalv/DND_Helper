package lt.dndfan.dndhelper.bean.dnd.stats.impl

import lt.dndfan.dndhelper.bean.dnd.stats.IStat

class Stat (
        override val name: String,
        override val fullName: String,
        override val description: String,
        override val skills: List<Skill>
) : IStat