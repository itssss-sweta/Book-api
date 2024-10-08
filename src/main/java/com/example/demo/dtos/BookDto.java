package com.example.demo.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDto {
    private String bookTitle;
    private long isbn;
    private String authorName;
    private double price;
}