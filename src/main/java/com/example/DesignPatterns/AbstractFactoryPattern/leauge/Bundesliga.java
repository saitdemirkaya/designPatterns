package com.example.DesignPatterns.AbstractFactoryPattern.leauge;

import com.example.DesignPatterns.AbstractFactoryPattern.Football;
import com.example.DesignPatterns.AbstractFactoryPattern.IPlayer;
import com.example.DesignPatterns.AbstractFactoryPattern.ITeam;
import com.example.DesignPatterns.AbstractFactoryPattern.players.BundesLigaPlayer;
import com.example.DesignPatterns.AbstractFactoryPattern.teams.BayernMunich;

public class Bundesliga implements Football {
    @Override
    public ITeam getTeam() {
        return new BayernMunich();
    }

    @Override
    public IPlayer getPlayer()
    {
        return new BundesLigaPlayer();
    }

    @Override
    public boolean accept(String leaugeName) {
        return leaugeName.equalsIgnoreCase("BundesLiga");
    }
}
