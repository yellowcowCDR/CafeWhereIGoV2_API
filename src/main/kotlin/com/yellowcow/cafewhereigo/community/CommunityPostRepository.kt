package com.yellowcow.cafewhereigo.community

import org.springframework.data.jpa.repository.JpaRepository

interface CommunityPostRepository : JpaRepository<CommunityPost, Long>
