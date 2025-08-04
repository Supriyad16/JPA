package com.xworkz.book.runner;

import com.xworkz.book.entity.BookEntity;
import com.xworkz.book.service.BookService;
import com.xworkz.book.service.BookServiceImp;

public class BookRunner {

    public static void main(String[] args) {

        BookEntity bookEntity = new BookEntity(1,"Verity", "Collen Hover",250);
        BookEntity bookEntity1 = new BookEntity(2,"Silent Patient", "Alexander", 300);
        BookEntity bookEntity2 = new BookEntity(3,"Two states", "Chethan Bhagath", 350);


        BookService bookService = new BookServiceImp();
       // bookService.save(bookEntity);
        bookService.save(bookEntity1);
        bookService.save(bookEntity2);
    }
}
