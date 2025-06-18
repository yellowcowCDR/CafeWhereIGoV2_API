package com.yellowcow.cafewhereigo.community

import com.yellowcow.cafewhereigo.cafe.CafeRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class CommunityPostService(
    private val communityPostRepository: CommunityPostRepository,
    private val cafeRepository: CafeRepository
) {

    @Transactional(readOnly = true)
    fun listAll(): List<CommunityPost> {
        return communityPostRepository.findAll()
    }

    @Transactional
    fun addPost(cafeId: Long, title: String, content: String): CommunityPost {
        val cafe = cafeRepository.findById(cafeId).orElseThrow()
        val post = CommunityPost(cafe = cafe, title = title, content = content)
        return communityPostRepository.save(post)
    }
}
