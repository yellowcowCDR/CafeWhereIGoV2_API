package com.yellowcow.cafewhereigo.cafe

interface CafeRepositoryCustom {
    fun search(condition: CafeSearchCondition): List<Cafe>
}
