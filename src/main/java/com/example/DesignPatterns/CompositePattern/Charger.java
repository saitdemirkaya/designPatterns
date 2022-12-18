package com.example.DesignPatterns.CompositePattern;

public class Charger implements Technological {

    String colorName;

    public Charger(String colorName) {
        this.colorName = colorName;
    }

    @Override
    public int price() {
        return 30;
    }

    @Override
    public String getColor() {
        return "Charger color : " + colorName;
    }

}
