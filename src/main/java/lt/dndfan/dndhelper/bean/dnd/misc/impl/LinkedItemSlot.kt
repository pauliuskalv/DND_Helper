package lt.dndfan.dndhelper.bean.dnd.misc.impl

import lt.dndfan.dndhelper.bean.dnd.misc.IItemSlot

/**
 * Not sure if abstract is the best way to implement linked item slots.
 */

class LinkedItemSlot (
        override val slotName : String,
        override var free : Boolean,
        override var itemName : String,

        /**
         * If this slot is occupied should other slot also be occupied.
         * Should be true with two handed weapons to occupy both hand slots for example.
         * It is variable, because the slot needs to be unlinked (linked set to false) when switching from two handed weapon to a single handed one.
         */
        var linked : Boolean,
        /** If so which other slot is linked */
        val linkedSlot : String
) : IItemSlot
{}