package com.example.DesignPatterns.CompositePattern;

public class SelfieStick implements Accessory {

    String colorName;

    public SelfieStick(String colorName) {
        this.colorName = colorName;
    }

    @Override
    public int price() {
        return 5;
    }

    @Override
    public String getColor() {
        return "SelfieStick color : " + colorName;
    }
}
