package com.harbourspace.model;

public record Sensor(
        String unit,
        double value
) {


    // you can define constant for FAHRENHEIT

    public Sensor {
        if (!unit.equals("C") && !unit.equals("F")) {
            Error.invalidUnitError();
        }
    }

    // implement all the methods
    public boolean isCelsius(){
        return unit.equals("C");
    }

    public boolean isFahrenheit(){
        return unit.equals("F");
    }

    public Sensor toFahrenheit(){
        if (isFahrenheit()){
            return new Sensor("F", value);
        } else {
            return new Sensor("F", value * 9 / 5 + 32);
        }
    }

    public Sensor toCelsius(){
        if (isCelsius()){
            return this;
        } else {
            return new Sensor("C", (value-32) * 5/9);
        }
    }

    public boolean valueEquals(Sensor temperatureSensor){
        return toCelsius().value == temperatureSensor.value || toFahrenheit().value == temperatureSensor.value;

    }


}
