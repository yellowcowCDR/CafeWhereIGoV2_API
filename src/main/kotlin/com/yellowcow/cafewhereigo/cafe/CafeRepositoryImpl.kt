package com.yellowcow.cafewhereigo.cafe

import com.querydsl.jpa.impl.JPAQueryFactory
import com.yellowcow.cafewhereigo.cafe.QCafe
import org.springframework.stereotype.Repository

@Repository
class CafeRepositoryImpl(
    private val queryFactory: JPAQueryFactory
) : CafeRepositoryCustom {

    override fun search(condition: CafeSearchCondition): List<Cafe> {
        val cafe = QCafe.cafe
        return queryFactory.selectFrom(cafe)
            .where(
                condition.region?.let { cafe.region.eq(it) },
                condition.hasWifi?.let { cafe.hasWifi.eq(it) },
                condition.hasParking?.let { cafe.hasParking.eq(it) },
                condition.hasSocket?.let { cafe.hasSocket.eq(it) },
                condition.theme?.let { cafe.theme.eq(it) }
            )
            .fetch()
    }
}
