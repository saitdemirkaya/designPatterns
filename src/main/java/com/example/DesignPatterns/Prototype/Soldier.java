package com.example.DesignPatterns.Prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Soldier implements Cloneable {
    private int health;
    private int speed;
    private int maxLifeTime;
    private int agility;
    private int power;
    private int rank;

    private String weapon;

    private boolean isAvailableForWar;

    public Soldier(int health, int speed, int maxLifeTime, int agility, int power, int rank, String weapon, boolean isAvailableForWar) {
        this.health = health;
        this.speed = speed;
        this.maxLifeTime = maxLifeTime;
        this.agility = agility;
        this.power = power;
        this.rank = rank;
        this.weapon = weapon;
        this.isAvailableForWar = isAvailableForWar;
    }

    public String showSoldierInfo() {
        StringBuilder result = new StringBuilder();
        result.append("Sağlık : ").append(health);
        result.append("Hız : ").append(speed);
        result.append("Yaşam Süresi : ").append(maxLifeTime);
        result.append("Çeviklik : ").append(agility);
        result.append("Güç : ").append(power);
        result.append("Rütbe : ").append(rank);
        result.append("Silah : ").append(weapon);
        if (isAvailableForWar) {
            result.append(" Savaşmaya hazır!");
        } else {
            result.append(" Bu asker savaşamaz!");
        }
        return result.toString();
    }


    @Override
    public Soldier clone() {

        Soldier soldier = null;

        try {
            soldier = (Soldier) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Asker kopyalama sırasında bir hata yaşandı!");
            e.printStackTrace();
        }

        return soldier;

    }
}
