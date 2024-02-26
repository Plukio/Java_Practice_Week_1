package com.harbourspace.model;

/* TODO */
public record  Sensor(String unit, double value){

    public static final String CELSIUS = "C";
    public static final String FAHRENHEIT = "F";

    public Sensor{
        if (!(unit.equals("C") || unit.equals("F"))){
            Error.invalidUnitError();
        }
    }
}