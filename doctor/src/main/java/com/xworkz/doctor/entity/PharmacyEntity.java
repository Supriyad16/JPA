package com.xworkz.doctor.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pharmacy_details")
public class PharmacyEntity {

    @Id
    private int id;

    @Column(name = "pname")
    private String pharmacyName;

    private String area;

    @Column(name = "cname")
    private String cashierName;

    private int totalMedicines;

    @Column(name = "phnumber")
    private  String phoneNumber;

    public PharmacyEntity() {
    }

    public PharmacyEntity(int id, String pharmacyName, String area, String cashierName, int totalMedicines, String phoneNumber) {
        this.id = id;
        this.pharmacyName = pharmacyName;
        this.area = area;
        this.cashierName = cashierName;
        this.totalMedicines = totalMedicines;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCashierName() {
        return cashierName;
    }

    public void setCashierName(String cashierName) {
        this.cashierName = cashierName;
    }

    public int getTotalMedicines() {
        return totalMedicines;
    }

    public void setTotalMedicines(int totalMedicines) {
        this.totalMedicines = totalMedicines;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "PharmacyEntity{" +
                "id=" + id +
                ", pharmacyName='" + pharmacyName + '\'' +
                ", area='" + area + '\'' +
                ", cashierName='" + cashierName + '\'' +
                ", totalMedicines=" + totalMedicines +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
