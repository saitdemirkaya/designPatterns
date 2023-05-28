package com.example.DesignPatterns.DecoratorPattern;

public class DecoratorA implements IComponent{
    IComponent component;

    public DecoratorA(IComponent component) {
        this.component = component;
    }

    @Override
    public String operation() {
        return null;
    }
    public String Operation()
    {
        String s = component.operation();
        s += " and listening to Classin FM";

        return s;
    }

}
