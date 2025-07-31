package com.xworkz.doctor.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctor_details")
public class DoctorEntity {

    @Id
    private int id;
    @Column(name="dname")
    private String doctorName;

    @Column(name="hname")
    private  String hospitalName;

    private String specialist;

    private int salary;

    private int experience;

    public DoctorEntity(){
    }

    public DoctorEntity(int id, String doctorName, String hospitalName, String specialist, int salary, int experience) {
        this.id = id;
        this.doctorName = doctorName;
        this.hospitalName = hospitalName;
        this.specialist = specialist;
        this.salary = salary;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
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
        return "DoctorEntity{" +
                "id=" + id +
                ", doctorName='" + doctorName + '\'' +
                ", hospitalName='" + hospitalName + '\'' +
                ", specialist='" + specialist + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }
}
