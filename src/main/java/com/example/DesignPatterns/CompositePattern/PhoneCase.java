package com.example.DesignPatterns.CompositePattern;

public class PhoneCase implements Accessory {

    String colorName;

    public PhoneCase(String colorName) {
        this.colorName = colorName;
    }


    @Override
    public int price() {
        return 8;
    }

    @Override
    public String getColor() {
        return "PhoneCase color : " + colorName;
    }
}
