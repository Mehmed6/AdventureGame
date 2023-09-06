package com.patika.adventure.game.obstacle;

public class Zombie extends Obstacle{
    public Zombie()
    {
        super("Zombie");
        setId(1);
        setDamage(3);
        setHealthy(10);
        setMoney(4);
    }
}
