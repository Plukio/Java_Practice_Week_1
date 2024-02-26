package com.harbourspace.model;


public record Sensor(
        SensorType type,
        UnitType unit,
        double value
) {

    public Sensor{
        switch (type){
            case TEMPERATURE -> {
                if (unit.equals(UnitType.MILLIMETER) || unit.equals(UnitType.PERCENT)){
                    Error.invalidUnitError();
                }
            }
            case HUMIDITY -> {
                if ((unit.equals(UnitType.FAHRENHEIT) || unit.equals(UnitType.CELSIUS) || unit.equals(UnitType.MILLIMETER))){
                    Error.invalidUnitError();
                }
            }
            case PRECIPITATION -> {
                if ((unit.equals(UnitType.FAHRENHEIT) || unit.equals(UnitType.CELSIUS) || unit.equals(UnitType.PERCENT))){
                    Error.invalidUnitError();
                }
            }
        }
    }
    public boolean isCelsius(){
        return unit.equals(UnitType.CELSIUS);
    }

    public boolean isFahrenheit(){
        return unit.equals(UnitType.FAHRENHEIT);
    }

    public Sensor toFahrenheit(){

        return switch (unit) {
            case CELSIUS -> new Sensor(SensorType.TEMPERATURE,UnitType.FAHRENHEIT, value * 9 / 5 + 32);
            case FAHRENHEIT -> this;
            case PERCENT, MILLIMETER -> Error.invalidUnitError();
        };
    }

    public Sensor toCelsius(){
        return switch (unit) {
            case FAHRENHEIT -> new Sensor(SensorType.TEMPERATURE,UnitType.CELSIUS, (value-32) * 5/9);
            case CELSIUS -> this;
            case PERCENT, MILLIMETER -> Error.invalidUnitError();
        };
    }

    public boolean valueEquals(Sensor temperatureSensor){
        if (type == temperatureSensor.type){
            if (type == SensorType.TEMPERATURE){
                return  toCelsius().value == temperatureSensor.value || toFahrenheit().value == temperatureSensor.value;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }




}
