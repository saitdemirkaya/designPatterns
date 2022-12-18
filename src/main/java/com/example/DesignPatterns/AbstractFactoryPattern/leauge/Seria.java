package com.example.DesignPatterns.AbstractFactoryPattern.leauge;

import com.example.DesignPatterns.AbstractFactoryPattern.Football;
import com.example.DesignPatterns.AbstractFactoryPattern.IPlayer;
import com.example.DesignPatterns.AbstractFactoryPattern.ITeam;
import com.example.DesignPatterns.AbstractFactoryPattern.players.SeriaPlayer;
import com.example.DesignPatterns.AbstractFactoryPattern.teams.Juventus;

public class Seria implements Football {
    @Override
    public ITeam getTeam() {
        return new Juventus();
    }

    @Override
    public IPlayer getPlayer() {
        return new SeriaPlayer();
    }


    @Override
    public boolean accept(String leaugeName) {
        return leaugeName.equalsIgnoreCase("Seria");
    }
}
