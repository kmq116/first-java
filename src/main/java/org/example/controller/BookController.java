package org.example.controller;

import org.example.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class BookController {
 @GetMapping("/book")
 public Book book(){
     Book book = new Book();
     book.setAuthor("罗贯中");
     book.setName("三国演义");
     book.setPrice(30f);
     book.setPublicationDate(new Date());
     return book;
 }
}
