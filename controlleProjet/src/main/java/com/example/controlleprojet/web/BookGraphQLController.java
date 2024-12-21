package com.example.controlleprojet.web;

import com.example.controlleprojet.dto.BookDto;
import com.example.controlleprojet.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookGraphQLController {

    private final BookService bookService;

    @Autowired
    public BookGraphQLController(BookService bookService) {
        this.bookService = bookService;
    }

    // Query: Get a book by its title
    /*@QueryMapping
    public BookDto getBookByTitle(@Argument String title) {
        // Logique pour récupérer un livre par titre
        return bookService.getBooksByTitle(title);
    }*/

    // Mutation: Save a book
    @MutationMapping
    public BookDto saveBook(@Argument BookDto bookDto) {
        // Logique pour sauvegarder un livre
        return bookService.saveBook(bookDto);
    }
}
