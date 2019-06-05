package lt.dndfan.dndhelper.facade.dnd.character.overview.impl

import lt.dndfan.dndhelper.bean.dnd.feature.ITrait

/**
 * Responsible for providing of traits (as in ITrait), character feats, and, maybe status effects?
 * Should contain ALL_TRAITS, ALL_FEATS;
 */

interface ITraits {
    val traitList : List<ITrait>
}