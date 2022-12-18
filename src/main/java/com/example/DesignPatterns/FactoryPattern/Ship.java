package com.example.DesignPatterns.FactoryPattern;

public class Ship implements SeaLogistics {

    private static final String SHIP = "SHIP";

    @Override
    public boolean accept(String vehicleName) {
        return vehicleName.equalsIgnoreCase(SHIP);
    }

    @Override
    public String delivery() {
        return "The product transport by Ship!";
    }
}
