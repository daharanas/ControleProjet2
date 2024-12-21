package com.example.controlleprojet.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder

public class Book {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Book ;
    private String titre ;
    private String publisher ;
    private float price ;
    private String resume ;
}
