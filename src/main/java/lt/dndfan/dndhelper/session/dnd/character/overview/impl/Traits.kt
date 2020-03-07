package lt.dndfan.dndhelper.session.dnd.character.overview.impl

import lt.dndfan.dndhelper.bean.dnd.feature.ITrait
import lt.dndfan.dndhelper.session.dnd.character.overview.ISingleListFacade

/**
 * Responsible for providing of traits (as in ITrait), character feats, and, maybe status effects?
 * Should contain ALL_TRAITS, ALL_FEATS;
 */

class Traits (
        override val list : List<String>,
        override val title: String
) : ISingleListFacade
{}