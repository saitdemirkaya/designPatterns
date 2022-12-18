package com.example.DesignPatterns.AbstractFactoryPattern.teams;

import com.example.DesignPatterns.AbstractFactoryPattern.ITeam;

public class BayernMunich implements ITeam {
    @Override
    public String GetTeamColor() {
        return "Best Team Bayern Munich and colors Red and White";
    }
}
