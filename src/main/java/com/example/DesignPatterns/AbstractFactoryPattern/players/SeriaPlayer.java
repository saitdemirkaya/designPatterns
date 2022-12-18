package com.example.DesignPatterns.AbstractFactoryPattern.players;

import com.example.DesignPatterns.AbstractFactoryPattern.IPlayer;

public class SeriaPlayer implements IPlayer {
    @Override
    public String GetTopScorer() {
        return "Seria best player is Ronaldo";
    }
}
