package com.patika.adventure.game.obstacle;

public class Obstacle {
    private int m_id, m_damage, m_money, m_healthy;
    public String m_name;

    public Obstacle(String name)
    {
        m_name = name;
    }
    public int getId()
    {
        return m_id;
    }
    public void setId(int id)
    {
        m_id = id;
    }
    public int getDamage()
    {
        return m_damage;
    }
    public void setDamage(int damage)
    {
        m_damage = damage;
    }
    public int getHealthy()
    {
        return m_healthy;
    }
    public void setHealthy(int healthy)
    {
        m_healthy = healthy;
    }
    public int getMoney()
    {
        return m_money;
    }
    public void setMoney(int money)
    {
        m_money = money;
    }

}
