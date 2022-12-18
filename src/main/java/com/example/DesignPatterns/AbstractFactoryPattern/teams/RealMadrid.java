package com.example.DesignPatterns.AbstractFactoryPattern.teams;

import com.example.DesignPatterns.AbstractFactoryPattern.ITeam;

public class RealMadrid implements ITeam {
    @Override
    public String GetTeamColor() {
        return "Best Team Real Madrid and colors Blue and White";
    }
}
