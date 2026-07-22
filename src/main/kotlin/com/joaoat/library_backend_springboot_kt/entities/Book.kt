package com.joaoat.library_backend_springboot_kt.entities

//import jakarta.persistence.Id
//import jakarta.persistence.Entity
import java.util.UUID

//@Entity
class Book(
    //@Id
    //var id: UUID,
    val id: Long,
    var title: String,
    var author: String
)