package com.example.DesignPatterns.AbstractFactoryPattern;

import com.example.DesignPatterns.AbstractFactoryPattern.leauge.Bundesliga;
import com.example.DesignPatterns.AbstractFactoryPattern.leauge.LaLiga;
import com.example.DesignPatterns.AbstractFactoryPattern.leauge.Seria;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LeaugeFactory {

    List<Football> footballList = new ArrayList<>();

    public LeaugeFactory() {
        this.footballList.add(new LaLiga());
        this.footballList.add(new Bundesliga());
        this.footballList.add(new Seria());
    }
    public Optional<Football> getTeamAndPlayerByName(String leaugeName){

        return footballList.stream().filter(football -> football.accept(leaugeName)).findFirst();
    }
}
