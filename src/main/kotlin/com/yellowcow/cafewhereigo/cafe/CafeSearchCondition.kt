package com.yellowcow.cafewhereigo.cafe

data class CafeSearchCondition(
    val region: String? = null,
    val hasWifi: Boolean? = null,
    val hasParking: Boolean? = null,
    val hasSocket: Boolean? = null,
    val theme: String? = null
)
