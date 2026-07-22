package com.joaoat.library_backend_springboot_kt.controllers

import com.joaoat.library_backend_springboot_kt.dtos.BookDTO
import com.joaoat.library_backend_springboot_kt.services.BookService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/book")
class BookController(
    private val bookService: BookService
) {

    @GetMapping("/all")
    fun getAllBooks() : List<BookDTO>{
        return bookService.getAllBooks()
    }

    @GetMapping("/{id}")
    fun getBookById(@PathVariable id: Long): BookDTO {
        return bookService.getBookById(id)
    }

    @GetMapping("/{id}/save")
    fun saveBook(@PathVariable id: Long): String {
        bookService.saveBook(id)
        return "if you're reading this, no error has occurred, so the database is probably working now"
    }
}