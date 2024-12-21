package com.example.controlleprojet.mapper;

import com.example.controlleprojet.dao.entities.Book;
import com.example.controlleprojet.dto.BookDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    private final ModelMapper mapper = new ModelMapper();

    // Convertir une entité Book en BookDto
    public BookDto fromBookToBookDto(Book book) {
        return mapper.map(book, BookDto.class);
    }

    // Convertir un BookDto en entité Book
    public Book fromBookDtoToBook(BookDto bookDto) {
        return mapper.map(bookDto, Book.class);
    }
}