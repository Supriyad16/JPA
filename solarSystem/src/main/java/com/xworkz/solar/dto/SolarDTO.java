package com.xworkz.solar.dto;


//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//
//@AllArgsConstructor
//@Getter
//@Setter
//@ToString
public class SolarDTO {

    private String name;
    private int number;
    private String colour;
    private int satellite;

    public SolarDTO() {
    }

    public SolarDTO(String name, int number, String colour, int satellite) {
        this.name = name;
        this.number = number;
        this.colour = colour;
        this.satellite = satellite;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setSatellite(int satellite) {
        this.satellite = satellite;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getColour() {
        return colour;
    }

    public int getSatellite() {
        return satellite;
    }

    @Override
    public String toString() {
        return "SolarDTO{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", colour='" + colour + '\'' +
                ", satellite=" + satellite +
                '}';
    }
}
