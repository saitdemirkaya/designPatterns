package com.example.DesignPatterns.CompositePattern;

public class Telephone implements Technological {

    String colorName;

    public Telephone(String colorName) {
        this.colorName = colorName;
    }

    @Override
    public int price() {
        return 2500;
    }

    @Override
    public String getColor() {
        return "Telephone color : " + colorName;
    }
}
