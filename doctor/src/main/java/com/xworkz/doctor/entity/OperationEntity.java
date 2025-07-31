package com.xworkz.doctor.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "operation_details")
public class OperationEntity {

    @Id
    private int id;

    @Column(name = "onumber")
    private int operationNumber;

    @Column(name = "oname")
    private String operationName;

    @Column(name="dname")
    private String doctorName;

    @Column(name = "pname")
    private String patientName;

    private int bill;

    public OperationEntity() {
    }

    public OperationEntity(int id, int operationNumber, String operationName, String doctorName, String patientName, int bill) {
        this.id = id;
        this.operationNumber = operationNumber;
        this.operationName = operationName;
        this.doctorName = doctorName;
        this.patientName = patientName;
        this.bill = bill;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOperationNumber() {
        return operationNumber;
    }

    public void setOperationNumber(int operationNumber) {
        this.operationNumber = operationNumber;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "OperationEntity{" +
                "id=" + id +
                ", operationNumber=" + operationNumber +
                ", operationName=" + operationName +
                ", doctorName='" + doctorName + '\'' +
                ", patientName='" + patientName + '\'' +
                ", bill=" + bill +
                '}';
    }
}
