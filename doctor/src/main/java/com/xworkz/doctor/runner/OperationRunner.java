package com.xworkz.doctor.runner;

import com.xworkz.doctor.entity.OperationEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class OperationRunner {


    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("abc");

        EntityManager em = emf.createEntityManager();

        EntityTransaction et = em.getTransaction();

        et.begin();

        List<OperationEntity> operationEntities = new ArrayList<>();
        operationEntities.add(new OperationEntity(1,123,"Heart","Sita","Preetha",85000));
        operationEntities.add(new OperationEntity(2, 124, "Kidney", "Ramesh", "Dr. Anjali", 65000));
        operationEntities.add(new OperationEntity(3, 125, "Appendix", "Kiran", "Dr. Meera", 30000));
        operationEntities.add(new OperationEntity(4, 126, "Brain", "Raghu", "Dr. Vivek", 120000));
        operationEntities.add(new OperationEntity(5, 127, "Liver", "Suma", "Dr. Nitin", 95000));
        operationEntities.add(new OperationEntity(6, 128, "Eye", "Neha", "Dr. Preethi", 20000));
        operationEntities.add(new OperationEntity(7, 129, "Gallbladder", "Ajay", "Dr. Kavya", 45000));
        operationEntities.add(new OperationEntity(8, 130, "Spine", "Deepa", "Dr. Raj", 105000));
        operationEntities.add(new OperationEntity(9, 131, "Lung", "Vikram", "Dr. Aruna", 98000));
        operationEntities.add(new OperationEntity(10, 132, "Thyroid", "Bhavya", "Dr. Prakash", 40000));


        for(OperationEntity operationEntity: operationEntities){
            em.persist(operationEntity);
        }

      //  OperationEntity operationEntity = em.find(OperationEntity.class,1);

        et.commit();
        em.close();
    }
}
