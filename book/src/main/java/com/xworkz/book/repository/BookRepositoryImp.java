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

    @Override
    public BookEntity getBookEntityById(int id) {

        EntityManagerFactory emf = null;
        EntityManager em = null;
        EntityTransaction et = null;
        BookEntity book = null;

        try
        {
            emf = Persistence.createEntityManagerFactory("abc");
            em = emf.createEntityManager();
            et = em.getTransaction();
            et.begin();

          book =   em.find(BookEntity.class,id);
            et.commit();

        }

        catch (Exception e){
            if (et.isActive()){
                et.rollback();
            }
        }

        finally{
            emf.close();
        }
        return book;
    }

    @Override
    public boolean updateBookEntityById(int id, String bookName) {

        EntityManagerFactory emf = null;
        EntityManager em = null;
        EntityTransaction et = null;
        BookEntity book = null;

        try
        {
            emf = Persistence.createEntityManagerFactory("abc");
            em = emf.createEntityManager();
            et = em.getTransaction();
            et.begin();

            book =   em.find(BookEntity.class,id);
            book.setBookName(bookName);
            et.commit();
            return true;

        }

        catch (Exception e){
            if (et.isActive()){
                et.rollback();
            }
        }

        finally{
            emf.close();
        }
        return false;

    }

    @Override
    public BookEntity deleteBookEntityById(int id) {

        EntityManagerFactory emf = null;
        EntityManager em = null;
        EntityTransaction et = null;
        BookEntity book = null;

        try
        {
            emf = Persistence.createEntityManagerFactory("abc");
            em = emf.createEntityManager();
            et = em.getTransaction();
            et.begin();

            book =   em.find(BookEntity.class,id);
            em.remove(book);
            et.commit();

        }

        catch (Exception e){
            if (et.isActive()){
                et.rollback();
            }
        }

        finally{
            emf.close();
        }

        return null;
    }
}
