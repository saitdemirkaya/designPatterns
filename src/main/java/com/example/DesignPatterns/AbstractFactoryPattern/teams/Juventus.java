package com.example.DesignPatterns.AbstractFactoryPattern.teams;

import com.example.DesignPatterns.AbstractFactoryPattern.ITeam;

public class Juventus implements ITeam {
    @Override
    public String GetTeamColor() {
        return "Best Team Juventus and colors Black and White";
    }
}
