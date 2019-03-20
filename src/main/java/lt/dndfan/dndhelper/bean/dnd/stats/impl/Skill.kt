package lt.dndfan.dndhelper.bean.dnd.stats.impl

import lt.dndfan.dndhelper.bean.dnd.stats.ISkill

class Skill (
        override val name: String,
        override val description: String,
        override val stat: String
) : ISkill