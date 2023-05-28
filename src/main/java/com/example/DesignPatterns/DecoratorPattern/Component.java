package com.example.DesignPatterns.DecoratorPattern;

public class Component implements IComponent{
    @Override
    public String operation() {
        return "I am walking ";
    }
}
