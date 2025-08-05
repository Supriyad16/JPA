package com.xworkz.hostel.repository;

import com.xworkz.hostel.entity.HostelEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HostelRepositoryImp implements HostelRepository{
    @Override
    public HostelEntity save(HostelEntity hostelEntity) {

        System.out.println("Repository Implements"+hostelEntity);

        EntityManagerFactory emf = null;
        EntityManager em = null;
        EntityTransaction et = null;

        try
        {
            emf = Persistence.createEntityManagerFactory("abc");
            em = emf.createEntityManager();
            et = em.getTransaction();

            et.begin();

            em.persist(hostelEntity);
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
    public HostelEntity getHostelEntityById(int id) {EntityManagerFactory emf = null;

        EntityManagerFactory emf = null;
        EntityManager em = null;
        EntityTransaction et = null;
        HostelEntity hostel = null;

        try
        {
            emf = Persistence.createEntityManagerFactory("abc");
            em = emf.createEntityManager();
            et = em.getTransaction();
            et.begin();

            hostel = em.find(HostelEntity.class,id);
            et.commit();
        }

        catch (Exception e){
            if(et.isActive()){
                et.rollback();
            }
        }

        finally{
            emf.close();
        }

        return hostel;

    }

    @Override
    public boolean updateHostelEntityById(int id, String candidateName) {

        EntityManagerFactory emf = null;
        EntityManager em = null;
        EntityTransaction et = null;
        HostelEntity hostel = null;

        try
        {
            emf = Persistence.createEntityManagerFactory("abc");
            em = emf.createEntityManager();
            et = em.getTransaction();
            et.begin();

            hostel = em.find(HostelEntity.class,id);
            hostel.setCandidateName(candidateName);
            et.commit();
            return  true;
        }

        catch (Exception e){
            if(et.isActive()){
                et.rollback();
            }
        }

        finally{
            emf.close();
        }
        return false;
    }

    @Override
    public void deleteHostelEntityById(int id) {

        EntityManagerFactory emf = null;
        EntityManager em = null;
        EntityTransaction et = null;
        HostelEntity hostel = null;

        try
        {
            emf = Persistence.createEntityManagerFactory("abc");
            em = emf.createEntityManager();
            et = em.getTransaction();
            et.begin();

            hostel = em.find(HostelEntity.class,id);
            em.remove(hostel);
            et.commit();
        }

        catch (Exception e){
            if(et.isActive()){
                et.rollback();
            }
        }

        finally{
            emf.close();
        }
    }
}
