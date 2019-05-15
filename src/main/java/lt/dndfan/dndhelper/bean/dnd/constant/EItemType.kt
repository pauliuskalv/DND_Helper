package lt.dndfan.dndhelper.bean.dnd.constant

enum class EItemType(val itemName : String) {
    /**
     * Consider reworking this as a class for more flexibility.
     */
    WEAPON("Weapon"),
    ARMOR("Armor"),
    ADVENTURING_GEAR("Adventuring Gear"),
    TOOLS("Tools"),
    MOUNTS_AND_VEHICLES("Mounts and Vehicles"),
    SHIELD("Shield"),
    RING("Ring"),

    MAGIC_ITEM("Magic Item")
}