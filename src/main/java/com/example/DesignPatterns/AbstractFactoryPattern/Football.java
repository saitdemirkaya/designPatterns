package com.example.DesignPatterns.AbstractFactoryPattern;

public interface Football {

    ITeam getTeam();

    IPlayer getPlayer();

    boolean accept(String leaugeName);
}
