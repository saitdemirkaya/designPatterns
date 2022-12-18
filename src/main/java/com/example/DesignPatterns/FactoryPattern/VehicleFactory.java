package com.example.DesignPatterns.FactoryPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VehicleFactory {

    List<Logistics> logisticsVehicle = new ArrayList<>();

    public VehicleFactory() {
        this.logisticsVehicle.add(new Car());
        this.logisticsVehicle.add(new Ship());
        this.logisticsVehicle.add(new Truck());
    }

    public Optional<Logistics> getVehicle(String vehicleName){
        return logisticsVehicle.stream().filter(logistics -> logistics.accept(vehicleName)).findFirst();
    }
}
