package com.harbourspace.model;

public class MeteoStation {

    private String name;
    private Double[] position;

    public MeteoStation(String name, Double[] posi){
        this.name = name;
        this.position = posi;
    }

    // constructor 2
    public MeteoStation(String subject) {
        this.name = subject;
        this.position = null;
    }

    public String getName(){
        return this.name;
    }
    public Double[] getPosition() {
        return this.position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(Double[] position) {
        this.position = position;
    }
}
