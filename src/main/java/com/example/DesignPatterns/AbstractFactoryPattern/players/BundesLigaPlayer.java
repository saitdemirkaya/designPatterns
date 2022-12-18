package com.example.DesignPatterns.AbstractFactoryPattern.players;

import com.example.DesignPatterns.AbstractFactoryPattern.IPlayer;

public class BundesLigaPlayer implements IPlayer {
    @Override
    public String GetTopScorer() {
        return "Bundesliga best player is Lewandowski";
    }
}
