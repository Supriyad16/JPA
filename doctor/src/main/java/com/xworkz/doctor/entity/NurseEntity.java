package com.xworkz.doctor.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nurse_details")
public class NurseEntity {

    @Id
    private int id;
    @Column(name="nname")
    private String nurseName;

    @Column(name="hname")
    private  String hospitalName;

    private String designation;

    private int salary;

    private int experience;

    public NurseEntity() {
    }

    public NurseEntity(int id, String nurseName, String hospitalName, String designation, int salary, int experience) {
        this.id = id;
        this.nurseName = nurseName;
        this.hospitalName = hospitalName;
        this.designation = designation;
        this.salary = salary;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNurseName() {
        return nurseName;
    }

    public void setNurseName(String nurseName) {
        this.nurseName = nurseName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "NurseEntity{" +
                "id=" + id +
                ", nurseName='" + nurseName + '\'' +
                ", hospitalName='" + hospitalName + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }
}

