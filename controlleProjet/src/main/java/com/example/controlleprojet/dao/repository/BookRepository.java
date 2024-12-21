package com.example.controlleprojet.dao.repository;

import com.example.controlleprojet.dao.entities.Book;
import com.example.controlleprojet.dto.BookDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    BookDto getBooksByTitle(String title);



}
