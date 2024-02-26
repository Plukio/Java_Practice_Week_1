package com.harbourspace.model;

public enum UnitType {
    // enum body
    CELSIUS("C"),
    FAHRENHEIT("F"),
    PERCENT("%"),
    MILLIMETER("mm");

    private final String symbol;

    public String getSymbol() {
        return symbol;
    }

    UnitType(String symbol){
        this.symbol = symbol;
    }
}
