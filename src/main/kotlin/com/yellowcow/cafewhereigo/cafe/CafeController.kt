package com.yellowcow.cafewhereigo.cafe

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/cafes")
class CafeController(private val cafeService: CafeService) {

    @GetMapping
    fun search(condition: CafeSearchCondition): List<Cafe> {
        return cafeService.search(condition)
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody request: CreateCafeRequest): Cafe {
        val cafe = Cafe(
            name = request.name,
            region = request.region,
            hasWifi = request.hasWifi,
            hasParking = request.hasParking,
            hasSocket = request.hasSocket,
            theme = request.theme
        )
        return cafeService.addCafe(cafe)
    }
}

data class CreateCafeRequest(
    val name: String,
    val region: String,
    val hasWifi: Boolean,
    val hasParking: Boolean,
    val hasSocket: Boolean,
    val theme: String
)
