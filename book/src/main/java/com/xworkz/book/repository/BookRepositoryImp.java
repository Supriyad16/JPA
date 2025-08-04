package com.xworkz.book.repository;

import com.xworkz.book.entity.BookEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BookRepositoryImp implements BookRepository{
    @Override
    public BookEntity save(BookEntity bookEntity) {

        System.out.println("Repository implements"+bookEntity);

        EntityManagerFactory emf = null;
        EntityManager em = null;
        EntityTransaction et = null;

        try
        {
            emf = Persistence.createEntityManagerFactory("abc");
            em = emf.createEntityManager();
            et = em.getTransaction();

            et.begin();

            em.persist(bookEntity);
            et.commit();

        }

        catch (Exception e){

        }

        finally{
            emf.close();
        }

        return null;
    }
}
