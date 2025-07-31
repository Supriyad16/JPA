package com.xworkz.doctor.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient_details")
public class PatientEntity {

    @Id
    private int id;
    @Column(name = "pname")
    private String patientName;

    @Column(name="dname")
    private String doctorName;

    private String disease;

    private String medicine;

    private int bill;

    public PatientEntity() {
    }

    public PatientEntity(int id, String patientName, String doctorName, String disease, String medicine, int bill) {
        this.id = id;
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.disease = disease;
        this.medicine = medicine;
        this.bill = bill;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "PatientEntity{" +
                "id=" + id +
                ", patientName='" + patientName + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", disease='" + disease + '\'' +
                ", medicine='" + medicine + '\'' +
                ", bill=" + bill +
                '}';
    }
}


