package ink.ptms.adyeshach.common.entity.type

import ink.ptms.adyeshach.common.entity.EntityTypes

/**
 * @author sky
 * @date 2020/8/4 23:15
 */
@Deprecated("Outdated but usable")
class AdyPrimedTNT(v2: ink.ptms.adyeshach.core.entity.EntityInstance):  AdyEntity(EntityTypes.PRIMED_TNT, v2) {

    fun setFuseTime(fuseTime: Int) {
        setMetadata("fuseTime",fuseTime)
    }

    fun getFuseTime():Int{
        return getMetadata("fuseTime")
    }
}