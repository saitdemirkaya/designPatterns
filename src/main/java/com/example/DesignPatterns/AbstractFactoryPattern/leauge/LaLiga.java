package com.example.DesignPatterns.AbstractFactoryPattern.leauge;

import com.example.DesignPatterns.AbstractFactoryPattern.Football;
import com.example.DesignPatterns.AbstractFactoryPattern.IPlayer;
import com.example.DesignPatterns.AbstractFactoryPattern.ITeam;
import com.example.DesignPatterns.AbstractFactoryPattern.players.LaLigaPlayer;
import com.example.DesignPatterns.AbstractFactoryPattern.teams.RealMadrid;

public class LaLiga implements Football {
    @Override
    public ITeam getTeam() {
        return new RealMadrid();
    }

    @Override
    public IPlayer getPlayer() {
        return new LaLigaPlayer();
    }


    @Override
    public boolean accept(String leaugeName) {
        return leaugeName.equalsIgnoreCase("LaLiga");
    }
}
