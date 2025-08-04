package com.xworkz.book.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "book_details")

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class BookEntity {

    @Id
    private  int id;

    @Column(name = "bname")
    private String bookName;

    @Column(name = "bauthor")
    private String bookAuthor;

    @Column(name = "pages")
    private int noOfPages;

}
