package com.joaoat.library_backend_springboot_kt.mappers

import com.joaoat.library_backend_springboot_kt.dtos.BookDTO
import com.joaoat.library_backend_springboot_kt.entities.Book

fun Book.toBookDTO(): BookDTO = BookDTO(id, title, author)