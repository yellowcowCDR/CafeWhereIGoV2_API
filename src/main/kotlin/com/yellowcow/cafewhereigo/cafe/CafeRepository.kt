package com.yellowcow.cafewhereigo.cafe

import org.springframework.data.jpa.repository.JpaRepository

interface CafeRepository : JpaRepository<Cafe, Long>, CafeRepositoryCustom
