package com.example.controlleprojet.service;

import com.example.controlleprojet.dto.BookDto;

import java.util.List;

public interface BookService {
    public BookDto saveBook(BookDto bookDto);
    public boolean deletBook(Long id);
    public BookDto getBookById(Long id);
    public List<BookDto> saveBook(List<BookDto> bookDtos);
    BookDto getBooksByTitle(String title);

}
