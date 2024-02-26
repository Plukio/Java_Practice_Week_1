package com.harbourspace.model;

/* TODO */
public enum UnitType{
    CELSIUS("C"),
    FAHRENHEIT("F");
    private final String symbol;

    public String getSymbol(){
        return symbol;
    }

    UnitType(String symbol) {
        this.symbol = symbol;
    }
}