package com.example.DesignPatterns.CompositePattern;

public class Headphone implements Technological {

    String colorName;

    public Headphone(String colorName) {
        this.colorName = colorName;
    }

    @Override
    public int price() {
        return 10;
    }

    @Override
    public String getColor() {
        return "Headphone color : " + colorName;
    }
}
