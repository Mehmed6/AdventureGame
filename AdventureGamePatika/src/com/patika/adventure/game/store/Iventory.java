package com.patika.adventure.game.store;

public class Iventory {
    private int m_id;
    private int m_damage;
    private int m_defence;
    private int m_prise;
    private String m_name;

    public void setId(int id)
    {
        m_id = id;
    }
    public int getId()
    {
        return m_id;
    }
    public void setDamage(int damage)
    {
        m_damage = damage;
    }
    public int getDamage()
    {
        return m_damage;
    }
    public void setDefence(int defence)
    {
        m_defence = defence;
    }
    public int getDefence()
    {
        return m_defence;
    }
    public void setPrice(int money)
    {
        m_prise = money;
    }
    public int getPrice()
    {
        return m_prise;
    }
    public void setName(String name)
    {
        m_name = name;
    }
    public String getName()
    {
        return m_name;
    }
}
