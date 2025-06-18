package com.yellowcow.cafewhereigo.community

import com.yellowcow.cafewhereigo.cafe.Cafe
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
class CommunityPost(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cafe_id")
    val cafe: Cafe,

    val title: String,
    val content: String,
    val createdAt: LocalDateTime = LocalDateTime.now()
)
