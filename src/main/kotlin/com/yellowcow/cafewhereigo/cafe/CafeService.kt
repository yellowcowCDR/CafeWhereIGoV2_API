package com.yellowcow.cafewhereigo.cafe

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class CafeService(private val cafeRepository: CafeRepository) {

    @Transactional(readOnly = true)
    fun search(condition: CafeSearchCondition): List<Cafe> {
        return cafeRepository.search(condition)
    }

    @Transactional
    fun addCafe(cafe: Cafe): Cafe {
        return cafeRepository.save(cafe)
    }
}
