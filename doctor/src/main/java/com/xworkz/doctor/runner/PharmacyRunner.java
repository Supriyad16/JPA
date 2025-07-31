package com.xworkz.doctor.runner;

import com.xworkz.doctor.entity.PatientEntity;
import com.xworkz.doctor.entity.PharmacyEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class PharmacyRunner {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("abc");

        EntityManager em = emf.createEntityManager();

        EntityTransaction et = em.getTransaction();

        et.begin();

        List<PharmacyEntity> pharmacyEntities = new ArrayList<>();

        pharmacyEntities.add(new PharmacyEntity(1,"MedPlus", "Rajajinagar","Rama",1500,"1564892314"));
        pharmacyEntities.add(new PharmacyEntity(2, "Apollo Pharmacy", "BTM Layout", "Suresh", 2000, "9845123456"));
        pharmacyEntities.add(new PharmacyEntity(3, "NetMeds", "Indiranagar", "Kavya", 1800, "9731648723"));
        pharmacyEntities.add(new PharmacyEntity(4, "Wellness Forever", "Jayanagar", "Manoj", 2200, "9912345678"));
        pharmacyEntities.add(new PharmacyEntity(5, "1MG", "Whitefield", "Divya", 1700, "9988776655"));
        pharmacyEntities.add(new PharmacyEntity(6, "Guardian Pharmacy", "Koramangala", "Anil", 1950, "9345678123"));
        pharmacyEntities.add(new PharmacyEntity(7, "Frank Ross", "Malleswaram", "Sneha", 1600, "9876543210"));
        pharmacyEntities.add(new PharmacyEntity(8, "Myra Medicines", "Hebbal", "Ravi", 1550, "9632587410"));
        pharmacyEntities.add(new PharmacyEntity(9, "Care n Cure", "Banashankari", "Preeti", 1450, "9123456789"));
        pharmacyEntities.add(new PharmacyEntity(10, "Health & Glow", "Basavanagudi", "Arjun", 2100, "9873214560"));


        for(PharmacyEntity pharmacyEntity: pharmacyEntities){
            em.persist(pharmacyEntity);
        }

       // PharmacyEntity pharmacyEntity = em.find(PharmacyEntity.class,1);

        et.commit();
        em.close();

    }
}
