package com.yellowcow.cafewhereigo.cafe

import jakarta.persistence.*

@Entity
class Cafe(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val name: String,
    val region: String,
    val hasWifi: Boolean,
    val hasParking: Boolean,
    val hasSocket: Boolean,
    val theme: String
)
