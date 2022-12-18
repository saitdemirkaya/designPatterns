package com.example.DesignPatterns.Prototype;

import com.example.DesignPatterns.AbstractFactoryPattern.Football;
import com.example.DesignPatterns.AbstractFactoryPattern.LeaugeFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/prototype")
@Scope("prototype")
public class PrototypeRestController {

    public static final String NOT_FOUND_LEAUGE = "Not Found Leauge!";

    @GetMapping()
    public String createPrototype() {

        Soldier soldier = new Soldier(85,90,30,2,9,3,"Gun",false);
        Soldier cloneSoldier = soldier.clone();
        cloneSoldier.setAvailableForWar(true);

        return cloneSoldier.showSoldierInfo();
    }
}
