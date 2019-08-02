package lt.dndfan.dndhelper.bean.dnd.inventory.item

interface IThrowableWeapon : IWeapon {
    /** Consider changing String to Int */
    val throwRange : String
    /**
     * Range with which the weapon has a disadvantage
     */
    val throwRangeLong : String
}