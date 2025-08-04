package com.xworkz.book.service;

import com.xworkz.book.entity.BookEntity;
import com.xworkz.book.repository.BookRepository;
import com.xworkz.book.repository.BookRepositoryImp;

public class BookServiceImp implements BookService{

    @Override
    public BookEntity save(BookEntity bookEntity) {

        System.out.println("Service Implements"+bookEntity);

        BookRepository bookRepository = new BookRepositoryImp();
        bookRepository.save(bookEntity);

        return null;
    }


}
