package com.xworkz.solar.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name= "")
@Entity


public class SolarEntity {

    @Id
    private int id;

    @Column(name = "planet_name")
    private String name ;

    @Column(name = "planet_number")
    private int number ;

    @Column(name = "planet_colour")
    private String colour ;

    @Column(name = "noof_satellite")
    private int satellite ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getSatellite() {
        return satellite;
    }

    public void setSatellite(int satellite) {
        this.satellite = satellite;
    }
}
