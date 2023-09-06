package com.patika.adventure.game.character;

class Arrow extends Player {
    public Arrow()
    {
        setId(2);
        setDamage(7);
        setHealthy(18);
        setMoney(20);
        setName("Okçu");
        setInventory(new Inventory());
    }
}
