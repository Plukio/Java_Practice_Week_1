package com.harbourspace.model;

public enum SensorType {
    // enum body
    TEMPERATURE("Temperature"),
    HUMIDITY("Humidity"),
    PRECIPITATION("Precipitation");

    private final String typeName;

    public String getTypeName() {
        return typeName;
    }

    SensorType(String typeName){
        this.typeName = typeName;
    }

}
