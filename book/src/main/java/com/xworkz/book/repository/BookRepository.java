package com.xworkz.book.repository;

import com.xworkz.book.entity.BookEntity;

public interface BookRepository {

    BookEntity save(BookEntity bookEntity);

    BookEntity getBookEntityById(int id);

    boolean updateBookEntityById(int id, String bookName);

    BookEntity deleteBookEntityById(int id);


}
