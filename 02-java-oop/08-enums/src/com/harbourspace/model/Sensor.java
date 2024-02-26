package com.harbourspace.model;

import java.util.Properties;

public record Sensor(
        UnitType unit,
        double value
) {

    public boolean isCelsius(){
        return unit.equals(UnitType.CELSIUS);
    }

    public boolean isFahrenheit(){
        return unit.equals(UnitType.FAHRENHEIT);
    }

    public Sensor toFahrenheit(){

        return switch (unit) {
            case CELSIUS -> new Sensor(UnitType.FAHRENHEIT, value * 9 / 5 + 32);
            case FAHRENHEIT -> this;
        };
    }

    public Sensor toCelsius(){
        return switch (unit) {
            case FAHRENHEIT -> new Sensor(UnitType.CELSIUS, (value-32) * 5/9);
            case CELSIUS -> this;
        };
    }

    public boolean valueEquals(Sensor temperatureSensor){
        return toCelsius().value == temperatureSensor.value || toFahrenheit().value == temperatureSensor.value;

    }




}
