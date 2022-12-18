package com.example.DesignPatterns.FactoryPattern;

public class Truck implements RoadLogistics {

    private static final String TRUCK = "TRUCK";

    @Override
    public boolean accept(String vehicleName) {
        return vehicleName.equalsIgnoreCase(TRUCK);
    }

    @Override
    public String delivery() {
        return "The product transport by Truck!";
    }
}
