package com.xworkz.doctor.runner;


import com.xworkz.doctor.entity.DoctorEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class DoctorRunner {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("abc");

        EntityManager em = emf.createEntityManager();

        EntityTransaction et = em.getTransaction();

        et.begin();

        List<DoctorEntity> doctorEntities = new ArrayList<>();
        doctorEntities.add(new DoctorEntity(1,"Supriya","Appolo","Cardialogist",90000,2));
        doctorEntities.add(new DoctorEntity(2, "Rohit", "Fortis", "Neurologist", 120000, 5));
        doctorEntities.add(new DoctorEntity(3, "Anirudh", "Manipal", "Dermatologist", 75000, 3));
        doctorEntities.add(new DoctorEntity(4, "Karan", "Narayana", "Orthopedic", 98000, 4));
        doctorEntities.add(new DoctorEntity(5, "Divya", "Columbia Asia", "Pediatrician", 88000, 6));
        doctorEntities.add(new DoctorEntity(6, "Siddharth", "Aster", "Oncologist", 135000, 8));
        doctorEntities.add(new DoctorEntity(7, "Meera", "Apollo", "Gynecologist", 92000, 2));
        doctorEntities.add(new DoctorEntity(8, "Arjun", "Fortis", "Psychiatrist", 87000, 5));
        doctorEntities.add(new DoctorEntity(9, "Neha", "Manipal", "Endocrinologist", 95000, 3));
        doctorEntities.add(new DoctorEntity(10, "Vikram", "Narayana", "Nephrologist", 102000, 4));

        for(DoctorEntity doctorEntity : doctorEntities ){
            em.persist(doctorEntity);
        }

      //  DoctorEntity doctorEntity = em.find(DoctorEntity.class,1);

        et.commit();
        em.close();
         }
    }

