package com.example.controlleprojet.service;

import com.example.controlleprojet.dao.entities.Book;
import com.example.controlleprojet.dao.repository.BookRepository;
import com.example.controlleprojet.dto.BookDto;
import com.example.controlleprojet.mapper.BookMapper;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class BookManager implements BookService{

    private final BookMapper bookMapper ;
    private final BookRepository bookRepository;
    @Override
    public BookDto saveBook(BookDto bookDto) {
        Book book = bookMapper.fromBookDtoToBook(bookDto);
        book = bookRepository.save(book);
        return bookMapper.fromBookToBookDto(book);
    }

    @Override
    public boolean deletBook(Long id) {
        try {
            bookRepository.deleteById(id);
            return true;
        }catch (Exception e) {
            return false;
        }

    }

    @Override
    public BookDto getBookById(Long id) {

            Book book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found with id: " + id));
            return bookMapper.fromBookToBookDto(book);
    }

    @Override
    public List<BookDto> saveBook(List<BookDto> bookDtos) {
        List<Book> bookList = new ArrayList<>();
        for (BookDto bookDto : bookDtos){
            bookList.add(bookMapper.fromBookDtoToBook(bookDto));
        }
        bookList = bookRepository.saveAll(bookList);
        bookDtos=new ArrayList<>();
        for (Book book : bookList){
            bookDtos.add(bookMapper.fromBookToBookDto(book));
        }
        return bookDtos;
    }

    @Override
    public BookDto getBooksByTitle(String title) {
       BookDto bookDto= bookRepository.getBooksByTitle(title);
        return bookDto ;
    }
}
