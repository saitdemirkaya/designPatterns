package com.example.DesignPatterns.FactoryPattern;

public interface Logistics {

    boolean accept(String vehicleName);

    String delivery();
}
