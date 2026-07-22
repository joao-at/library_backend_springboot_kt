package com.joaoat.library_backend_springboot_kt.services

import com.joaoat.library_backend_springboot_kt.dtos.BookDTO
import com.joaoat.library_backend_springboot_kt.entities.Book
import com.joaoat.library_backend_springboot_kt.mappers.toBookDTO
import com.joaoat.library_backend_springboot_kt.repositories.BookRepository
import org.springframework.stereotype.Service

@Service
class BookService(
   private val bookRepository: BookRepository
) {
    val books = listOf<Book>(
        Book(id = 0, title = "Amarelo - História de uma cor", author = "Michel Pastoureau" ),
        Book(id = 1, title = "Steve Jobs", author = "Walter Isaacson" ),
        Book(id = 2, title = "Mansfield Park", author = "Jane Austen" ),
        Book(id = 3, title = "Nikola Tesla", author = "Aleksandar Marincic" ),
        Book(id = 4, title = "The Creative Gene", author = "Hideo Kojima" ),
        Book(id = 5, title = "Mindfulness in Pain English", author = "Bhante Gunaratana" ),
    )

    fun getAllBooks(): List<BookDTO> {

        return books.map(Book::toBookDTO)
    }

    fun getBookById(id: Long): BookDTO {
        return books[id.toInt()].toBookDTO()
    }

    fun saveBook(id: Long) {
        bookRepository.save(books[id.toInt()])
    }

}