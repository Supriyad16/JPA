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
}
