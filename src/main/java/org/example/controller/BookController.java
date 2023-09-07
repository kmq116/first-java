package org.example.controller;

import org.example.Book;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class BookController {
    @GetMapping("/book")
    public Book book() {
        Book book = new Book();
        book.setAuthor("罗贯中");
        book.setName("三国演义");
        book.setPrice(30f);
        book.setPublicationDate(new Date());
        return book;
    }

    @PostMapping("/book")
    public String addBook(String name) {
        return "receive post request" + name;
    }

    @DeleteMapping("/book/{id}")
    public String deleteBook(@PathVariable Long id) {
        return String.valueOf(id) + " deleted";
    }


}
