package com.example.DesignPatterns.AbstractFactoryPattern.players;

import com.example.DesignPatterns.AbstractFactoryPattern.IPlayer;

public class LaLigaPlayer implements IPlayer {
    @Override
    public String GetTopScorer() {
        return "LaLiga best player is Benzema";
    }
}
