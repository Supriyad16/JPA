package com.xworkz.doctor.runner;

import com.xworkz.doctor.entity.DoctorEntity;
import com.xworkz.doctor.entity.NurseEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class NurseRunner {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("abc");

        EntityManager em = emf.createEntityManager();

        EntityTransaction et = em.getTransaction();

        et.begin();

        List<NurseEntity> nurseEntities = new ArrayList<>();
        nurseEntities.add(new NurseEntity(1,"Asha", "Appolo","head", 25000, 3));
        nurseEntities.add(new NurseEntity(2, "Sneha", "Fortis", "assistant", 20000, 2));
        nurseEntities.add(new NurseEntity(3, "Radhika", "Manipal", "senior", 27000, 5));
        nurseEntities.add(new NurseEntity(4, "Divya", "Narayana", "head", 30000, 6));
        nurseEntities.add(new NurseEntity(5, "Meera", "Aster", "trainee", 18000, 1));
        nurseEntities.add(new NurseEntity(6, "Pooja", "Columbia Asia", "assistant", 21000, 2));
        nurseEntities.add(new NurseEntity(7, "Kavya", "Appolo", "senior", 29000, 4));
        nurseEntities.add(new NurseEntity(8, "Latha", "Fortis", "head", 31000, 7));
        nurseEntities.add(new NurseEntity(9, "Neha", "Manipal", "trainee", 19000, 1));
        nurseEntities.add(new NurseEntity(10, "Swathi", "Narayana", "senior", 28000, 5));


        for(NurseEntity nurseEntity : nurseEntities ){
            em.persist(nurseEntity);
        }

       //   NurseEntity nurseEntity = em.find(NurseEntity.class,1);

        et.commit();
        em.close();
    }

    }

