package com.example.DesignPatterns.AdapterPattern;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abstractFactory")
@Scope("prototype")
public class AdapterRestController {

    public static final String NOT_FOUND_LEAUGE = "Not Found Leauge!";

    @GetMapping("/{distanceUnit}/{distance}")
    public Double calculateDistance(@PathVariable("distanceUnit") String distanceUnit, @PathVariable("distance") Integer distance) {
        return getDistance(distanceUnit, distance);
    }

    private double getDistance(String distanceUnit, Integer distance) {
        return distanceUnit.equalsIgnoreCase("mile") ?
                calcuteMileToKm(distance) : distance;

    }

    private double calcuteMileToKm(Integer distance) {
        return distance * (1.61);
    }
}
