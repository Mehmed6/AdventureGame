package com.patika.adventure.game.character;

public class Inventory {
    public boolean m_water = false;
    public boolean m_food = false;
    public boolean m_firewood = false;
    public String m_weaponName = "No Weapon";
    public String m_armorName = "No Armor";
    public  int m_weaponDamage = 0;
    public int m_armorDefence = 0;

    @Override
    public String toString() {
        return "m_water = " + m_water +
                ", m_food = " + m_food +
                ", m_firewood = " + m_firewood + "\n" +
                "m_weaponName = '" + m_weaponName + '\'' +
                ", m_armorName = '" + m_armorName + '\'' + "\n" +
                "m_weaponDamage = " + m_weaponDamage +
                ", m_armorDefence = " + m_armorDefence;
    }
}
