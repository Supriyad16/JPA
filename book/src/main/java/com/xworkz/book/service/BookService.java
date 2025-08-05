package com.xworkz.book.service;

import com.xworkz.book.entity.BookEntity;

public interface BookService {

    BookEntity save(BookEntity bookEntity);

    BookEntity getBookEntityById(int id);

    boolean updateBookEntityById(int id,String bookName);

    void deleteBookEntityById(int id);

    }


