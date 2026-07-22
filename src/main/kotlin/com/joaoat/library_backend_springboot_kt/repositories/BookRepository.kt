package com.joaoat.library_backend_springboot_kt.repositories

import com.joaoat.library_backend_springboot_kt.entities.Book
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface BookRepository: JpaRepository<Book, Long> {
}