package com.example.DesignPatterns.FactoryPattern;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/factory")
@Scope("prototype")
public class FactoryRestController {

    public static final String NOT_FOUND_VEHICLE = "Not Found Vehicle!";

    @GetMapping("/{name}")
    public String getVehicleByName(@PathVariable("name") String name) {

        Optional<Logistics> vehicle = new VehicleFactory().getVehicle(name);
        return vehicle.isPresent() ?
                vehicle.get().delivery() : NOT_FOUND_VEHICLE;
    }
}
