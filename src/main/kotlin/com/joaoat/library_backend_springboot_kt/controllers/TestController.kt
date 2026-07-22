package com.joaoat.library_backend_springboot_kt.controllers

import com.joaoat.library_backend_springboot_kt.dtos.TestDTO
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

//TODO: remove this file when it's no longer necessary
@RestController
class TestController {

    @GetMapping("/test")
    fun test(): String {
        return "if you can read this, the test was successful :D"
    }

    @GetMapping("/testJson")
    fun testJson(): TestDTO {
        return TestDTO()
    }
}