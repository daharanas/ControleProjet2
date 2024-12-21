package com.example.controlleprojet.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder


public class BookDto {

    private int id_Book ;
    private String titre ;
    private String publisher ;
    private float price ;
    private String resume ;
}
