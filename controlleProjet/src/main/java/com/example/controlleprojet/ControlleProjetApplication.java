package com.example.controlleprojet;

import com.example.controlleprojet.dao.entities.Book;
import com.example.controlleprojet.dao.repository.BookRepository;
import com.example.controlleprojet.dto.BookDto;
import com.example.controlleprojet.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ControlleProjetApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControlleProjetApplication.class, args);
    }

    @Bean
    CommandLineRunner start(BookService bookService) {
        return args -> {
            bookService.saveBook(
                    List.of(
                            BookDto.builder().price(15).resume("resume1").titre("livre1").build(),
                            BookDto.builder().price(120).resume("resume2").titre("livre2").build(),
                            BookDto.builder().price(19).resume("resume3").titre("livre3").build(),
                            BookDto.builder().price(44).resume("resume4").titre("livre4").build()

                    )

            );
        };
    }
}