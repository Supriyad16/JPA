package com.xworkz.doctor.runner;

import com.xworkz.doctor.entity.NurseEntity;
import com.xworkz.doctor.entity.PatientEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class PatientRunner {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("abc");

        EntityManager em = emf.createEntityManager();

        EntityTransaction et = em.getTransaction();

        et.begin();

        List<PatientEntity> patientEntities = new ArrayList<>();
        patientEntities.add(new PatientEntity(1,"Raju","Anu","Fever", "Dolo650",300));
        patientEntities.add(new PatientEntity(2, "Sneha", "Kiran", "Cold", "Cetrizine", 150));
        patientEntities.add(new PatientEntity(3, "Anil", "Deepa", "Headache", "Paracetamol", 200));
        patientEntities.add(new PatientEntity(4, "Ramesh", "Priya", "Diabetes", "Metformin", 500));
        patientEntities.add(new PatientEntity(5, "Meena", "Ravi", "Allergy", "Allegra", 250));
        patientEntities.add(new PatientEntity(6, "Vikram", "Nisha", "Back Pain", "Flexon", 300));
        patientEntities.add(new PatientEntity(7, "Karthik", "Neha", "Infection", "Azithromycin", 400));
        patientEntities.add(new PatientEntity(8, "Divya", "Suman", "Cough", "Benadryl", 180));
        patientEntities.add(new PatientEntity(9, "Ajay", "Swathi", "Malaria", "Artemisinin", 600));
        patientEntities.add(new PatientEntity(10, "Bhavana", "Harish", "Throat Pain", "Strepsils", 120));

        for( PatientEntity patientEntity : patientEntities ){
            em.persist(patientEntity);
        }

         PatientEntity patientEntity = em.find(PatientEntity.class,1);

        et.commit();
        em.close();
    }
}