package com.example.DesignPatterns.FactoryPattern;

public class Car implements RoadLogistics {

    private static final String CAR = "CAR";

    @Override
    public boolean accept(String vehicleName) {
        return vehicleName.equalsIgnoreCase(CAR);
    }

    @Override
    public String delivery() {
        return "The product transport by Car!";
    }
}
