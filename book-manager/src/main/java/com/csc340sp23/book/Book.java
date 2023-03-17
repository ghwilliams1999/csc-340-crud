package com.csc340sp23.book;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@Entity
@Table(name = "Book")
@NoArgsConstructor
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String author;
    private String ISBN;
    private double price;

    public Book(String title, String author, String ISBN, double price) {
        this.title = title;
        this.author=author;
        this.ISBN=ISBN;
        this.price = price;
    }

}
