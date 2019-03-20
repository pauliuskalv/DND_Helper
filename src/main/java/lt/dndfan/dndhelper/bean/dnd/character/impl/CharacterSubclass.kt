package lt.dndfan.dndhelper.bean.dnd.character.impl

import lt.dndfan.dndhelper.bean.dnd.character.ICharacterSubclass
import lt.dndfan.dndhelper.bean.dnd.feature.impl.Trait

class CharacterSubclass(override val name: String,
                        override val description: String,
                        override val characterClass: String,
                        override val flavor: String,
                        override val traits: List<Trait>
): ICharacterSubclass