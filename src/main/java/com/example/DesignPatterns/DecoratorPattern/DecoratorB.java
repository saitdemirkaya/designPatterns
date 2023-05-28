package com.example.DesignPatterns.DecoratorPattern;

public class DecoratorB implements IComponent {
    IComponent component;

    public DecoratorB(IComponent component) {
        this.component = component;
    }

    @Override
    public String operation() {
        return null;
    }
    public String Operation()
    {
        String s = component.operation();
        s += " to School";

        return s;
    }

}
