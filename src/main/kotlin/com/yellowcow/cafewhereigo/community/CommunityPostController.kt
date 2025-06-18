package com.yellowcow.cafewhereigo.community

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/posts")
class CommunityPostController(private val communityPostService: CommunityPostService) {

    @GetMapping
    fun list(): List<CommunityPost> {
        return communityPostService.listAll()
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody request: CreatePostRequest): CommunityPost {
        return communityPostService.addPost(request.cafeId, request.title, request.content)
    }
}

data class CreatePostRequest(
    val cafeId: Long,
    val title: String,
    val content: String
)
