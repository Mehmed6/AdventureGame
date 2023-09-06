package com.patika.adventure.game.character;

class Samuray extends Player {
    public Samuray()
    {
        setId(1);
        setDamage(5);
        setHealthy(21);
        setMoney(15);
        setName("Samuray");
        setInventory(new Inventory());
    }
}