package com.example.DesignPatterns.DecoratorPattern;

import com.example.DesignPatterns.recDeneme;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/decorator")
@Scope("prototype")
public class DecoratorRestController {


    @GetMapping("")
    public String calculateDecorator() {

        IComponent component = new Component();
        StringBuilder result = new StringBuilder();
        result.append("Basic Component " + component.operation());
        result.append("\nDecorator A " + new DecoratorA(component).Operation());
        result.append("\nDecorator B " + new DecoratorB(component).Operation());
        result.append("\nDecorator B - A" + new DecoratorB(new DecoratorA(component)).Operation());
        return result.toString();
    }

}
