package com.github.mgrzeszczak.test

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/test")
class TestApiController {

    @GetMapping
    fun helloWorld() = "hello world"

}