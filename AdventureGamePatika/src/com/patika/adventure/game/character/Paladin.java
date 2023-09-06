package com.patika.adventure.game.character;

class Paladin extends Player {
    public Paladin()
    {
        setId(3);
        setDamage(8);
        setHealthy(24);
        setMoney(5);
        setName("Şovalye");
        setInventory(new Inventory());
    }
}
